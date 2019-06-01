package com.cmdbms.model;

public class Financialwage {

    private Integer id;

    private Integer teaId;

    private String teaMoney;

    private String teaState;

    public Financialwage(Integer teaId,Integer id, String teaMoney, String teaState) {
        this.teaId = teaId;
        this.id = id;
        this.teaMoney = teaMoney;
        this.teaState = teaState;
    }

    public void setId(Integer id ){this.id = id;}

    public int getId() { return id;    }

    public Financialwage() {
        super();
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaMoney() {
        return teaMoney;
    }

    public void setTeaMoney(String teaMoney) {
        this.teaMoney = teaMoney;
    }

    public String getTeaState() {
        return teaState;
    }

    public void setTeaState(String teaState) {
        this.teaState = teaState == null ? null : teaState.trim();
    }
}