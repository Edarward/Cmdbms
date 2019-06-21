package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Studentmsg {

    private Integer id;


    private String name;


    private Integer grade;


    private String sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;


    private String nativePlace;


    private String idType;


    private String idNunber;


    private String phone;


    private String parentPhone;


    private String folk;


    private String politicalSt;


    private String major;


    public Studentmsg(Integer id, String name, Integer grade, String sex, Date birthday, String nativePlace, String idType, String idNunber, String phone, String parentPhone, String folk, String politicalSt,String major) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.sex = sex;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
        this.idType = idType;
        this.idNunber = idNunber;
        this.phone = phone;
        this.parentPhone = parentPhone;
        this.folk = folk;
        this.politicalSt = politicalSt;
        this.major = major;
    }


    public Studentmsg() {
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


    public Integer getGrade() {
        return grade;
    }


    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


    public Date getBirthday() {
        return birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getNativePlace() {
        return nativePlace;
    }


    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }


    public String getIdType() {
        return idType;
    }


    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }


    public String getIdNunber() {
        return idNunber;
    }


    public void setIdNunber(String idNunber) {
        this.idNunber = idNunber == null ? null : idNunber.trim();
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }


    public String getParentPhone() {
        return parentPhone;
    }


    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone == null ? null : parentPhone.trim();
    }


    public String getFolk() {
        return folk;
    }


    public void setFolk(String folk) {
        this.folk = folk == null ? null : folk.trim();
    }


    public String getPoliticalSt() {
        return politicalSt;
    }


    public void setPoliticalSt(String politicalSt) {
        this.politicalSt = politicalSt == null ? null : politicalSt.trim();
    }

    public String getMajor(){return major;}

    public void setMajor(String major){
        this.major = major == null ? null : major.trim();
    }
}