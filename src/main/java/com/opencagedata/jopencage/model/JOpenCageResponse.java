package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

/**
 * JOpenCageResponse
 */
@JsonInclude(Include.NON_NULL)
public class JOpenCageResponse {

    private String documentation;

    private List<JOpenCageLicence> licenses;
    private JOpenCageRate rate;
    private List<JOpenCageResult> results;
    private JOpenCageStatus status;

    @JsonProperty("stay_informed")
    private JOpenCageStayInformed stayInformed;

    private String thanks;
    private JOpenCageTimestamp timestamp;
    @JsonProperty("total_results")
    private int totalResults;

    /**
     * getDocumentation
     * 
     * @return String
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Licenses
     * 
     * @return List
     */
    public List<JOpenCageLicence> getLicenses() {
        return licenses;
    }

    /**
     * Rate
     * 
     * @return JOpenCageRate
     */
    public JOpenCageRate getRate() {
        return rate;
    }

    /**
     * Results
     * 
     * @return List
     */
    public List<JOpenCageResult> getResults() {
        return results;
    }

    /**
     * Status
     * 
     * @return JOpenCageStatus
     */
    public JOpenCageStatus getStatus() {
        return status;
    }

    /**
     * Thanks
     * 
     * @return String
     */
    public String getThanks() {
        return thanks;
    }

    /**
     * Timestamp
     * 
     * @return JOpenCageTimestamp
     */
    public JOpenCageTimestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Total Results
     * 
     * @return int
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * orderResultByConfidence
     */
    public void orderResultByConfidence() {
        Collections.sort(this.results);
        Collections.reverse(this.results);
    }

    /**
     * First Position
     * 
     * @return JOpenCageLatLng
     */
    public JOpenCageLatLng getFirstPosition() {
        if (this.results != null) {
            orderResultByConfidence();
            for (JOpenCageResult r : this.results) {
                return r.getGeometry();
            }
        }
        return null;
    }

    /**
     * First Components
     * 
     * @return JOpenCageComponents
     */
    public JOpenCageComponents getFirstComponents() {
        if (this.results != null) {
            orderResultByConfidence();
            for (JOpenCageResult r : this.results) {
                return r.getComponents();
            }
        }
        return null;
    }

}
