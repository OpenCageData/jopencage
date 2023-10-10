package com.opencagedata.jopencage.model;


/**
 * JOpenCageLatLng
 *
 * @author michael@byteowls.com
 */
public class JOpenCageLatLng {

    private Double lat;
    private Double lng;

    /**
     * Latitude
     * @return Double
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Set Latitude
     * @param lat the latitude
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * Longitude
     * @return Double
     */
    public Double getLng() {
        return lng;
    }

    /**
     * Set Longitude
     * @param lng the longitude
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

}
