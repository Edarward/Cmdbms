package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Output {

    private Integer outputId;


    private Integer outputStoId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date outputTime;


    private String outputPlace;


    private String outputMan;


    private Integer outputNum;


    public Output(Integer outputId, Integer outputStoId, Date outputTime, String outputPlace, String outputMan, Integer outputNum) {
        this.outputId = outputId;
        this.outputStoId = outputStoId;
        this.outputTime = outputTime;
        this.outputPlace = outputPlace;
        this.outputMan = outputMan;
        this.outputNum = outputNum;
    }


    public Output() {
        super();
    }


    public Integer getOutputId() {
        return outputId;
    }


    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }


    public Integer getOutputStoId() {
        return outputStoId;
    }


    public void setOutputStoId(Integer outputStoId) {
        this.outputStoId = outputStoId;
    }


    public Date getOutputTime() {
        return outputTime;
    }


    public void setOutputTime(Date outputTime) {
        this.outputTime = outputTime;
    }


    public String getOutputPlace() {
        return outputPlace;
    }


    public void setOutputPlace(String outputPlace) {
        this.outputPlace = outputPlace == null ? null : outputPlace.trim();
    }


    public String getOutputMan() {
        return outputMan;
    }


    public void setOutputMan(String outputMan) {
        this.outputMan = outputMan == null ? null : outputMan.trim();
    }


    public Integer getOutputNum() {
        return outputNum;
    }


    public void setOutputNum(Integer outputNum) {
        this.outputNum = outputNum;
    }
}