package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.JOpenCageException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageAnnotationsTest extends JOpenCageBaseApiTest {

    @Test
    public void testAnnotationIncluded() {
        JOpenCageReverseRequest request = new JOpenCageReverseRequest(-22.6792, 14.5272);
        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.reverse(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            assertNotNull(r.getAnnotations());
        }
    }

    @Test
    public void testQiblaAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
        request.setRestrictToCountryCode("at");
        request.setLimit(1);
        request.setNoAnnotations(false);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            Double qibla = r.getAnnotations().getQibla();
            assertNotNull(qibla);
            assertTrue(qibla >= 0 && qibla <= 360);
        }
    }

    @Test
    public void testWikiDataAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
        request.setRestrictToCountryCode("at");
        request.setLimit(1);
        request.setNoAnnotations(false);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            assertNotNull(r.getAnnotations().getWikidata());
        }
    }

}
