package com.opencagedata.jopencage.model;

/**
 * JOpenCageLicence
 *
 *  @author michael@byteowls.com
 */
public class JOpenCageLicence {

    private String name;
    private String url;

    /**
     * Name
      * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name the license name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * URL
     * @return String the URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set URL
     * @param url the URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
