package com.cmdbms.model;

public class Afficheadminpower {

    private Integer adminPowId;


    private Integer adminPowCon;


    public Afficheadminpower(Integer adminPowId, Integer adminPowCon) {
        this.adminPowId = adminPowId;
        this.adminPowCon = adminPowCon;
    }


    public Afficheadminpower() {
        super();
    }


    public Integer getAdminPowId() {
        return adminPowId;
    }


    public void setAdminPowId(Integer adminPowId) {
        this.adminPowId = adminPowId;
    }


    public Integer getAdminPowCon() {
        return adminPowCon;
    }


    public void setAdminPowCon(Integer adminPowCon) {
        this.adminPowCon = adminPowCon;
    }
}