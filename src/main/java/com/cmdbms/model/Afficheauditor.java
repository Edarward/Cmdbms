package com.cmdbms.model;

public class Afficheauditor {

    private Integer audId;


    private String audName;


    private Integer audPhone;


    private Integer audUsername;


    private String audPassword;


    public Afficheauditor(Integer audId, String audName, Integer audPhone, Integer audUsername, String audPassword) {
        this.audId = audId;
        this.audName = audName;
        this.audPhone = audPhone;
        this.audUsername = audUsername;
        this.audPassword = audPassword;
    }


    public Afficheauditor() {
        super();
    }


    public Integer getAudId() {
        return audId;
    }


    public void setAudId(Integer audId) {
        this.audId = audId;
    }


    public String getAudName() {
        return audName;
    }


    public void setAudName(String audName) {
        this.audName = audName == null ? null : audName.trim();
    }


    public Integer getAudPhone() {
        return audPhone;
    }


    public void setAudPhone(Integer audPhone) {
        this.audPhone = audPhone;
    }


    public Integer getAudUsername() {
        return audUsername;
    }


    public void setAudUsername(Integer audUsername) {
        this.audUsername = audUsername;
    }


    public String getAudPassword() {
        return audPassword;
    }


    public void setAudPassword(String audPassword) {
        this.audPassword = audPassword == null ? null : audPassword.trim();
    }
}