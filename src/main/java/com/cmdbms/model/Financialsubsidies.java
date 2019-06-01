package com.cmdbms.model;

public class Financialsubsidies {

    private Integer stuId;

    private String stuName;

    private String stuEthnic;

    private String stuAdress;

    private String stiReason;

    private String stiGrade;

    private String stiState;


    public Financialsubsidies(Integer stuId, String stuName, String stuEthnic, String stuAdress, String stiReason, String stiGrade, String stiState) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuEthnic = stuEthnic;
        this.stuAdress = stuAdress;
        this.stiReason = stiReason;
        this.stiGrade = stiGrade;
        this.stiState = stiState;
    }


    public Financialsubsidies() {
        super();
    }


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuEthnic() {
        return stuEthnic;
    }

    public void setStuEthnic(String stuEthnic) {
        this.stuEthnic = stuEthnic == null ? null : stuEthnic.trim();
    }

    public String getStuAdress() {
        return stuAdress;
    }

    public void setStuAdress(String stuAdress) {
        this.stuAdress = stuAdress == null ? null : stuAdress.trim();
    }

    public String getStiReason() {
        return stiReason;
    }

    public void setStiReason(String stiReason) {
        this.stiReason = stiReason == null ? null : stiReason.trim();
    }

    public String getStiGrade() {
        return stiGrade;
    }

    public void setStiGrade(String stiGrade) {
        this.stiGrade = stiGrade == null ? null : stiGrade.trim();
    }

    public String getStiState() {
        return stiState;
    }

    public void setStiState(String stiState) {
        this.stiState = stiState == null ? null : stiState.trim();
    }
}