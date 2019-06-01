package com.cmdbms.model;

import java.sql.Timestamp;

public class Financialconsumables {

    private Integer matId;


    private String matName;


    private String matNumber;


    private Timestamp matStartTime;


    private Timestamp matEndTime;


    private String matLossMoney;


    public Financialconsumables(Integer matId, String matName, String matNumber, Timestamp matStartTime, Timestamp matEndTime, String matLossMoney) {
        this.matId = matId;
        this.matName = matName;
        this.matNumber = matNumber;
        this.matStartTime = matStartTime;
        this.matEndTime = matEndTime;
        this.matLossMoney = matLossMoney;
    }


    public Financialconsumables() {
        super();
    }


    public Integer getMatId() {
        return matId;
    }


    public void setMatId(Integer matId) {
        this.matId = matId;
    }


    public String getMatName() {
        return matName;
    }


    public void setMatName(String matName) {
        this.matName = matName == null ? null : matName.trim();
    }


    public String getMatNumber() {
        return matNumber;
    }


    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber == null ? null : matNumber.trim();
    }


    public Timestamp getMatStartTime() {
        return matStartTime;
    }


    public void setMatStartTime(Timestamp matStartTime) {
        this.matStartTime = matStartTime;
    }


    public Timestamp getMatEndTime() {
        return matEndTime;
    }


    public void setMatEndTime(Timestamp matEndTime) {
        this.matEndTime = matEndTime;
    }


    public String getMatLossMoney() {
        return matLossMoney;
    }


    public void setMatLossMoney(String matLossMoney) {
        this.matLossMoney = matLossMoney == null ? null : matLossMoney.trim();
    }
}