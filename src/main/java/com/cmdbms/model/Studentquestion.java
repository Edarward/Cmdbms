package com.cmdbms.model;

public class Studentquestion {

    private Integer id;


    private String stuQuestion;


    public Studentquestion(Integer id, String stuQuestion) {
        this.id = id;
        this.stuQuestion = stuQuestion;
    }


    public Studentquestion() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getStuQuestion() {
        return stuQuestion;
    }


    public void setStuQuestion(String stuQuestion) {
        this.stuQuestion = stuQuestion == null ? null : stuQuestion.trim();
    }
}