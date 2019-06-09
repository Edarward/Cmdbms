package com.cmdbms.model;

public class Studentcontent {

    private Integer id;


    private Integer stuId;


    private Integer stuTeacherid;


    private Integer stuCourseid;


    private Integer stuQuestionid;


    private String stuType;


    private String stuContent;


    public Studentcontent(Integer id, Integer stuId, Integer stuTeacherid, Integer stuCourseid, Integer stuQuestionid, String stuType, String stuContent) {
        this.id = id;
        this.stuId = stuId;
        this.stuTeacherid = stuTeacherid;
        this.stuCourseid = stuCourseid;
        this.stuQuestionid = stuQuestionid;
        this.stuType = stuType;
        this.stuContent = stuContent;
    }


    public Studentcontent() {
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


    public Integer getStuTeacherid() {
        return stuTeacherid;
    }


    public void setStuTeacherid(Integer stuTeacherid) {
        this.stuTeacherid = stuTeacherid;
    }


    public Integer getStuCourseid() {
        return stuCourseid;
    }


    public void setStuCourseid(Integer stuCourseid) {
        this.stuCourseid = stuCourseid;
    }


    public Integer getStuQuestionid() {
        return stuQuestionid;
    }


    public void setStuQuestionid(Integer stuQuestionid) {
        this.stuQuestionid = stuQuestionid;
    }


    public String getStuType() {
        return stuType;
    }


    public void setStuType(String stuType) {
        this.stuType = stuType == null ? null : stuType.trim();
    }


    public String getStuContent() {
        return stuContent;
    }


    public void setStuContent(String stuContent) {
        this.stuContent = stuContent == null ? null : stuContent.trim();
    }
}