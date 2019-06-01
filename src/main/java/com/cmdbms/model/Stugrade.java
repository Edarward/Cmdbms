package com.cmdbms.model;

import java.util.Date;

public class Stugrade {

    private Integer id;


    private Integer gradeStuId;


    private Integer gradeSubId;


    private Integer gradeStu;


    private Date gradeLimit;


    private Boolean gradeJudge;


    private Date gradeAlterTime;


    private Boolean gradeViolate;


    public Stugrade(Integer id, Integer gradeStuId, Integer gradeSubId, Integer gradeStu, Date gradeLimit, Boolean gradeJudge, Date gradeAlterTime, Boolean gradeViolate) {
        this.id = id;
        this.gradeStuId = gradeStuId;
        this.gradeSubId = gradeSubId;
        this.gradeStu = gradeStu;
        this.gradeLimit = gradeLimit;
        this.gradeJudge = gradeJudge;
        this.gradeAlterTime = gradeAlterTime;
        this.gradeViolate = gradeViolate;
    }


    public Stugrade() {
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


    public Date getGradeLimit() {
        return gradeLimit;
    }


    public void setGradeLimit(Date gradeLimit) {
        this.gradeLimit = gradeLimit;
    }


    public Boolean getGradeJudge() {
        return gradeJudge;
    }


    public void setGradeJudge(Boolean gradeJudge) {
        this.gradeJudge = gradeJudge;
    }


    public Date getGradeAlterTime() {
        return gradeAlterTime;
    }


    public void setGradeAlterTime(Date gradeAlterTime) {
        this.gradeAlterTime = gradeAlterTime;
    }


    public Boolean getGradeViolate() {
        return gradeViolate;
    }


    public void setGradeViolate(Boolean gradeViolate) {
        this.gradeViolate = gradeViolate;
    }
}