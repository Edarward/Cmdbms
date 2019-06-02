package com.cmdbms.model;

public class Examclassroom {

    private Integer id;


    private String clrName;


    private Integer clrType;


    private String clrSize;


    private Integer clrState;


    public Examclassroom(Integer id, String clrName, Integer clrType, String clrSize, Integer clrState) {
        this.id = id;
        this.clrName = clrName;
        this.clrType = clrType;
        this.clrSize = clrSize;
        this.clrState = clrState;
    }


    public Examclassroom() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getClrName() {
        return clrName;
    }


    public void setClrName(String clrName) {
        this.clrName = clrName == null ? null : clrName.trim();
    }


    public Integer getClrType() {
        return clrType;
    }


    public void setClrType(Integer clrType) {
        this.clrType = clrType;
    }


    public String getClrSize() {
        return clrSize;
    }


    public void setClrSize(String clrSize) {
        this.clrSize = clrSize == null ? null : clrSize.trim();
    }


    public Integer getClrState() {
        return clrState;
    }


    public void setClrState(Integer clrState) {
        this.clrState = clrState;
    }
}