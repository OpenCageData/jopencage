package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Annotations supplies additional information about the result location.
 * <p>
 * see https://opencagedata.com/api#annotations for details.
 *
 * @author michael@byteowls.com
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageAnnotations {

    // DMS
    @JsonProperty("DMS")
    private JOpenCageDMS DMS;

    @JsonProperty("ITM")
    private JOpenCageITM ITM;

    @JsonProperty("MGRS")
    private String MGRS;

    @JsonProperty("Maidenhead")
    private String maidenhead;

    @JsonProperty("Mercator")
    private JOpenCageMercator mercator;

    @JsonProperty("OSGB")
    private JOpenCageOSGB OSGB;

    @JsonProperty("OSM")
    private JOpenCageOSM OSM;

    @JsonProperty("FIPS")
    private JOpenCageFIPS FIPS;

    /**
     * the telephone calling code for the country of the result.
     */
    @JsonProperty("callingcode")
    private int telephoneCallingCode;

    private JOpenCageCurrency currency;

    @JsonProperty("geohash")
    private String geoHash;

    @JsonProperty("timezone")
    private JOpenCageTimeZone timeZone;

    private JOpenCageWhat3Words what3words;

    private String wikidata;

    private Double qibla;

    private JOpenCageSun sun;

    /**
     * The latitude and longitude of the center point of the result in degree minute
     * decimal second format.
     * 
     * @return JOpenCageDMS
     */
    public JOpenCageDMS getDMS() {
        return DMS;
    }

    /**
     * Contains a Military Grid Reference System code for the center point of the
     * result. WGS84 datum.
     * 
     * @return String
     */
    public String getMGRS() {
        return MGRS;
    }

    /**
     * Contains a Maidenhead location reference for the center point of the result.
     * 
     * @return String
     */
    public String getMaidenhead() {
        return maidenhead;
    }

    /**
     * Contains the Mercator projection (EPSG 3857, sometimes also referred to as
     * "Spherical Mercator") x and y unit meter values of the center point of the
     * result.
     * <p>
     * Note: use of Mercator projection on latitudes above/below +70/-70 degrees is
     * strongly discouraged, due to the gross distortions of the projection.
     * 
     * @return JOpenCageMercator
     */
    public JOpenCageMercator getMercator() {
        return mercator;
    }

    /**
     * Contains the Ordnance Survey National Grid easting , northing , and gridref
     * of the center point of the result.
     * This annotation is applied only for locations in Great Britain.
     * 
     * @return JOpenCageOSGB
     */
    public JOpenCageOSGB getOSGB() {
        return OSGB;
    }

    /**
     * Contains a key url with an HTTPS url for looking at the center point of the
     * result on openstreetmap.org.
     * <p>
     * May also contain a editUrl with an HTTPS url for editing the result on
     * openstreetmap.org.
     * <p>
     * Note that you may need to zoom in or out to edit and in doing so focus may
     * shift to a different element.
     * 
     * @return JOpenCageOSM
     */
    public JOpenCageOSM getOSM() {
        return OSM;
    }

    /**
     * The telephone calling code for the country of the result.
     * 
     * @return int
     */
    public int getTelephoneCallingCode() {
        return telephoneCallingCode;
    }

    /**
     * Information about the local currency
     * 
     * @return JOpenCageCurrency
     */
    public JOpenCageCurrency getCurrency() {
        return currency;
    }

    /**
     * Contains a geohash for the center point of the result.
     * 
     * @return String
     */
    public String getGeoHash() {
        return geoHash;
    }

    /**
     * Information about the time zone of the location.
     *
     * @return JOpenCageTimeZone
     */
    public JOpenCageTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * what3word 3 word address.
     * <p>
     * By default, the words returned are in English, but if the query contained the
     * optional language and it is a language what3words supports, the words will be
     * in that language.
     * 
     * @return JOpenCageWhat3Words
     */
    public JOpenCageWhat3Words getWhat3words() {
        return what3words;
    }

    /**
     * Wikidata item for the location. A Wikidata item is a unique identifier used
     * by the Wikimedia Foundation and others.
     * 
     * @return String
     */
    public String getWikidata() {
        return wikidata;
    }

    /**
     * Decimal degrees clockwise from true north to turn to point to the Kaaba
     * (21.4225,39.8262). Calculated using the great circle method.
     * 
     * @return Double
     */
    public Double getQibla() {
        return qibla;
    }

    /**
     * Various sun rising and set values.
     * 
     * @return JOpenCageSun
     */
    public JOpenCageSun getSun() {
        return sun;
    }

    /**
     * Contains the Irish Transverse Mercator easting and northing of the center
     * point of the result. This annotation is applied only for locations in
     * Ireland.
     * 
     * @return JOpenCageITM
     */
    public JOpenCageITM getITM() {
        return ITM;
    }

    /**
     * Contains the US Federal Information Processing Standards (FIPS) code for the
     * state (two digit) and county (five digit) of the center point of the result,
     * if we can determine it. This annotation is applied only for locations in the
     * United States and associated territories. The values are strings - not
     * numbers - and can have leading zeros.
     * 
     * @return JOpenCageFIPS
     */
    public JOpenCageFIPS getFIPS() {
        return FIPS;
    }
}
