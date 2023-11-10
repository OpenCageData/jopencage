package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.opencagedata.jopencage.support.UnixTimestampDeserializer;

import java.util.Date;

/**
 * JOpenCageTimestamp
 *
 * @author michael@byteowls.com
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageTimestamp {

    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_unix")
    private Date createdAt;

    /**
     * Created At
     * @return Date
     */
    public Date getCreatedAt() {
        return createdAt;
    }

}
