package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Examgrade {

    private Integer id;


    private Integer gradeStuId;


    private Integer gradeSubId;


    private Integer gradeStu;


    private String gradeSubName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date gradeLimit;


    private Integer gradeJudge;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gradeAlterTime;


    private Integer gradeViolate;


    private Integer gradeReview;


    private String gradeMajor;


    private Integer gradeYear;


    public Examgrade(Integer id, Integer gradeStuId, Integer gradeSubId, Integer gradeStu, String gradeSubName, Date gradeLimit, Integer gradeJudge, Date gradeAlterTime, Integer gradeViolate, Integer gradeReview, String gradeMajor, Integer gradeYear) {
        this.id = id;
        this.gradeStuId = gradeStuId;
        this.gradeSubId = gradeSubId;
        this.gradeStu = gradeStu;
        this.gradeSubName = gradeSubName;
        this.gradeLimit = gradeLimit;
        this.gradeJudge = gradeJudge;
        this.gradeAlterTime = gradeAlterTime;
        this.gradeViolate = gradeViolate;
        this.gradeReview = gradeReview;
        this.gradeMajor = gradeMajor;
        this.gradeYear = gradeYear;
    }


    public Examgrade() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getGradeStuId() {
        return gradeStuId;
    }


    public void setGradeStuId(Integer gradeStuId) {
        this.gradeStuId = gradeStuId;
    }


    public Integer getGradeSubId() {
        return gradeSubId;
    }


    public void setGradeSubId(Integer gradeSubId) {
        this.gradeSubId = gradeSubId;
    }


    public Integer getGradeStu() {
        return gradeStu;
    }


    public void setGradeStu(Integer gradeStu) {
        this.gradeStu = gradeStu;
    }


    public String getGradeSubName() {
        return gradeSubName;
    }


    public void setGradeSubName(String gradeSubName) {
        this.gradeSubName = gradeSubName == null ? null : gradeSubName.trim();
    }


    public Date getGradeLimit() {
        return gradeLimit;
    }


    public void setGradeLimit(Date gradeLimit) {
        this.gradeLimit = gradeLimit;
    }


    public Integer getGradeJudge() {
        return gradeJudge;
    }


    public void setGradeJudge(Integer gradeJudge) {
        this.gradeJudge = gradeJudge;
    }


    public Date getGradeAlterTime() {
        return gradeAlterTime;
    }


    public void setGradeAlterTime(Date gradeAlterTime) {
        this.gradeAlterTime = gradeAlterTime;
    }


    public Integer getGradeViolate() {
        return gradeViolate;
    }


    public void setGradeViolate(Integer gradeViolate) {
        this.gradeViolate = gradeViolate;
    }


    public Integer getGradeReview() {
        return gradeReview;
    }


    public void setGradeReview(Integer gradeReview) {
        this.gradeReview = gradeReview;
    }


    public String getGradeMajor(){return gradeMajor;}


    public void setGradeMajor(String gradeMajor){
        this.gradeMajor = gradeMajor == null ? null : gradeMajor.trim();
    }

    public Integer getGradeYear(){return gradeYear;}

    public void setGradeYear(Integer gradeYear){this.gradeYear = gradeYear;}
}