package com.cmdbms.model;

public class Studentcode {

    private Integer id;


    private String stuclaName;


    private Integer stuclaWeek;


    private Integer stuclaTime;


    public Studentcode(Integer id, String stuclaName, Integer stuclaWeek, Integer stuclaTime) {
        this.id = id;
        this.stuclaName = stuclaName;
        this.stuclaWeek = stuclaWeek;
        this.stuclaTime = stuclaTime;
    }


    public Studentcode() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getStuclaName() {
        return stuclaName;
    }


    public void setStuclaName(String stuclaName) {
        this.stuclaName = stuclaName == null ? null : stuclaName.trim();
    }


    public Integer getStuclaWeek() {
        return stuclaWeek;
    }


    public void setStuclaWeek(Integer stuclaWeek) {
        this.stuclaWeek = stuclaWeek;
    }


    public Integer getStuclaTime() {
        return stuclaTime;
    }


    public void setStuclaTime(Integer stuclaTime) {
        this.stuclaTime = stuclaTime;
    }
}