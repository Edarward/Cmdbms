package com.cmdbms.model;

public class Course {

    private Integer id;

    private String name;

    private Integer period;

    private Integer credit;

    private Boolean compulsory;

    private Boolean offlineTeach;

    public Course(Integer id, String name, Integer period, Integer credit, Boolean compulsory, Boolean offlineTeach) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.credit = credit;
        this.compulsory = compulsory;
        this.offlineTeach = offlineTeach;
    }

    public Course() {
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

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Boolean getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }

    public Boolean getOfflineTeach() {
        return offlineTeach;
    }

    public void setOfflineTeach(Boolean offlineTeach) {
        this.offlineTeach = offlineTeach;
    }
}