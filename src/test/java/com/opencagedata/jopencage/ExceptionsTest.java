package com.opencagedata.jopencage;

import com.opencagedata.jopencage.model.JOpenCageForwardRequest;
import com.opencagedata.jopencage.model.JOpenCageReverseRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTest {

    /**
     * Test HTTP 400
     */
    @Test
    public void badRequest() {
        String apiKey = System.getProperty(JOpenCageTestUtils.OPENCAGE_API_KEY);
        if (apiKey == null) {
            apiKey = System.getenv(JOpenCageTestUtils.OPENCAGE_API_KEY);
        }
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
        JOpenCageReverseRequest request = new JOpenCageReverseRequest(6792., 5272.);
        try {
            jOpenCageGeocoder.reverse(request);
        } catch (JOpenCageException e) {
            assertTrue(e instanceof BadRequestException);
        }
    }
    /**
     * Test HTTP 401
     */
    @Test
    public void unauthenticated() {
        String apiKey = "";
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Berlin");
        try {
            jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            assertTrue(e instanceof UnauthenticatedException);
        }
    }
    /**
     * Test HTTP 402
     */
    @Test
    public void quotaExceeded() {
        // API keys for testing https://opencagedata.com/api#testingkeys
        String apiKey = "4372eff77b8343cebfc843eb4da4ddc4";
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Berlin");
        try {
            jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            assertTrue(e instanceof QuotaExceededException);
        }
    }
    /**
     * Test HTTP 403
     */
    @Test
    public void forbidden() {
        // API keys for testing https://opencagedata.com/api#testingkeys
        String apiKey = "2e10e5e828262eb243ec0b54681d699a";
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Berlin");
        try {
            jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            assertTrue(e instanceof ForbiddenException);
        }
    }
    /**
     * Test HTTP 404
     */

    /**
     * Test HTTP 405
     */

    /**
     * Test HTTP 408
     */

    /**
     * Test HTTP 410
     */

    /**
     * Test HTTP 426
     */

    /**
     * Test HTTP 429
     */
    @Test
    public void tooManyRequests() {
        // API keys for testing https://opencagedata.com/api#testingkeys
        String apiKey = "d6d0f0065f4348a4bdfe4587ba02714b";
        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Berlin");
        try {
            jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            assertTrue(e instanceof TooManyRequestsException);
        }
    }
    /**
     * Test HTTP 503
     */
}
