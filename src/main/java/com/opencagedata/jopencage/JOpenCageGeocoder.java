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
    public JOpenCageResponse forward(JOpenCageForwardRequest request) throws JOpenCageException {
        return sendRequest(request);
    }

    /**
     * reverse geocoding
     *
     * @param request the request
     * @return JOpenCageResponse
     */
    public JOpenCageResponse reverse(JOpenCageReverseRequest request) throws JOpenCageException {
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

    private JOpenCageResponse sendRequest(JOpenCageRequest jOpenCageRequest) throws JOpenCageException {
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
                        LOGGER.error("Invalid request (bad request; a required parameter is missing; invalid coordinates; invalid version; invalid format)!");
                        throw new BadRequestException("Invalid request (bad request; a required parameter is missing; invalid coordinates; invalid version; invalid format)!");
                    case 401:
                        LOGGER.error("Unable to authenticate - missing, invalid, or unknown API key!");
                        throw new UnauthenticatedException("Unable to authenticate - missing, invalid, or unknown API key!");
                    case 402:
                        LOGGER.error("Valid request but quota exceeded (payment required)!");
                        throw new QuotaExceededException("Valid request but quota exceeded (payment required)!");
                    case 403:
                        LOGGER.error("Forbidden (API key disabled or IP address rejected)!");
                        throw new ForbiddenException("Forbidden (API key disabled or IP address rejected)!");
                    case 404:
                        LOGGER.error("Invalid API endpoint!");
                        throw new HttpNotFoundException("Invalid API endpoint!");
                    case 405:
                        LOGGER.error("Method not allowed (non-GET request)!");
                        throw new HttpMethodNotAllowedException("Method not allowed (non-GET request)!");
                    case 408:
                        LOGGER.error("Timeout; you can try again!");
                        throw new TimeOutException("Timeout; you can try again!");
                    case 410:
                        LOGGER.error("Request too long!");
                        throw new HttpRequestTooLongException("Request too long!");
                    case 426:
                        LOGGER.error("Upgrade required (unsupported TLS)!");
                        throw new HttpUpgradeRequiredException("Upgrade required (unsupported TLS)!");
                    case 429:
                        LOGGER.error("Too many requests (too quickly, rate limiting)!");
                        throw new TooManyRequestsException("Too many requests (too quickly, rate limiting)!");
                    case 503:
                        LOGGER.error("Internal server error!");
                        throw new HttpServerErrorException("Internal server error!");
                }
            } catch (IOException e) {
                LOGGER.error("I/O Exception", e);
                throw new HttpClientErrorException("I/O Exception", e);
            }
        } else {
            LOGGER.error("No jopencage request url built!");
            throw new HttpClientErrorException("No jopencage request url built!");
        }
        return null;
    }

    /**
     * Is HTTPS enabled?
     *
     * @return boolean
     */
    public boolean isHttpsEnabled() {
        return this.httpsEnabled;
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
        return this.host;
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
        return this.path;
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
        return this.apiKey;
    }

}
