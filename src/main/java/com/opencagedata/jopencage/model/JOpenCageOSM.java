package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JOpenCageOSM
 */
public class JOpenCageOSM {

    private String url;
    @JsonProperty("edit_url")
    private String editUrl;

    /**
     * URL
     *
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set URL
     *
     * @param url URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * EditURL
     *
     * @return String
     *
     */
    public String getEditUrl() {
        return editUrl;
    }

    /**
     * set edit URL
     *
     * @param editUrl URL
     */
    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }
}
