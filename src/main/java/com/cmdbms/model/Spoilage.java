package com.cmdbms.model;

import java.util.Date;

public class Spoilage {

    private Integer spoId;


    private String spoEquipment;


    private Integer spoAmount;


    private String spoPlace;


    private Date spoTime;


    public Spoilage(Integer spoId, String spoEquipment, Integer spoAmount, String spoPlace, Date spoTime) {
        this.spoId = spoId;
        this.spoEquipment = spoEquipment;
        this.spoAmount = spoAmount;
        this.spoPlace = spoPlace;
        this.spoTime = spoTime;
    }


    public Spoilage() {
        super();
    }


    public Integer getSpoId() {
        return spoId;
    }


    public void setSpoId(Integer spoId) {
        this.spoId = spoId;
    }


    public String getSpoEquipment() {
        return spoEquipment;
    }


    public void setSpoEquipment(String spoEquipment) {
        this.spoEquipment = spoEquipment == null ? null : spoEquipment.trim();
    }


    public Integer getSpoAmount() {
        return spoAmount;
    }


    public void setSpoAmount(Integer spoAmount) {
        this.spoAmount = spoAmount;
    }


    public String getSpoPlace() {
        return spoPlace;
    }


    public void setSpoPlace(String spoPlace) {
        this.spoPlace = spoPlace == null ? null : spoPlace.trim();
    }


    public Date getSpoTime() {
        return spoTime;
    }


    public void setSpoTime(Date spoTime) {
        this.spoTime = spoTime;
    }
}