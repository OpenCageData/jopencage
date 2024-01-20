package com.opencagedata.jopencage;

public abstract class JOpenCageTestUtils {

    public static final String OPENCAGE_API_KEY = "OPENCAGE_API_KEY";

    public static void freeTrailSleep() {
        try {
            Thread.sleep(50); // free trial accounts are limited to 1 request/second, put back 1000 if running tests returns 429 errors
        } catch (InterruptedException ignore) {}
    }

}
