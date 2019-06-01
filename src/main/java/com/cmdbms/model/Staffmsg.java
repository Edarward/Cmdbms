package com.cmdbms.model;

import java.sql.Timestamp;

public class Staffmsg {

    private Integer id;

    private String name;

    private byte gender;

    private Integer birthday;

    private String idCard;

    private String eduBackground;

    private String phone;

    private String mail;

    private String address;

    private Timestamp entryTime;

    private String politicalStatus;

    private Integer salaryLevel;

    public Staffmsg(Integer id, String name, byte gender, Integer birthday,
                    String idCard, String eduBackground, String phone,
                    String mail, String address, Timestamp entryTime,
                    String politicalStatus, Integer salaryLevel) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.idCard = idCard;
        this.eduBackground = eduBackground;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.entryTime = entryTime;
        this.politicalStatus = politicalStatus;
        this.salaryLevel = salaryLevel;
    }


    public Staffmsg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground == null ? null : eduBackground.trim();
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public Integer getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Integer salaryLevel) {
        this.salaryLevel = salaryLevel;
    }
}