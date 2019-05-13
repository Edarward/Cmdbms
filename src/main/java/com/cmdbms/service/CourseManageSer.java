package com.cmdbms.service;

import com.cmdbms.model.Course;

import java.util.List;

public interface CourseManageSer {

    int insertOne(Course course);

    List selectOne();

    int updateOne(Course course);

    int deleteOne(int id);
}
