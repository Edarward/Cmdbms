package com.cmdbms.model;

public class Affichewriter {

    private Integer wriId;


    private String wriName;


    private Integer wriPhone;


    private Integer wriUsername;


    private String wriPassword;


    public Affichewriter(Integer wriId, String wriName, Integer wriPhone, Integer wriUsername, String wriPassword) {
        this.wriId = wriId;
        this.wriName = wriName;
        this.wriPhone = wriPhone;
        this.wriUsername = wriUsername;
        this.wriPassword = wriPassword;
    }


    public Affichewriter() {
        super();
    }


    public Integer getWriId() {
        return wriId;
    }


    public void setWriId(Integer wriId) {
        this.wriId = wriId;
    }


    public String getWriName() {
        return wriName;
    }


    public void setWriName(String wriName) {
        this.wriName = wriName == null ? null : wriName.trim();
    }


    public Integer getWriPhone() {
        return wriPhone;
    }


    public void setWriPhone(Integer wriPhone) {
        this.wriPhone = wriPhone;
    }


    public Integer getWriUsername() {
        return wriUsername;
    }


    public void setWriUsername(Integer wriUsername) {
        this.wriUsername = wriUsername;
    }


    public String getWriPassword() {
        return wriPassword;
    }


    public void setWriPassword(String wriPassword) {
        this.wriPassword = wriPassword == null ? null : wriPassword.trim();
    }
}