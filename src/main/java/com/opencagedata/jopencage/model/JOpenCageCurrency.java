package com.opencagedata.jopencage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * JOpenCageCurrency
 *
 * @author michael@byteowls.com
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageCurrency {

    @JsonProperty("alternate_symbols")
    private List<String> alternateSymbols;
    @JsonProperty("decimal_mark")
    private String decimalMark;
    @JsonProperty("html_entity")
    private String htmlEntity;
    @JsonProperty("iso_code")
    private String isoCode;
    @JsonProperty("iso_numeric")
    private int isoNumeric;
    private String name;
    @JsonProperty("smallest_denomination")
    private int smallestDenomination;
    private String subunit;
    @JsonProperty("subunit_to_unit")
    private int subunitToUnit;
    private String symbol;
    @JsonProperty("symbol_first")
    private boolean symbolFirst;
    @JsonProperty("thousands_separator")
    private String thousandsSeparator;

    /**
     * Alternate Symbols
     * 
     * @return List
     */
    public List<String> getAlternateSymbols() {
        return alternateSymbols;
    }

    /**
     * Decimal Mark
     * 
     * @return String
     */
    public String getDecimalMark() {
        return decimalMark;
    }

    /**
     * Html Entity
     * 
     * @return String
     */
    public String getHtmlEntity() {
        return htmlEntity;
    }

    /**
     * ISO Code
     * 
     * @return String
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * ISO Numeric
     * 
     * @return int
     */
    public int getIsoNumeric() {
        return isoNumeric;
    }

    /**
     * Name
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Smallest Denomination
     * 
     * @return int
     */
    public int getSmallestDenomination() {
        return smallestDenomination;
    }

    /**
     * Sub unit
     * 
     * @return String
     */
    public String getSubunit() {
        return subunit;
    }

    /**
     * Subunit to Unit
     * 
     * @return int
     */
    public int getSubunitToUnit() {
        return subunitToUnit;
    }

    /**
     * Symbol
     * 
     * @return String
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * is Symbol first?
     * 
     * @return boolean
     */
    public boolean isSymbolFirst() {
        return symbolFirst;
    }

    /**
     * The thousand separator
     * 
     * @return String
     */
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }
}
