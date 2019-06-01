package com.cmdbms.model;

public class Afficheadmin {

    private Integer adminId;

    private String adminName;

    private Integer adminUsername;

    private String adminPassword;

    public Afficheadmin(Integer adminId, String adminName, Integer adminUsername, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public Afficheadmin() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAdminUsername() {
        return adminUsername;
    }


    public void setAdminUsername(Integer adminUsername) {
        this.adminUsername = adminUsername;
    }


    public String getAdminPassword() {
        return adminPassword;
    }


    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }
}