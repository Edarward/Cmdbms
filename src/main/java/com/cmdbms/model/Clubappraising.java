package com.cmdbms.model;

public class Clubappraising {

    private Integer id;


    private Integer year;


    private Integer clubId;


    private Byte appraisingStart;


    private Byte appraisingResult;


    private Integer studentId;


    public Clubappraising(Integer id, Integer year, Integer clubId, Byte appraisingStart, Byte appraisingResult, Integer studentId) {
        this.id = id;
        this.year = year;
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


    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }


    public Integer getClubId() {
        return clubId;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }


    public Byte getAppraisingStart() {
        return appraisingStart;
    }


    public void setAppraisingStart(Byte appraisingStart) {
        this.appraisingStart = appraisingStart;
    }


    public Byte getAppraisingResult() {
        return appraisingResult;
    }


    public void setAppraisingResult(Byte appraisingResult) {
        this.appraisingResult = appraisingResult;
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}