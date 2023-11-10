package com.opencagedata.jopencage.model;

/**
 * JOpenCageBounds
 */
public class JOpenCageBounds {

    private JOpenCageLatLng northeast;
    private JOpenCageLatLng southwest;

    /**
     * get North East bound
     * 
     * @return JOpenCageLatLng
     */
    public JOpenCageLatLng getNortheast() {
        return northeast;
    }

    /**
     * Set the North East bound
     * 
     * @param northeast North East bound
     */
    public void setNortheast(JOpenCageLatLng northeast) {
        this.northeast = northeast;
    }

    /**
     * get South West bound
     * 
     * @return JOpenCageLatLng
     */
    public JOpenCageLatLng getSouthwest() {
        return southwest;
    }

    /**
     * Set the South West bound
     * 
     * @param southwest South West bound
     */
    public void setSouthwest(JOpenCageLatLng southwest) {
        this.southwest = southwest;
    }

}
