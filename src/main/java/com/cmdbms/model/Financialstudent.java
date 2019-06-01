package com.cmdbms.model;

import java.sql.Timestamp;

public class Financialstudent {

    private Integer stuId;

    private Integer proId;

    private Timestamp proTime;

    private String proState;

    public Financialstudent(Integer stuId, Integer proId,  Timestamp proTime, String proState) {
        this.stuId = stuId;
        this.proId = proId;
        this.proTime = proTime;
        this.proState = proState;
    }

    public Financialstudent() {
        super();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Timestamp getProTime() {
        return proTime;
    }

    public void setProTime(Timestamp proTime) {
        this.proTime = proTime;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState == null ? null : proState.trim();
    }
}