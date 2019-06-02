package com.cmdbms.model;

import java.util.Date;

public class Examclassroomuse {

    private Integer id;


    private Integer useClrId;


    private Date useTime;


    private Integer useClrTime;


    private Date useAuditTime;


    private Integer useThrough;


    private String useClrName;


    public Examclassroomuse(Integer id, Integer useClrId, Date useTime, Integer useClrTime, Date useAuditTime, Integer useThrough, String useClrName) {
        this.id = id;
        this.useClrId = useClrId;
        this.useTime = useTime;
        this.useClrTime = useClrTime;
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