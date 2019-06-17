package com.cmdbms.model;

import java.util.Date;

public class Clubmanager {

    private Integer id;


    private String name;


    private Integer number;


    private Date declarationTime;


    private Date createTime;


    private Integer studentId;


    private Integer clubStatus;


    public Clubmanager(Integer id, String name, Integer number, Date declarationTime, Date createTime, Integer studentId, Integer clubStatus) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.declarationTime = declarationTime;
        this.createTime = createTime;
        this.studentId = studentId;
        this.clubStatus = clubStatus;
    }


    public Clubmanager() {
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


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Integer getClubStatus() {
        return clubStatus;
    }


    public void setClubStatus(Integer clubStatus) {
        this.clubStatus = clubStatus;
    }
}