package com.cmdbms.service.Impl;

import com.cmdbms.mapper.CourseMapper;
import com.cmdbms.model.Course;
import com.cmdbms.service.CourseManageSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManageSerImpl  implements CourseManageSer {

    @Autowired
    CourseMapper courseMapper;


    @Override
    public int insertOne(Course course){

        return  courseMapper.insert(course);
    }

    @Override
    public  List selectOne(){
        return   courseMapper.selectAll();
    }

    @Override
    public int updateOne(Course course){
        return courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public int deleteOne(int id){
        return courseMapper.deleteByPrimaryKey(id);
    }
}
