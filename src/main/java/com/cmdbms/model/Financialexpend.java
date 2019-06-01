package com.cmdbms.model;

public class Financialexpend {

    private Integer finId;


    private String finName;


    private String finMoney;


    public Financialexpend(Integer finId, String finName, String finMoney) {
        this.finId = finId;
        this.finName = finName;
        this.finMoney = finMoney;
    }


    public Financialexpend() {
        super();
    }


    public Integer getFinId() {
        return finId;
    }


    public void setFinId(Integer finId) {
        this.finId = finId;
    }


    public String getFinName() {
        return finName;
    }


    public void setFinName(String finName) {
        this.finName = finName == null ? null : finName.trim();
    }


    public String getFinMoney() {
        return finMoney;
    }


    public void setFinMoney(String finMoney) {
        this.finMoney = finMoney == null ? null : finMoney.trim();
    }
}