package com.cmdbms.model;

import java.util.Date;

public class Violentinfo {

    private Integer id;


    private String behavior;


    private Integer stuId;


    private String vioContent;


    private Integer violentLevel;


    private Date regsterTime;


    public Violentinfo(Integer id, String behavior, Integer stuId, String vioContent, Integer violentLevel, Date regsterTime) {
        this.id = id;
        this.behavior = behavior;
        this.stuId = stuId;
        this.vioContent = vioContent;
        this.violentLevel = violentLevel;
        this.regsterTime = regsterTime;
    }


    public Violentinfo() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getBehavior() {
        return behavior;
    }


    public void setBehavior(String behavior) {
        this.behavior = behavior == null ? null : behavior.trim();
    }


    public Integer getStuId() {
        return stuId;
    }


    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


    public String getVioContent() {
        return vioContent;
    }


    public void setVioContent(String vioContent) {
        this.vioContent = vioContent == null ? null : vioContent.trim();
    }


    public Integer getViolentLevel() {
        return violentLevel;
    }


    public void setViolentLevel(Integer violentLevel) {
        this.violentLevel = violentLevel;
    }


    public Date getRegsterTime() {
        return regsterTime;
    }


    public void setRegsterTime(Date regsterTime) {
        this.regsterTime = regsterTime;
    }
}