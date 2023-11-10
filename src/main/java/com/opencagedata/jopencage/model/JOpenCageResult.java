package com.opencagedata.jopencage.model;

/**
 * JOpenCageResult
 */
public class JOpenCageResult implements Comparable<JOpenCageResult> {

    private JOpenCageAnnotations annotations;
    private JOpenCageBounds bounds;
    private JOpenCageComponents components;
    private int confidence;
    private String formatted;
    private JOpenCageLatLng geometry;

    /**
     * Annotations
     * 
     * @return JOpenCageAnnotations
     */
    public JOpenCageAnnotations getAnnotations() {
        return annotations;
    }

    /**
     * Bounds
     * 
     * @return JOpenCageBounds
     */
    public JOpenCageBounds getBounds() {
        return bounds;
    }

    /**
     * Components
     * 
     * @return JOpenCageComponents
     */
    public JOpenCageComponents getComponents() {
        return components;
    }

    /**
     * Confidence
     * 
     * @return int
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * Formatted
     * 
     * @return String
     */
    public String getFormatted() {
        return formatted;
    }

    /**
     * Geometry
     * 
     * @return JOpenCageLatLng
     */
    public JOpenCageLatLng getGeometry() {
        return geometry;
    }

    @Override
    public int compareTo(JOpenCageResult o) {
        return Integer.valueOf(this.confidence).compareTo(o.getConfidence());
    }

}
