package com.cmdbms.model;

public class Clubmessage {

    private Integer id;


    private Integer clubActivityId;


    private String content;


    private Integer studentId;


    private Boolean contentStatus;


    public Clubmessage(Integer id, Integer clubActivityId, String content, Integer studentId, Boolean contentStatus) {
        this.id = id;
        this.clubActivityId = clubActivityId;
        this.content = content;
        this.studentId = studentId;
        this.contentStatus = contentStatus;
    }


    public Clubmessage() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getClubActivityId() {
        return clubActivityId;
    }


    public void setClubActivityId(Integer clubActivityId) {
        this.clubActivityId = clubActivityId;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


    public Integer getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Boolean getContentStatus() {
        return contentStatus;
    }


    public void setContentStatus(Boolean contentStatus) {
        this.contentStatus = contentStatus;
    }
}