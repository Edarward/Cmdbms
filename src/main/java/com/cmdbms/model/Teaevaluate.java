package com.cmdbms.model;

import java.sql.Timestamp;

public class Teaevaluate {

    private Integer id;

    private String evaluateLevel;

    private Timestamp evaluateDate;

    private Integer teacherId;

    public Teaevaluate(Integer id, String evaluateLevel, Timestamp evaluateDate, Integer teacherId) {
        this.id = id;
        this.evaluateLevel = evaluateLevel;
        this.evaluateDate = evaluateDate;
        this.teacherId = teacherId;
    }

    public Teaevaluate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvaluateLevel() {
        return evaluateLevel;
    }

    public void setEvaluateLevel(String evaluateLevel) {
        this.evaluateLevel = evaluateLevel == null ? null : evaluateLevel.trim();
    }

    public Timestamp getEvaluateDate() {
        return evaluateDate;
    }

    public void setEvaluateDate(Timestamp evaluateDate) {
        this.evaluateDate = evaluateDate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}