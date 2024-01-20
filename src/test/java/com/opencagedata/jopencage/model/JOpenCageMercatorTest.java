package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.HttpException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageMercatorTest extends JOpenCageBaseApiTest {

    @Test
    public void testMercatorAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("London");
        request.setLimit(1);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (HttpException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            JOpenCageMercator mercator = r.getAnnotations().getMercator();
            assertNotNull(mercator);
        }
    }

}
