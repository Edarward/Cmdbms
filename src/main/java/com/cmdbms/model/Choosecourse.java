package com.cmdbms.model;

import java.sql.Timestamp;

public class Choosecourse {

    private Integer id;

    private Integer classId;

    private Integer stuID;

    private Timestamp applytime;


    public Choosecourse(Integer id, Integer classId, Integer stuID, Timestamp applytime) {
        this.id = id;
        this.classId = classId;
        this.stuID = stuID;
        this.applytime = applytime;
    }


    public Choosecourse() {
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



    public Integer getStuID() {
        return stuID;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }



    public Timestamp getApplytime() {
        return applytime;
    }

    public void setApplytime(Timestamp applytime) {
        this.applytime = applytime;
    }
}