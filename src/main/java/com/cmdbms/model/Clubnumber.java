package com.cmdbms.model;

import java.util.Date;

public class Clubnumber {

    private Integer id;


    private Integer studentId;


    private Integer clubId;

    /*@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")*/
    private Date joinTime;


    private Date exitTime;


    private Integer clubPositionId;


    private Boolean joinApplication;


    private Boolean exitApplication;


    private Integer voteStatus;


    public Clubnumber(Integer id, Integer studentId, Integer clubId, Date joinTime, Date exitTime, Integer clubPositionId, Boolean joinApplication, Boolean exitApplication, Integer voteStatus) {
        this.id = id;
        this.studentId = studentId;
        this.clubId = clubId;
        this.joinTime = joinTime;
        this.exitTime = exitTime;
        this.clubPositionId = clubPositionId;
        this.joinApplication = joinApplication;
        this.exitApplication = exitApplication;
        this.voteStatus = voteStatus;
    }


    public Clubnumber() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Integer getClubId() {
        return clubId;
    }


    public void setClubId(Integer clubId) {
        this.clubId = clubId;
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


    public Integer getClubPositionId() {
        return clubPositionId;
    }


    public void setClubPositionId(Integer clubPositionId) {
        this.clubPositionId = clubPositionId;
    }


    public Boolean getJoinApplication() {
        return joinApplication;
    }


    public void setJoinApplication(Boolean joinApplication) {
        this.joinApplication = joinApplication;
    }


    public Boolean getExitApplication() {
        return exitApplication;
    }


    public void setExitApplication(Boolean exitApplication) {
        this.exitApplication = exitApplication;
    }


    public Integer getVoteStatus() {
        return voteStatus;
    }


    public void setVoteStatus(Integer voteStatus) {
        this.voteStatus = voteStatus;
    }
}