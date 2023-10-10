package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * JOpenCageTimeZone
 *
 * @author michael@byteowls.com
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageTimeZone {

    private String name;
    @JsonProperty("now_in_dst")
    private int nowInDst;
    @JsonProperty("offset_sec")
    private int offsetSec;
    @JsonProperty("offset_string")
    private int offsetString;
    @JsonProperty("short_name")
    private String shortName;

    /**
     * Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Now in DST
     * @return int
     */
    public int getNowInDst() {
        return nowInDst;
    }

    /**
     * Offset Sec
     * @return int
     */
    public int getOffsetSec() {
        return offsetSec;
    }

    /**
     * Offset
     * @return int
     */
    public int getOffsetString() {
        return offsetString;
    }

    /**
     * Short name
     * @return String
     */
    public String getShortName() {
        return shortName;
    }


}
