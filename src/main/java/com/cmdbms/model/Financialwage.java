package com.cmdbms.model;

public class Financialwage {

    private Integer teaId;


    private String teaPosition;


    private String teaTt;

    private String teaWages;

    private String teaBonus;

    private String teaFine;

    private String teaMoney;


    private String teaState;


    public Financialwage(Integer teaId, String teaPosition, String teaTt, String teaWages, String teaBonus, String teaFine, String teaMoney, String teaState) {
        this.teaId = teaId;
        this.teaPosition = teaPosition;
        this.teaTt = teaTt;
        this.teaWages = teaWages;
        this.teaBonus = teaBonus;
        this.teaFine = teaFine;
        this.teaMoney = teaMoney;
        this.teaState = teaState;
    }


    public Financialwage() {
        super();
    }


    public Integer getTeaId() {
        return teaId;
    }


    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaPosition() {
        return teaPosition;
    }

    public void setTeaPosition(String teaPosition) {
        this.teaPosition = teaPosition == null ? null : teaPosition.trim();
    }

    public String getTeaTt() {
        return teaTt;
    }


    public void setTeaTt(String teaTt) {
        this.teaTt = teaTt == null ? null : teaTt.trim();
    }


    public String getTeaWages() {
        return teaWages;
    }


    public void setTeaWages(String teaWages) {
        this.teaWages = teaWages == null ? null : teaWages.trim();
    }


    public String getTeaBonus() {
        return teaBonus;
    }


    public void setTeaBonus(String teaBonus) {
        this.teaBonus = teaBonus == null ? null : teaBonus.trim();
    }


    public String getTeaFine() {
        return teaFine;
    }


    public void setTeaFine(String teaFine) {
        this.teaFine = teaFine == null ? null : teaFine.trim();
    }


    public String getTeaMoney() {
        return teaMoney;
    }


    public void setTeaMoney(String teaMoney) {
        this.teaMoney = teaMoney == null ? null : teaMoney.trim();
    }


    public String getTeaState() {
        return teaState;
    }


    public void setTeaState(String teaState) {
        this.teaState = teaState == null ? null : teaState.trim();
    }
}