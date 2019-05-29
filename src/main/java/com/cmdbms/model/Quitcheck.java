package com.cmdbms.model;

import java.sql.Timestamp;
import java.util.Date;

public class Quitcheck {


    private Integer id;

    private Integer classId;

    private Integer stuId;

    private Timestamp applyTime;

    private Boolean pass;


    public Quitcheck(Integer id, Integer classId, Integer stuId, Timestamp applyTime, Boolean pass) {
        this.id = id;
        this.classId = classId;
        this.stuId = stuId;
        this.applyTime = applyTime;
        this.pass = pass;
    }


    public Quitcheck() {
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

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }
}