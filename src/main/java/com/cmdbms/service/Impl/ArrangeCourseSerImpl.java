package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ArgcoureMapper;
import com.cmdbms.model.Argcoure;
import com.cmdbms.service.ArrangeCourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrangeCourseSerImpl implements ArrangeCourseSer{

    @Autowired
    ArgcoureMapper argcoureMapper;

    @Override
    public int insertOne(Argcoure course){
        return  argcoureMapper.insert(course);
    }

    @Override
    public List selectOne(){
        return argcoureMapper.selectAll();
    }

    @Override
    public int updateOne(Argcoure course){
        return argcoureMapper.updateByPrimaryKey(course);
    }

    @Override
    public int deleteOne(int id){
        return argcoureMapper.deleteByPrimaryKey(id);
    }

}
