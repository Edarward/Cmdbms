package com.cmdbms.model;

import java.util.Date;

public class Classroomuse {

    private Integer id;


    private Integer useClrId;


    private Date useApplyTime;


    private Date useClrTime;


    private Date useAuditTime;


    private Boolean useThrough;


    private String useClrName;


    public Classroomuse(Integer id, Integer useClrId, Date useApplyTime, Date useClrTime, Date useAuditTime, Boolean useThrough, String useClrName) {
        this.id = id;
        this.useClrId = useClrId;
        this.useApplyTime = useApplyTime;
        this.useClrTime = useClrTime;
        this.useAuditTime = useAuditTime;
        this.useThrough = useThrough;
        this.useClrName = useClrName;
    }


    public Classroomuse() {
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


    public Date getUseApplyTime() {
        return useApplyTime;
    }


    public void setUseApplyTime(Date useApplyTime) {
        this.useApplyTime = useApplyTime;
    }


    public Date getUseClrTime() {
        return useClrTime;
    }


    public void setUseClrTime(Date useClrTime) {
        this.useClrTime = useClrTime;
    }


    public Date getUseAuditTime() {
        return useAuditTime;
    }


    public void setUseAuditTime(Date useAuditTime) {
        this.useAuditTime = useAuditTime;
    }


    public Boolean getUseThrough() {
        return useThrough;
    }


    public void setUseThrough(Boolean useThrough) {
        this.useThrough = useThrough;
    }


    public String getUseClrName() {
        return useClrName;
    }


    public void setUseClrName(String useClrName) {
        this.useClrName = useClrName == null ? null : useClrName.trim();
    }
}