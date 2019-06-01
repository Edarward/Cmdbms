package com.cmdbms.model;

public class Unpass {

    private Integer id;


    private Integer subId;


    private Integer stuId;


    private String stuGrade;


    private Boolean violent;


    public Unpass(Integer id, Integer subId, Integer stuId, String stuGrade, Boolean violent) {
        this.id = id;
        this.subId = subId;
        this.stuId = stuId;
        this.stuGrade = stuGrade;
        this.violent = violent;
    }


    public Unpass() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getSubId() {
        return subId;
    }


    public void setSubId(Integer subId) {
        this.subId = subId;
    }


    public Integer getStuId() {
        return stuId;
    }


    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


    public String getStuGrade() {
        return stuGrade;
    }


    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade == null ? null : stuGrade.trim();
    }


    public Boolean getViolent() {
        return violent;
    }


    public void setViolent(Boolean violent) {
        this.violent = violent;
    }
}