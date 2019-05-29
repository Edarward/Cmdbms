package com.cmdbms.model;

public class Teaarrange {

    private Integer id;

    private Integer classId;

    private Integer teacherId;

    public Teaarrange(Integer id, Integer classId, Integer teacherId) {
        this.id = id;
        this.classId = classId;
        this.teacherId = teacherId;
    }

    public Teaarrange() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}