package com.cmdbms.model;

public class Clubappraising {

    private Integer id;


    private Integer term;


    private Integer clubId;


    private Boolean appraisingStart;


    private Boolean appraisingResult;


    private Integer studentId;


    public Clubappraising(Integer id, Integer term, Integer clubId, Boolean appraisingStart, Boolean appraisingResult, Integer studentId) {
        this.id = id;
        this.term = term;
        this.clubId = clubId;
        this.appraisingStart = appraisingStart;
        this.appraisingResult = appraisingResult;
        this.studentId = studentId;
    }


    public Clubappraising() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getTerm() {
        return term;
    }


    public void setTerm(Integer term) {
        this.term = term;
    }


    public Integer getClubId() {
        return clubId;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }


    public Boolean getAppraisingStart() {
        return appraisingStart;
    }


    public void setAppraisingStart(Boolean appraisingStart) {
        this.appraisingStart = appraisingStart;
    }


    public Boolean getAppraisingResult() {
        return appraisingResult;
    }


    public void setAppraisingResult(Boolean appraisingResult) {
        this.appraisingResult = appraisingResult;
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}