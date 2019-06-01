package com.cmdbms.model;

public class Afficheuser {

    private Integer userId;


    private String userName;


    private Integer userUsername;


    private String userPassword;


    public Afficheuser(Integer userId, String userName, Integer userUsername, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
    }


    public Afficheuser() {
        super();
    }


    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }


    public Integer getUserUsername() {
        return userUsername;
    }


    public void setUserUsername(Integer userUsername) {
        this.userUsername = userUsername;
    }


    public String getUserPassword() {
        return userPassword;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}