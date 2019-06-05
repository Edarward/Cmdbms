package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Examclassroomuse {

    private Integer id;


    private Integer useClrId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useTime;


    private Integer useClrTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date useClrDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useAuditTime;


    private Integer useThrough;


    private String useClrName;


    public Examclassroomuse(Integer id, Integer useClrId, Date useTime, Integer useClrTime, Date useClrDate, Date useAuditTime, Integer useThrough, String useClrName) {
        this.id = id;
        this.useClrId = useClrId;
        this.useTime = useTime;
        this.useClrTime = useClrTime;
        this.useClrDate = useClrDate;
        this.useAuditTime = useAuditTime;
        this.useThrough = useThrough;
        this.useClrName = useClrName;
    }


    public Examclassroomuse() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getUseClrId() {
        return useClrId;
    }


    public void setUseClrId(Integer useClrId) {
        this.useClrId = useClrId;
    }


    public Date getUseTime() {
        return useTime;
    }


    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }


    public Integer getUseClrTime() {
        return useClrTime;
    }


    public void setUseClrTime(Integer useClrTime) {
        this.useClrTime = useClrTime;
    }


    public Date getUseClrDate() {
        return useClrDate;
    }


    public void setUseClrDate(Date useClrDate) {
        this.useClrDate = useClrDate;
    }


    public Date getUseAuditTime() {
        return useAuditTime;
    }


    public void setUseAuditTime(Date useAuditTime) {
        this.useAuditTime = useAuditTime;
    }


    public Integer getUseThrough() {
        return useThrough;
    }


    public void setUseThrough(Integer useThrough) {
        this.useThrough = useThrough;
    }


    public String getUseClrName() {
        return useClrName;
    }


    public void setUseClrName(String useClrName) {
        this.useClrName = useClrName == null ? null : useClrName.trim();
    }
}