package com.cmdbms.model;

import java.util.Date;

public class Stuexamarrange {

    private Integer id;


    private Integer stuExamSubId;


    private Date stuExamTime;


    private Integer stuExamClrId;


    private Integer stuExamTeacherId;


    private Integer stuExamStuId;


    public Stuexamarrange(Integer id, Integer stuExamSubId, Date stuExamTime, Integer stuExamClrId, Integer stuExamTeacherId, Integer stuExamStuId) {
        this.id = id;
        this.stuExamSubId = stuExamSubId;
        this.stuExamTime = stuExamTime;
        this.stuExamClrId = stuExamClrId;
        this.stuExamTeacherId = stuExamTeacherId;
        this.stuExamStuId = stuExamStuId;
    }


    public Stuexamarrange() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStuExamSubId() {
        return stuExamSubId;
    }


    public void setStuExamSubId(Integer stuExamSubId) {
        this.stuExamSubId = stuExamSubId;
    }


    public Date getStuExamTime() {
        return stuExamTime;
    }


    public void setStuExamTime(Date stuExamTime) {
        this.stuExamTime = stuExamTime;
    }


    public Integer getStuExamClrId() {
        return stuExamClrId;
    }


    public void setStuExamClrId(Integer stuExamClrId) {
        this.stuExamClrId = stuExamClrId;
    }


    public Integer getStuExamTeacherId() {
        return stuExamTeacherId;
    }


    public void setStuExamTeacherId(Integer stuExamTeacherId) {
        this.stuExamTeacherId = stuExamTeacherId;
    }


    public Integer getStuExamStuId() {
        return stuExamStuId;
    }


    public void setStuExamStuId(Integer stuExamStuId) {
        this.stuExamStuId = stuExamStuId;
    }
}