package com.cmdbms.model;

import java.util.Date;

public class Afficheusercomment {

    private Integer userComId;


    private Integer notId;


    private Integer userId;


    private String userComCon;


    private Date userComTime;


    public Afficheusercomment(Integer userComId, Integer notId, Integer userId, String userComCon, Date userComTime) {
        this.userComId = userComId;
        this.notId = notId;
        this.userId = userId;
        this.userComCon = userComCon;
        this.userComTime = userComTime;
    }


    public Afficheusercomment() {
        super();
    }


    public Integer getUserComId() {
        return userComId;
    }


    public void setUserComId(Integer userComId) {
        this.userComId = userComId;
    }


    public Integer getNotId() {
        return notId;
    }


    public void setNotId(Integer notId) {
        this.notId = notId;
    }


    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserComCon() {
        return userComCon;
    }


    public void setUserComCon(String userComCon) {
        this.userComCon = userComCon == null ? null : userComCon.trim();
    }


    public Date getUserComTime() {
        return userComTime;
    }


    public void setUserComTime(Date userComTime) {
        this.userComTime = userComTime;
    }
}