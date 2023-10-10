package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.opencagedata.jopencage.support.UnixTimestampDeserializer;

import java.util.Date;

/**
 * JOpenCageSunData
 *
 * @author michael@byteowls.com
 */
public class JOpenCageSunData {

    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    private Date apparent;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    private Date astronomical;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    private Date civil;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    private Date nautical;

    /**
     * Value represents what is typically reported as sunrise/set
     *
     * @return Date
     */
    public Date getApparent() {
        return apparent;
    }

    /**
     * Value represents when sky is completely dark/light
     *
     * @return Date
     */
    public Date getAstronomical() {
        return astronomical;
    }

    /**
     * Value represents when a person can read / no longer read
     *
     * @return Date
     */
    public Date getCivil() {
        return civil;
    }

    /**
     * Value represents when navigation using a sea horizon possible/no longer possible
     *
     * @return Date
     */
    public Date getNautical() {
        return nautical;
    }
}
