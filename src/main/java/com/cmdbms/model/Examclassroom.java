package com.cmdbms.model;

public class Examclassroom {

    private Integer id;


    private String clrName;


    private String clrType;


    private String clrSize;


    private String clrState;


    public Examclassroom(Integer id, String clrName, String clrType, String clrSize, String clrState) {
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


    public String getClrType() {
        return clrType;
    }


    public void setClrType(String clrType) {
        this.clrType = clrType;
    }


    public String getClrSize() {
        return clrSize;
    }


    public void setClrSize(String clrSize) {
        this.clrSize = clrSize == null ? null : clrSize.trim();
    }


    public String getClrState() {
        return clrState;
    }


    public void setClrState(String clrState) {
        this.clrState = clrState;
    }
}