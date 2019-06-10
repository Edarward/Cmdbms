package com.cmdbms.model;

import java.util.Date;

public class Examstuarrange {

    private Integer id;


    private Integer stuexamStuId;


    private Integer stuexamSubId;


    private Integer stuexamClrId;


    private Date stuexamDate;


    private Integer stuexamTime;


    private String stuexamClrName;


    private String stuexamSubName;



    public Examstuarrange(Integer id, Integer stuexamStuId, Integer stuexamSubId, Integer stuexamClrId, Date stuexamDate, Integer stuexamTime, String stuexamClrName, String stuexamSubName) {
        this.id = id;
        this.stuexamStuId = stuexamStuId;
        this.stuexamSubId = stuexamSubId;
        this.stuexamClrId = stuexamClrId;
        this.stuexamDate = stuexamDate;
        this.stuexamTime = stuexamTime;
        this.stuexamClrName = stuexamClrName;
        this.stuexamSubName = stuexamSubName;
    }


    public Examstuarrange() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStuexamStuId() {
        return stuexamStuId;
    }


    public void setStuexamStuId(Integer stuexamStuId) {
        this.stuexamStuId = stuexamStuId;
    }


    public Integer getStuexamSubId() {
        return stuexamSubId;
    }


    public void setStuexamSubId(Integer stuexamSubId) {
        this.stuexamSubId = stuexamSubId;
    }


    public Integer getStuexamClrId() {
        return stuexamClrId;
    }


    public void setStuexamClrId(Integer stuexamClrId) {
        this.stuexamClrId = stuexamClrId;
    }


    public Date getStuexamDate() {
        return stuexamDate;
    }


    public void setStuexamDate(Date stuexamDate) {
        this.stuexamDate = stuexamDate;
    }


    public Integer getStuexamTime() {
        return stuexamTime;
    }


    public void setStuexamTime(Integer stuexamTime) {
        this.stuexamTime = stuexamTime;
    }


    public String getStuexamClrName() {
        return stuexamClrName;
    }


    public void setStuexamClrName(String stuexamClrName) {
        this.stuexamClrName = stuexamClrName == null ? null : stuexamClrName.trim();
    }


    public String getStuexamSubName() {
        return stuexamSubName;
    }


    public void setStuexamSubName(String stuexamSubName) {
        this.stuexamSubName = stuexamSubName == null ? null : stuexamSubName.trim();
    }

}