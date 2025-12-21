package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.JOpenCageException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageComponentsTest extends JOpenCageBaseApiTest {

    @Test
    public void testTypeComponent() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
        request.setRestrictToCountryCode("at");
        request.setLimit(1);
        request.setNoAnnotations(true);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            assertNotNull(r.getComponents().getType());
        }
    }

    @Test
    public void testComponentVillage() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Kovalivka");
        request.setLimit(1);
        request.setNoAnnotations(true);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            assertNotNull(r.getComponents().getVillage());
        }
    }

    @Test
    void unmappedFields() throws IOException {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
        request.setLimit(1);
        request.setNoAnnotations(true);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        assertNotNull(response.getFirstComponents().getUnmappedFields());
        assertFalse(response.getFirstComponents().getUnmappedFields().isEmpty());
    }

}
