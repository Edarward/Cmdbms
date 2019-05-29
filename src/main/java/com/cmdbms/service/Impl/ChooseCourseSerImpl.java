package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ChoosecourseMapper;
import com.cmdbms.model.Choosecourse;
import com.cmdbms.service.ChooseCourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChooseCourseSerImpl implements ChooseCourseSer {

    @Autowired
    ChoosecourseMapper choosecourseMapper;

    @Override
    public int stuChooseApply(Choosecourse choosecourse){
        System.out.println(choosecourse.getApplytime());
        System.out.println(choosecourse.getStuID());
        return choosecourseMapper.insert(choosecourse);
    }

    @Override
    public List selectOne(){
        return null;
    }

    @Override
    public int updateOne(Choosecourse choosecourse){
        return  0;
    }

    @Override
    public int deleteOne(int id){
        return choosecourseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List selectChooseInfo(){
        List resList = new ArrayList();
        List applyList = choosecourseMapper.selectAll();
        
        return resList;
    }
}
