package com.cmdbms.model;

import java.math.BigDecimal;

public class Electric {

    private Integer eleId;


    private Integer elePlace;


    private BigDecimal eleQuantity;


    private Integer eleMonth;


    private Integer eleYear;


    private String elePlaceType;


    public Electric(Integer eleId, Integer elePlace, BigDecimal eleQuantity, Integer eleMonth, Integer eleYear, String elePlaceType) {
        this.eleId = eleId;
        this.elePlace = elePlace;
        this.eleQuantity = eleQuantity;
        this.eleMonth = eleMonth;
        this.eleYear = eleYear;
        this.elePlaceType = elePlaceType;
    }


    public Electric() {
        super();
    }


    public Integer getEleId() {
        return eleId;
    }


    public void setEleId(Integer eleId) {
        this.eleId = eleId;
    }


    public Integer getElePlace() {
        return elePlace;
    }


    public void setElePlace(Integer elePlace) {
        this.elePlace = elePlace;
    }


    public BigDecimal getEleQuantity() {
        return eleQuantity;
    }


    public void setEleQuantity(BigDecimal eleQuantity) {
        this.eleQuantity = eleQuantity;
    }


    public Integer getEleMonth() {
        return eleMonth;
    }


    public void setEleMonth(Integer eleMonth) {
        this.eleMonth = eleMonth;
    }


    public Integer getEleYear() {
        return eleYear;
    }


    public void setEleYear(Integer eleYear) {
        this.eleYear = eleYear;
    }


    public String getElePlaceType() {
        return elePlaceType;
    }


    public void setElePlaceType(String elePlaceType) {
        this.elePlaceType = elePlaceType == null ? null : elePlaceType.trim();
    }
}