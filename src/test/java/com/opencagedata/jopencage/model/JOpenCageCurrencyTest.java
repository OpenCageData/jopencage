package com.opencagedata.jopencage.model;

import com.opencagedata.jopencage.JOpenCageException;
import com.opencagedata.jopencage.JOpenCageBaseApiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JOpenCageCurrencyTest extends JOpenCageBaseApiTest {

    @Test
    public void testCurrencyAnnotation() {
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Bern");
        request.setLimit(1);

        JOpenCageResponse response = null;
        try {
            response = jOpenCageGeocoder.forward(request);
        } catch (JOpenCageException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(response);

        for (JOpenCageResult r : response.getResults()) {
            JOpenCageCurrency currency = r.getAnnotations().getCurrency();
            assertTrue(currency.getName().equalsIgnoreCase("Swiss Franc"));
            assertEquals(currency.getIsoNumeric(), 756);
            assertEquals(currency.getSmallestDenomination(), 5);
            assertTrue(currency.isSymbolFirst());
            break;
        }
    }

}
