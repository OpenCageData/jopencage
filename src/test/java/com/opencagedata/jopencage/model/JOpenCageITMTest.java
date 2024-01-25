package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.JOpenCageException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageITMTest extends JOpenCageBaseApiTest {

    @Test
    public void testITMAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Dublin");
        request.setLimit(1);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            JOpenCageITM itm = r.getAnnotations().getITM();
            assertNotNull(itm);
            break;
        }
    }

}
