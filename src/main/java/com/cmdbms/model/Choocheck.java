package com.cmdbms.model;

import java.util.Date;

public class Choocheck {

    private Integer id;

    private Integer clasId;

    private Integer stuId;

    private Date applyTime;

    private Boolean pass;

    public Choocheck(Integer id, Integer clasId, Integer stuId, Date applyTime, Boolean pass) {
        this.id = id;
        this.clasId = clasId;
        this.stuId = stuId;
        this.applyTime = applyTime;
        this.pass = pass;
    }


    public Choocheck() {
        super();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClasId() {
        return clasId;
    }


    public void setClasId(Integer clasId) {
        this.clasId = clasId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }
}