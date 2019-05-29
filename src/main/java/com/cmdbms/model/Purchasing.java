package com.cmdbms.model;

import java.math.BigDecimal;
import java.util.Date;

public class Purchasing {

    private Integer purId;

    private String purEquipment;

    private String purProName;

    private Date purTime;

    private Integer purAmount;

    private BigDecimal purPrice;

    private String purMan;

    private Date purInime;

    private Boolean purAuditing;

    public Purchasing(Integer purId, String purEquipment, String purProName, Date purTime, Integer purAmount, BigDecimal purPrice, String purMan, Date purInime, Boolean purAuditing) {
        this.purId = purId;
        this.purEquipment = purEquipment;
        this.purProName = purProName;
        this.purTime = purTime;
        this.purAmount = purAmount;
        this.purPrice = purPrice;
        this.purMan = purMan;
        this.purInime = purInime;
        this.purAuditing = purAuditing;
    }

    public Purchasing() {
        super();
    }

    public Integer getPurId() {
        return purId;
    }

    public void setPurId(Integer purId) {
        this.purId = purId;
    }

    public String getPurEquipment() {
        return purEquipment;
    }

    public void setPurEquipment(String purEquipment) {
        this.purEquipment = purEquipment == null ? null : purEquipment.trim();
    }

    public String getPurProName() {
        return purProName;
    }

    public void setPurProName(String purProName) {
        this.purProName = purProName == null ? null : purProName.trim();
    }

    public Date getPurTime() {
        return purTime;
    }

    public void setPurTime(Date purTime) {
        this.purTime = purTime;
    }

    public Integer getPurAmount() {
        return purAmount;
    }

    public void setPurAmount(Integer purAmount) {
        this.purAmount = purAmount;
    }

    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    public String getPurMan() {
        return purMan;
    }

    public void setPurMan(String purMan) {
        this.purMan = purMan == null ? null : purMan.trim();
    }

    public Date getPurInime() {
        return purInime;
    }

    public void setPurInime(Date purInime) {
        this.purInime = purInime;
    }

    public Boolean getPurAuditing() {
        return purAuditing;
    }

    public void setPurAuditing(Boolean purAuditing) {
        this.purAuditing = purAuditing;
    }
}