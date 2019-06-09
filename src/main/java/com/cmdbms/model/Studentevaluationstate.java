package com.cmdbms.model;

public class Studentevaluationstate {

    private Integer id;


    private Integer stuId;


    private String stuMajor;


    public Studentevaluationstate(Integer id, Integer stuId, String stuMajor) {
        this.id = id;
        this.stuId = stuId;
        this.stuMajor = stuMajor;
    }


    public Studentevaluationstate() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStuId() {
        return stuId;
    }


    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


    public String getStuMajor() {
        return stuMajor;
    }


    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor == null ? null : stuMajor.trim();
    }
}