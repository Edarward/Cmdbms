package com.cmdbms.model;

import java.sql.Timestamp;
import java.util.Date;

public class Teaarghis {

    private Integer id;

    private Integer classId;

    private Integer teacherId;

    private Timestamp cordYear;

    private Timestamp collegeTime;

    public Teaarghis(Integer id, Integer classId, Integer teacherId, Timestamp cordYear, Timestamp collegeTime) {
        this.id = id;
        this.classId = classId;
        this.teacherId = teacherId;
        this.cordYear = cordYear;
        this.collegeTime = collegeTime;
    }


    public Teaarghis() {
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Timestamp getCordYear() {
        return cordYear;
    }

    public void setCordYear(Timestamp cordYear) {
        this.cordYear = cordYear;
    }

    public Timestamp getCollegeTime() {
        return collegeTime;
    }

    public void setCollegeTime(Timestamp collegeTime) {
        this.collegeTime = collegeTime;
    }
}