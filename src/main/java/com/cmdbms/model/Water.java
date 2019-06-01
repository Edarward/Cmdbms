package com.cmdbms.model;

import java.math.BigDecimal;

public class Water {

    private Integer watId;


    private String watPlace;


    private BigDecimal watQuantity;


    private Integer watMonth;


    private Integer watYear;


    private String watPlaceType;


    public Water(Integer watId, String watPlace, BigDecimal watQuantity, Integer watMonth, Integer watYear, String watPlaceType) {
        this.watId = watId;
        this.watPlace = watPlace;
        this.watQuantity = watQuantity;
        this.watMonth = watMonth;
        this.watYear = watYear;
        this.watPlaceType = watPlaceType;
    }


    public Water() {
        super();
    }


    public Integer getWatId() {
        return watId;
    }


    public void setWatId(Integer watId) {
        this.watId = watId;
    }


    public String getWatPlace() {
        return watPlace;
    }


    public void setWatPlace(String watPlace) {
        this.watPlace = watPlace == null ? null : watPlace.trim();
    }


    public BigDecimal getWatQuantity() {
        return watQuantity;
    }


    public void setWatQuantity(BigDecimal watQuantity) {
        this.watQuantity = watQuantity;
    }


    public Integer getWatMonth() {
        return watMonth;
    }


    public void setWatMonth(Integer watMonth) {
        this.watMonth = watMonth;
    }


    public Integer getWatYear() {
        return watYear;
    }


    public void setWatYear(Integer watYear) {
        this.watYear = watYear;
    }


    public String getWatPlaceType() {
        return watPlaceType;
    }


    public void setWatPlaceType(String watPlaceType) {
        this.watPlaceType = watPlaceType == null ? null : watPlaceType.trim();
    }
}