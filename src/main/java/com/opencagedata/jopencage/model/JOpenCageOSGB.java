package com.opencagedata.jopencage.model;

/**
 * See https://en.wikipedia.org/wiki/Ordnance_Survey_National_Grid for more
 * information
 */
public class JOpenCageOSGB {

    private Double easting;
    private String gridref;
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
     * Grid Ref
     * 
     * @return String
     */
    public String getGridref() {
        return gridref;
    }

    /**
     * Northing
     * 
     * @return Double
     */
    public Double getNorthing() {
        return northing;
    }

    @Override
    public String toString() {
        return "JOpenCageOSGB{" +
                "easting=" + easting +
                ", gridref='" + gridref + '\'' +
                ", northing=" + northing +
                '}';
    }
}
