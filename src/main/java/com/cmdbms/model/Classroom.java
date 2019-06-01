package com.cmdbms.model;

public class Classroom {

    private Integer id;


    private String name;


    private Integer type;


    private String size;


    private Integer state;


    public Classroom(Integer id, String name, Integer type, String size, Integer state) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.state = state;
    }


    public Classroom() {
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


    public Integer getType() {
        return type;
    }


    public void setType(Integer type) {
        this.type = type;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }


    public Integer getState() {
        return state;
    }


    public void setState(Integer state) {
        this.state = state;
    }
}