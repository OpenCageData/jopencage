package com.opencagedata.jopencage.model;


/**
 * The longtiude and latitude of the center point of the result in
 * degree minute decimal second format.
 *
 * @author michael@byteowls.com
 */
public class JOpenCageDMS {

    private String lat;
    private String lng;

    /**
     * Latitude
     * @return String
     */
    public String getLat() {
        return lat;
    }

    /**
     * Longitude
     * @return String
     */
    public String getLng() {
        return lng;
    }

}
