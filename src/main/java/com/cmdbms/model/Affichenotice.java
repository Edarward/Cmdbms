package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Affichenotice {

    private Integer notId;


    private String notType;


    private String notContent;


    private String notWriter;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date notWritetime;


    private String notReleaser;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date notReleasetime;


    private Integer notState;


    private Integer notStatetype;


    public Affichenotice(Integer notId, String notType, String notContent,String notWriter, Date notWritetime, String notReleaser, Date notReleasetime, Integer notState, Integer notStatetype) {
        this.notId = notId;
        this.notType = notType;
        this.notContent = notContent;
        this.notWriter = notWriter;
        this.notWritetime = notWritetime;
        this.notReleaser = notReleaser;
        this.notReleasetime = notReleasetime;
        this.notState = notState;
        this.notStatetype = notStatetype;
    }


    public Affichenotice() {
        super();
    }


    public Integer getNotId() {
        return notId;
    }


    public void setNotId(Integer notId) {
        this.notId = notId;
    }


    public String getNotType() {
        return notType;
    }


    public void setNotType(String notType) {
        this.notType = notType == null ? null : notType.trim();
    }


    public String getNotContent(){return notContent;}


    public void setNotContent(String notContent){
        this.notContent = notContent == null ? null : notContent.trim();
    }


    public String getNotWriter() {
        return notWriter;
    }


    public void setNotWriter(String notWriter) {
        this.notWriter = notWriter == null ? null : notWriter.trim();
    }


    public Date getNotWritetime() {
        return notWritetime;
    }


    public void setNotWritetime(Date notWritetime) {
        this.notWritetime = notWritetime;
    }


    public String getNotReleaser() {
        return notReleaser;
    }


    public void setNotReleaser(String notReleaser) {
        this.notReleaser = notReleaser == null ? null : notReleaser.trim();
    }


    public Date getNotReleasetime() {
        return notReleasetime;
    }


    public void setNotReleasetime(Date notReleasetime) {
        this.notReleasetime = notReleasetime;
    }


    public Integer getNotState() {
        return notState;
    }


    public void setNotState(Integer notState) {
        this.notState = notState;
    }


    public Integer getNotStatetype() {
        return notStatetype;
    }


    public void setNotStatetype(Integer notStatetype) {
        this.notStatetype = notStatetype;
    }
}