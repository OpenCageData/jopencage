package com.opencagedata.jopencage.model;

/**
 * See https://en.wikipedia.org/wiki/Irish_Transverse_Mercator for more
 * information
 *
 * @author michael@byteowls.com
 */
public class JOpenCageITM {

    private Double easting;
    private Double northing;

    /**
     * Easting
     * 
     * @return Double
     */
    public Double getEasting() {
        return easting;
    }

    /**
     * Northing
     * 
     * @return Double
     */
    public Double getNorthing() {
        return northing;
    }

}
