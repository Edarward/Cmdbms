package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Examretake {

    private Integer id;


    private String exuseSubname;


    private Integer exuseStuId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exuseTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exuseAuditTime;


    private Integer exuseThrough;


    public Examretake(Integer id, String exuseSubname, Integer exuseStuId, Date exuseTime, Date exuseAuditTime, Integer exuseThrough) {
        this.id = id;
        this.exuseSubname = exuseSubname;
        this.exuseStuId = exuseStuId;
        this.exuseTime = exuseTime;
        this.exuseAuditTime = exuseAuditTime;
        this.exuseThrough = exuseThrough;
    }


    public Examretake() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getExuseSubname() {
        return exuseSubname;
    }


    public void setExuseSubname(String exuseSubname) {
        this.exuseSubname = exuseSubname == null ? null : exuseSubname.trim();
    }


    public Integer getExuseStuId() {
        return exuseStuId;
    }


    public void setExuseStuId(Integer exuseStuId) {
        this.exuseStuId = exuseStuId;
    }


    public Date getExuseTime() {
        return exuseTime;
    }


    public void setExuseTime(Date exuseTime) {
        this.exuseTime = exuseTime;
    }


    public Date getExuseAuditTime() {
        return exuseAuditTime;
    }


    public void setExuseAuditTime(Date exuseAuditTime) {
        this.exuseAuditTime = exuseAuditTime;
    }


    public Integer getExuseThrough() {
        return exuseThrough;
    }


    public void setExuseThrough(Integer exuseThrough) {
        this.exuseThrough = exuseThrough;
    }
}