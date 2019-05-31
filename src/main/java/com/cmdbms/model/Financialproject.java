package com.cmdbms.model;

import java.sql.Timestamp;

public class Financialproject {

    private Integer proId;

    private String proName;

    private String proMoney;

    private Timestamp proStartTime;

    private Timestamp proEndTime;

    public Financialproject(Integer proId, String proName, String proMoney, Timestamp proStartTime, Timestamp proEndTime) {
        this.proId = proId;
        this.proName = proName;
        this.proMoney = proMoney;
        this.proStartTime = proStartTime;
        this.proEndTime = proEndTime;
    }


    public Financialproject() {
        super();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProMoney() {
        return proMoney;
    }

    public void setProMoney(String proMoney) {
        this.proMoney = proMoney == null ? null : proMoney.trim();
    }

    public Timestamp getProStartTime() {
        return proStartTime;
    }

    public void setProStartTime(Timestamp proStartTime) {
        this.proStartTime = proStartTime;
    }

    public Timestamp getProEndTime() {
        return proEndTime;
    }

    public void setProEndTime(Timestamp proEndTime) {
        this.proEndTime = proEndTime;
    }
}