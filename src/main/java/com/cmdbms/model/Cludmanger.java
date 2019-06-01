package com.cmdbms.model;

import java.util.Date;

public class Cludmanger {

    private Integer id;


    private String name;


    private Integer number;


    private Date declarationTime;


    private Integer studentId;


    private Integer cludStatus;


    public Cludmanger(Integer id, String name, Integer number, Date declarationTime, Integer studentId, Integer cludStatus) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.declarationTime = declarationTime;
        this.studentId = studentId;
        this.cludStatus = cludStatus;
    }


    public Cludmanger() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Integer getNumber() {
        return number;
    }


    public void setNumber(Integer number) {
        this.number = number;
    }


    public Date getDeclarationTime() {
        return declarationTime;
    }


    public void setDeclarationTime(Date declarationTime) {
        this.declarationTime = declarationTime;
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Integer getCludStatus() {
        return cludStatus;
    }


    public void setCludStatus(Integer cludStatus) {
        this.cludStatus = cludStatus;
    }
}