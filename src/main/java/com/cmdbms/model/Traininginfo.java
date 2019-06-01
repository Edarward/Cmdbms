package com.cmdbms.model;

import java.util.Date;

public class Traininginfo {

    private Integer staffId;


    private String traingInfo;


    private Date startDate;


    private Date endDate;


    public Traininginfo(Integer staffId, String traingInfo, Date startDate, Date endDate) {
        this.staffId = staffId;
        this.traingInfo = traingInfo;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Traininginfo() {
        super();
    }


    public Integer getStaffId() {
        return staffId;
    }


    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }


    public String getTraingInfo() {
        return traingInfo;
    }


    public void setTraingInfo(String traingInfo) {
        this.traingInfo = traingInfo == null ? null : traingInfo.trim();
    }


    public Date getStartDate() {
        return startDate;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date getEndDate() {
        return endDate;
    }


    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}