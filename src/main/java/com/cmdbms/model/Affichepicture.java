package com.cmdbms.model;

import java.util.Date;

public class Affichepicture {

    private Integer picId;


    private String picAddress;


    private String picReleaser;


    private Date picReleasetime;


    public Affichepicture(Integer picId, String picAddress, String picReleaser, Date picReleasetime) {
        this.picId = picId;
        this.picAddress = picAddress;
        this.picReleaser = picReleaser;
        this.picReleasetime = picReleasetime;
    }


    public Affichepicture() {
        super();
    }


    public Integer getPicId() {
        return picId;
    }


    public void setPicId(Integer picId) {
        this.picId = picId;
    }


    public String getPicAddress() {
        return picAddress;
    }


    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress == null ? null : picAddress.trim();
    }


    public String getPicReleaser() {
        return picReleaser;
    }


    public void setPicReleaser(String picReleaser) {
        this.picReleaser = picReleaser == null ? null : picReleaser.trim();
    }


    public Date getPicReleasetime() {
        return picReleasetime;
    }


    public void setPicReleasetime(Date picReleasetime) {
        this.picReleasetime = picReleasetime;
    }
}