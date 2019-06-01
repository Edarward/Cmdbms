package com.cmdbms.model;

import java.sql.Timestamp;

public class Quitcoure {

    private Integer id;

    private Integer classId;

    private Integer stuId;

    private Timestamp applyTime;

    public Quitcoure(Integer id, Integer classId, Integer stuId, Timestamp applyTime) {
        this.id = id;
        this.classId = classId;
        this.stuId = stuId;
        this.applyTime = applyTime;
    }


    public Quitcoure() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getClassId() {
        return classId;
    }


    public void setClassId(Integer classId) {
        this.classId = classId;
    }


    public Integer getStuId() {
        return stuId;
    }


    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


    public Timestamp getApplyTime() {
        return applyTime;
    }


    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }
}