package com.cmdbms.model;

import java.util.Date;

public class Studentcode {

    private Integer id;


    private String stuInstitution;


    private String stuMajor;


    private String stuClass;


    private Date stuEnteredtime;


    private String stuSource;


    public Studentcode(Integer id, String stuInstitution, String stuMajor, String stuClass, Date stuEnteredtime, String stuSource) {
        this.id = id;
        this.stuInstitution = stuInstitution;
        this.stuMajor = stuMajor;
        this.stuClass = stuClass;
        this.stuEnteredtime = stuEnteredtime;
        this.stuSource = stuSource;
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


    public String getStuInstitution() {
        return stuInstitution;
    }


    public void setStuInstitution(String stuInstitution) {
        this.stuInstitution = stuInstitution == null ? null : stuInstitution.trim();
    }


    public String getStuMajor() {
        return stuMajor;
    }


    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor == null ? null : stuMajor.trim();
    }


    public String getStuClass() {
        return stuClass;
    }


    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }


    public Date getStuEnteredtime() {
        return stuEnteredtime;
    }


    public void setStuEnteredtime(Date stuEnteredtime) {
        this.stuEnteredtime = stuEnteredtime;
    }


    public String getStuSource() {
        return stuSource;
    }


    public void setStuSource(String stuSource) {
        this.stuSource = stuSource == null ? null : stuSource.trim();
    }
}