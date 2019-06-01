package com.cmdbms.model;

import java.util.Date;

public class Reexam {

    private Integer id;


    private Integer subId;


    private Integer stuId;


    private Date applyTime;


    private Date auditTime;


    private Boolean auditThrough;


    public Reexam(Integer id, Integer subId, Integer stuId, Date applyTime, Date auditTime, Boolean auditThrough) {
        this.id = id;
        this.subId = subId;
        this.stuId = stuId;
        this.applyTime = applyTime;
        this.auditTime = auditTime;
        this.auditThrough = auditThrough;
    }


    public Reexam() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getSubId() {
        return subId;
    }


    public void setSubId(Integer subId) {
        this.subId = subId;
    }


    public Integer getStuId() {
        return stuId;
    }


    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


    public Date getApplyTime() {
        return applyTime;
    }


    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }


    public Date getAuditTime() {
        return auditTime;
    }


    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }


    public Boolean getAuditThrough() {
        return auditThrough;
    }


    public void setAuditThrough(Boolean auditThrough) {
        this.auditThrough = auditThrough;
    }
}