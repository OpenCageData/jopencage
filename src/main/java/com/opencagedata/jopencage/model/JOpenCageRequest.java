package com.opencagedata.jopencage.model;

import java.util.HashMap;
import java.util.Map;

/**
 * JOpenCageRequest
 *
 * @author moberwasserlechner
 */
public abstract class JOpenCageRequest {

    private String subkey;
    private String language; // defaults to en
    private Integer limit;
    private Integer minConfidence;
    private boolean noAnnotations;
    private boolean noDedupe;
    private boolean pretty;
    private boolean abbrv;
    private boolean noRecord;
    private boolean onlyNominatim;
    private boolean roadinfo;
    private boolean addressOnly;
    private boolean addRequest;

    public Map<String, String> getParameter() {
        Map<String, String> parameter = new HashMap<>();
        if (subkey != null) {
            parameter.put("subkey", subkey);
        }

        parameter.put("language", language);

        if (limit != null) {
            parameter.put("limit", String.valueOf(limit));
        }
        if (minConfidence != null) {
            parameter.put("min_confidence", String.valueOf(minConfidence));
        }
        if (noAnnotations) {
            parameter.put("no_annotations", "1");
        }
        if (noDedupe) {
            parameter.put("no_dedupe", "1");
        }
        if (pretty) {
            parameter.put("pretty", "1");
        }
        if (abbrv) {
            parameter.put("abbrv", "1");
        }
        if (noRecord) {
            parameter.put("no_record", "1");
        }
        if (onlyNominatim) {
            parameter.put("only_nominatim", "1");
        }
        if (roadinfo) {
            parameter.put("roadinfo", "1");
        }
        if (addressOnly) {
            parameter.put("address_only", "1");
        }
        if (addRequest) {
            parameter.put("add_request", "1");
        }
        return parameter;
    }

    /**
     * SubKey
     *
     * @return String
     */
    public String getSubkey() {
        return subkey;
    }

    /**
     * A unique id of your choosing (can contain only A-Za-z0-9 and with a maximum
     * length of 20 characters).
     * The subkey is ignored by the geocoder but can be used for reporting. Not
     * currently in use, but coming soon.
     *
     * @param subkey SubKey
     */
    public void setSubkey(String subkey) {
        this.subkey = subkey;
    }

    /**
     * The language
     *
     * @return String
     */
    public String getLanguage() {
        return language;
    }

    /**
     * An IETF format language code (such as es for Spanish or pt-BR for Brazilian
     * Portuguese); if this is omitted a code of en (English) will be assumed
     *
     * @param language the language code
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Limit
     *
     * @return Integer
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * How many results should be returned. Default is 10.
     *
     * @param limit maximum number of results.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Min Confidence
     *
     * @return Integer
     */
    public Integer getMinConfidence() {
        return minConfidence;
    }

    /**
     * An integer from 1-10 only results with at least this confidence will be
     * returned.
     *
     * @param minConfidence minimum confidence that the result matches
     */
    public void setMinConfidence(Integer minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * No Annotation
     *
     * @return boolean
     */
    public boolean isNoAnnotations() {
        return noAnnotations;
    }

    /**
     * If set to true the results will not contain annotations.
     *
     * @param noAnnotations If true no annotations are included. Defaults to false.
     */
    public void setNoAnnotations(boolean noAnnotations) {
        this.noAnnotations = noAnnotations;
    }

    /**
     * No Dedupe
     *
     * @return boolean
     */
    public boolean isNoDedupe() {
        return noDedupe;
    }

    /**
     * If set to true the results will not be deduplicated.
     *
     * @param noDedupe When set to true results will not be deduplicated. Defaults
     *                 to false.
     */
    public void setNoDedupe(boolean noDedupe) {
        this.noDedupe = noDedupe;
    }

    /**
     * Pretty
     *
     * @return boolean
     */
    public boolean isPretty() {
        return pretty;
    }

    /**
     * If set to true pretty printing of the response payload is enabled.
     *
     * @param pretty If true the response will be pretty formatted.
     */
    public void setPretty(boolean pretty) {
        this.pretty = pretty;
    }

    /**
     * Abbrv
     *
     * @return boolean
     */
    public boolean isAbbrv() {
        return abbrv;
    }

    /**
     * If true it is attempted to abbreviate and shorten the formatted string
     * returned.
     *
     * @param abbrv if true, API will attempt to shorten or abbreviate the formatted
     *              value. Details.
     */
    public void setAbbrv(boolean abbrv) {
        this.abbrv = abbrv;
    }

    public boolean isNoRecord() {
        return noRecord;
    }

    /**
     * If set to true the query contents are not logged.
     * Please use if you have concerns about privacy and want us to have no record
     * of your query.
     *
     * @param noRecord When set to true the query contents are not logged.
     */
    public void setNoRecord(boolean noRecord) {
        this.noRecord = noRecord;
    }

    /**
     * isOnlyNominatim
     *
     * @return boolean
     */
    public boolean isOnlyNominatim() {
        return onlyNominatim;
    }

    /**
     * @param onlyNominatim onlyNominatim
     */
    public void setOnlyNominatim(boolean onlyNominatim) {
        this.onlyNominatim = onlyNominatim;
    }

    /**
     * isRoadinfo
     *
     * @return boolean
     */
    public boolean isRoadinfo() {
        return roadinfo;
    }

    /**
     * Sets the requests with roadinfo parameter
     * When set to true the behaviour of the geocoder is changed to attempt to match the nearest road (as opposed to address).
     *
     * @param roadinfo roadinfo input parameter
     */
    public void setRoadinfo(boolean roadinfo) {
        this.roadinfo = roadinfo;
    }

    /**
     * isAddressOnly
     *
     * @return boolean
     */
    public boolean isAddressOnly() {
        return addressOnly;
    }

    /**
     * Set the requests with address_only
     * When set to true we include only the address (exluding POI names) in the formatted string we return.
     *
     * @param addressOnly addressOnly input parameter
     */
    public void setAddressOnly(boolean addressOnly) {
        this.addressOnly = addressOnly;
    }

    /**
     * isAddRequest
     *
     * @return boolean
     */
    public boolean isAddRequest() {
        return addRequest;
    }

    /**
     * Set the requests with add_request
     * When set to 1 the various request parameters are added to the response for ease of debugging.
     *
     * @param addRequest addRequest
     */
    public void setAddRequest(boolean addRequest) {
        this.addRequest = addRequest;
    }
}
