package com.cmdbms.model;

import java.util.Date;

public class Examviolent {

    private Integer id;


    private Integer vioStuId;


    private String vioBehavior;


    private String vioContent;


    private Integer vioLevel;


    private Date vioRegTime;


    public Examviolent(Integer id, Integer vioStuId, String vioBehavior, String vioContent, Integer vioLevel, Date vioRegTime) {
        this.id = id;
        this.vioStuId = vioStuId;
        this.vioBehavior = vioBehavior;
        this.vioContent = vioContent;
        this.vioLevel = vioLevel;
        this.vioRegTime = vioRegTime;
    }


    public Examviolent() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getVioStuId() {
        return vioStuId;
    }


    public void setVioStuId(Integer vioStuId) {
        this.vioStuId = vioStuId;
    }


    public String getVioBehavior() {
        return vioBehavior;
    }


    public void setVioBehavior(String vioBehavior) {
        this.vioBehavior = vioBehavior == null ? null : vioBehavior.trim();
    }


    public String getVioContent() {
        return vioContent;
    }


    public void setVioContent(String vioContent) {
        this.vioContent = vioContent == null ? null : vioContent.trim();
    }


    public Integer getVioLevel() {
        return vioLevel;
    }


    public void setVioLevel(Integer vioLevel) {
        this.vioLevel = vioLevel;
    }


    public Date getVioRegTime() {
        return vioRegTime;
    }


    public void setVioRegTime(Date vioRegTime) {
        this.vioRegTime = vioRegTime;
    }
}