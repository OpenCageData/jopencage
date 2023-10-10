package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * JOpenCageComponents
 *
 * @author michael@byteowls.com
 * @author Erik
 * @author Arnaud
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageComponents {
    @JsonProperty("ISO_3166-1_alpha-2")
    private String iso31661Alpha2;
    @JsonProperty("ISO_3166-1_alpha-3")
    private String iso31661Alpha3;

    @JsonProperty("_type")
    private String type;
    private String continent;
    private String city;
    @JsonProperty("city_district")
    private String cityDistrict;
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    private String county;
    private String pedestrian;
    private String postcode;
    private String road;
    @JsonProperty("road_type")
    private String roadType;
    @JsonProperty("house_number")
    private String houseNumber;
    private String neighbourhood;
    private String state;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("state_district")
    private String stateDistrict;
    private String region;
    @JsonProperty("political_union")
    private String politicalUnion;
    private String suburb;
    private String town;
    private String village;

    private Map<String, Object> unmappedFields;

    /**
     * ISO-3166-1
     * @return String
     * @deprecated use {@link #getIso31661Alpha2()} instead
     */
    public String getISO31661() {
        return iso31661Alpha2;
    }

    /**
     * ISO 3166-1 alpha-2
     * @return String
     */
    public String getIso31661Alpha2() {
        return iso31661Alpha2;
    }

    /**
     * ISO 3166-1 alpha-3
     * @return String
     */
    public String getIso31661Alpha3() {
        return iso31661Alpha3;
    }

    /**
     * Type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Continent
     * @return String
     */
    public String getContinent() {
        return continent;
    }

    /**
     * City
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * City / District
     * @return String
     */
    public String getCityDistrict() {
        return cityDistrict;
    }

    /**
     * Country
     * @return String
     */
    public String getCountry() {
        return country;
    }

    /**
     * Country code
     * @return String
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * County
     * @return String
     */
    public String getCounty() {
        return county;
    }

    /**
     * Pedestrian
     * @return String
     */
    public String getPedestrian() {
        return pedestrian;
    }

    /**
     * Postcode
     * @return String
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Road
     * @return String
     */
    public String getRoad() {
        return road;
    }

    /**
     * Road type
     * @return String
     */
    public String getRoadType() {
        return roadType;
    }

    /**
     * House Number
     * @return String
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Neighbourhood
     * @return String
     */
    public String getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Stage
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * State code
     * @return String
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * State District
     * @return String
     */
    public String getStateDistrict() {
        return stateDistrict;
    }

    /**
     * Region
     * @return String
     */
    public String getRegion() {
        return region;
    }

    /**
     * Political Union
     * @return String
     */
    public String getPoliticalUnion() {
        return politicalUnion;
    }

    /**
     *  Suburb
     * @return String
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Town
     * @return String
     */
    public String getTown() {
        return town;
    }

    /**
     * Village
     * @return String
     */
    public String getVillage() {
        return village;
    }

    /**
     * Fallback map for unmapped fields
     *
     * @param key the key
     * @param value the value
     */
    @JsonAnySetter
    void setUnmappedFields(String key, Object value) {
        if (unmappedFields == null) {
            unmappedFields = new LinkedHashMap<>();
        }
        unmappedFields.put(key, value);
    }

    /**
     * Unmapped Fields
     * @return Map
     */
    public Map<String, Object> getUnmappedFields() {
        return unmappedFields;
    }

}
