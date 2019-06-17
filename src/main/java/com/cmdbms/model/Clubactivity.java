package com.cmdbms.model;

import java.util.Date;

public class Clubactivity {

    private Integer id;


    private Integer clubId;


    private String actDescription;


    private String actLocation;


    private Date actStartTime;


    private Date actStopTime;


    private Boolean actStatus;


    private Boolean reviewStatus;


    public Clubactivity(Integer id, Integer clubId, String actDescription, String actLocation, Date actStartTime, Date actStopTime, Boolean actStatus, Boolean reviewStatus) {
        this.id = id;
        this.clubId = clubId;
        this.actDescription = actDescription;
        this.actLocation = actLocation;
        this.actStartTime = actStartTime;
        this.actStopTime = actStopTime;
        this.actStatus = actStatus;
        this.reviewStatus = reviewStatus;
    }


    public Clubactivity() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getClubId() {
        return clubId;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }


    public String getActDescription() {
        return actDescription;
    }


    public void setActDescription(String actDescription) {
        this.actDescription = actDescription == null ? null : actDescription.trim();
    }


    public String getActLocation() {
        return actLocation;
    }


    public void setActLocation(String actLocation) {
        this.actLocation = actLocation == null ? null : actLocation.trim();
    }


    public Date getActStartTime() {
        return actStartTime;
    }


    public void setActStartTime(Date actStartTime) {
        this.actStartTime = actStartTime;
    }


    public Date getActStopTime() {
        return actStopTime;
    }


    public void setActStopTime(Date actStopTime) {
        this.actStopTime = actStopTime;
    }


    public Boolean getActStatus() {
        return actStatus;
    }


    public void setActStatus(Boolean actStatus) {
        this.actStatus = actStatus;
    }


    public Boolean getReviewStatus() {
        return reviewStatus;
    }


    public void setReviewStatus(Boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
}