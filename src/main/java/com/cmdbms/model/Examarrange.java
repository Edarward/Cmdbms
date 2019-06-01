package com.cmdbms.model;

import java.util.Date;

public class Examarrange {

    private Integer id;


    private String examName;


    private Integer examSubId;


    private Date examTime;


    private Integer examClassroomId;


    private Integer examTeacherId;


    public Examarrange(Integer id, String examName, Integer examSubId, Date examTime, Integer examClassroomId, Integer examTeacherId) {
        this.id = id;
        this.examName = examName;
        this.examSubId = examSubId;
        this.examTime = examTime;
        this.examClassroomId = examClassroomId;
        this.examTeacherId = examTeacherId;
    }


    public Examarrange() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getExamName() {
        return examName;
    }


    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }


    public Integer getExamSubId() {
        return examSubId;
    }


    public void setExamSubId(Integer examSubId) {
        this.examSubId = examSubId;
    }


    public Date getExamTime() {
        return examTime;
    }


    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }


    public Integer getExamClassroomId() {
        return examClassroomId;
    }


    public void setExamClassroomId(Integer examClassroomId) {
        this.examClassroomId = examClassroomId;
    }


    public Integer getExamTeacherId() {
        return examTeacherId;
    }


    public void setExamTeacherId(Integer examTeacherId) {
        this.examTeacherId = examTeacherId;
    }
}