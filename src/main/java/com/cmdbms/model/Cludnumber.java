package com.cmdbms.model;

import java.util.Date;

public class Cludnumber {

    private Integer studentId;


    private Integer cludId;


    private Date joinTime;


    private Date exitTime;


    private Integer cludPositionId;


    private Byte joinApplication;


    private String exitApplication;


    private Integer voteStatus;


    public Cludnumber(Integer studentId, Integer cludId, Date joinTime, Date exitTime, Integer cludPositionId, Byte joinApplication, String exitApplication, Integer voteStatus) {
        this.studentId = studentId;
        this.cludId = cludId;
        this.joinTime = joinTime;
        this.exitTime = exitTime;
        this.cludPositionId = cludPositionId;
        this.joinApplication = joinApplication;
        this.exitApplication = exitApplication;
        this.voteStatus = voteStatus;
    }


    public Cludnumber() {
        super();
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Integer getCludId() {
        return cludId;
    }


    public void setCludId(Integer cludId) {
        this.cludId = cludId;
    }


    public Date getJoinTime() {
        return joinTime;
    }


    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }


    public Date getExitTime() {
        return exitTime;
    }


    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }


    public Integer getCludPositionId() {
        return cludPositionId;
    }


    public void setCludPositionId(Integer cludPositionId) {
        this.cludPositionId = cludPositionId;
    }


    public Byte getJoinApplication() {
        return joinApplication;
    }


    public void setJoinApplication(Byte joinApplication) {
        this.joinApplication = joinApplication;
    }


    public String getExitApplication() {
        return exitApplication;
    }


    public void setExitApplication(String exitApplication) {
        this.exitApplication = exitApplication == null ? null : exitApplication.trim();
    }


    public Integer getVoteStatus() {
        return voteStatus;
    }


    public void setVoteStatus(Integer voteStatus) {
        this.voteStatus = voteStatus;
    }
}