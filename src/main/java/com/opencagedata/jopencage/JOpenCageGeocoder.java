package com.opencagedata.jopencage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map.Entry;

import org.apache.hc.client5.http.HttpResponseException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.AbstractHttpClientResponseHandler;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.net.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencagedata.jopencage.model.JOpenCageForwardRequest;
import com.opencagedata.jopencage.model.JOpenCageRequest;
import com.opencagedata.jopencage.model.JOpenCageResponse;
import com.opencagedata.jopencage.model.JOpenCageReverseRequest;

/**
 * JOpenCageGeocoder
 *
 * @author michael@byteowls.com
 */
public class JOpenCageGeocoder {

    private final static Logger LOGGER = LoggerFactory.getLogger(JOpenCageGeocoder.class);

    private final static String OPENCAGE_HOST = "api.opencagedata.com";
    private final static String OPENCAGE_PATH = "/geocode/v1/";

    private boolean httpsEnabled = true;
    private String host = OPENCAGE_HOST;
    private String path = OPENCAGE_PATH;
    private String format = "json";
    private String apiKey;
    private String userAgent;

    /**
     * JOpenCageGeocoder
     *
     * @param apiKey your Opencage Data API Key
     */
    public JOpenCageGeocoder(String apiKey) {
        this.apiKey = apiKey;
        String packageVersion = this.getClass().getPackage().getImplementationVersion();
        StringBuilder userAgentBuilder = new StringBuilder("jOpenCage/");
        if (packageVersion != null) {
            userAgentBuilder.append(packageVersion);
        }
        this.userAgent = userAgentBuilder.toString();
    }

    /**
     * forward geocoding
     *
     * @param request the request
     * @return JOpenCageResponse
     */
    public JOpenCageResponse forward(JOpenCageForwardRequest request) {
        return sendRequest(request);
    }

    /**
     * reverse geocoding
     *
     * @param request the request
     * @return JOpenCageResponse
     */
    public JOpenCageResponse reverse(JOpenCageReverseRequest request) {
        return sendRequest(request);
    }

    /**
     * buildUri
     *
     * @param jOpenCageRequest the request
     * @return URI
     * @throws URISyntaxException an syntax exception
     */
    public URI buildUri(JOpenCageRequest jOpenCageRequest) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder();
        if (httpsEnabled) {
            uriBuilder.setScheme("https");
        } else {
            uriBuilder.setScheme("http");
        }
        uriBuilder.setHost(host)
                .setPath(path + format);

        for (Entry<String, String> e : jOpenCageRequest.getParameter().entrySet()) {
            if (e.getValue() != null) {
                uriBuilder.setParameter(e.getKey(), e.getValue());
            }
        }
        uriBuilder.setParameter("key", apiKey);
        return uriBuilder.build();
    }

    private JOpenCageResponse sendRequest(JOpenCageRequest jOpenCageRequest) {
        URI url = null;
        try {
            url = buildUri(jOpenCageRequest);
            LOGGER.info("JOpencage request url '{}'", url);
        } catch (URISyntaxException e1) {
            LOGGER.error("", e1);
        }

        if (url != null) {
            try (CloseableHttpClient httpclient = HttpClientBuilder.create().build()) {
                HttpGet getRequest = new HttpGet(url);
                getRequest.setHeader("User-Agent", this.userAgent);

                HttpClientResponseHandler<JOpenCageResponse> rh = new AbstractHttpClientResponseHandler<JOpenCageResponse>() {
                    @Override
                    public JOpenCageResponse handleEntity(HttpEntity entity) throws IOException {
                        ObjectMapper mapper = new ObjectMapper();
                        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                        return mapper.readValue(entity.getContent(), JOpenCageResponse.class);
                    }
                };

                return httpclient.execute(getRequest, rh);
            } catch (HttpResponseException e) {
                switch (e.getStatusCode()) {
                    case 400:
                        LOGGER.error("Invalid request (bad request; a required parameter is missing)!");
                        break;
                    case 402:
                        LOGGER.error("Valid request but quota exceeded (payment required)!");
                        break;
                    case 403:
                        LOGGER.error("Invalid or missing api key!");
                        break;
                    case 404:
                        LOGGER.error("Invalid API endpoint!");
                        break;
                    case 408:
                        LOGGER.error("Timeout; you can try again!");
                        break;
                    case 410:
                        LOGGER.error("Request too long!");
                        break;
                }
            } catch (IOException e) {
                LOGGER.error("", e);
            }
        } else {
            LOGGER.error("No jopencage request url build!");
        }
        return null;
    }

    /**
     * Is HTTPS enabled?
     *
     * @return boolean
     */
    public boolean isHttpsEnabled() {
        return httpsEnabled;
    }

    /**
     * Toggle HTTPS usage
     *
     * @param httpsEnabled enable or disable the HTTPS usage
     */
    public void setHttpsEnabled(boolean httpsEnabled) {
        this.httpsEnabled = httpsEnabled;
    }

    /**
     * API Host
     *
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * Set API Host
     *
     * @param host the host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * API path
     *
     * @return String the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Set API path
     *
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * API Key
     *
     * @return String the API Key
     */
    public String getApiKey() {
        return apiKey;
    }

}
