package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.JOpenCageException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageFIPSTest extends JOpenCageBaseApiTest {

    @Test
    public void testFIPSAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("New York");
        request.setLimit(1);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            JOpenCageFIPS fips = r.getAnnotations().getFIPS();
            assertNotNull(fips);
            break;
        }
    }


}
