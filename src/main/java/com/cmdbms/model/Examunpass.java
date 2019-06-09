package com.cmdbms.model;

public class Examunpass {

    private Integer id;


    private Integer unpassStuId;


    private Integer unpassSubId;


    private Integer unpassGradeStu;


    private Integer unpassVio;


    private String unpassSubName;


    public Examunpass(Integer id, Integer unpassStuId, Integer unpassSubId, Integer unpassGradeStu, Integer unpassVio, String unpassSubName) {
        this.id = id;
        this.unpassStuId = unpassStuId;
        this.unpassSubId = unpassSubId;
        this.unpassGradeStu = unpassGradeStu;
        this.unpassVio = unpassVio;
        this.unpassSubName = unpassSubName;
    }


    public Examunpass() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getUnpassStuId() {
        return unpassStuId;
    }


    public void setUnpassStuId(Integer unpassStuId) {
        this.unpassStuId = unpassStuId;
    }


    public Integer getUnpassSubId() {
        return unpassSubId;
    }


    public void setUnpassSubId(Integer unpassSubId) {
        this.unpassSubId = unpassSubId;
    }


    public Integer getUnpassGradeStu() {
        return unpassGradeStu;
    }


    public void setUnpassGradeStu(Integer unpassGradeStu) {
        this.unpassGradeStu = unpassGradeStu;
    }


    public Integer getUnpassVio() {
        return unpassVio;
    }


    public void setUnpassVio(Integer unpassVio) {
        this.unpassVio = unpassVio;
    }


    public String getUnpassSubName() {
        return unpassSubName;
    }


    public void setUnpassSubName(String unpassSubName) {
        this.unpassSubName = unpassSubName == null ? null : unpassSubName.trim();
    }
}