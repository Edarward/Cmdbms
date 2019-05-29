package com.cmdbms.service.Impl;

import com.cmdbms.mapper.CourseMapper;
import com.cmdbms.mapper.TeaarghisMapper;
import com.cmdbms.mapper.TeaarrangeMapper;
import com.cmdbms.model.Course;
import com.cmdbms.service.CourseManageSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManageSerImpl  implements CourseManageSer {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TeaarrangeMapper teaarrangeMapper;
    @Autowired
    private TeaarghisMapper teaarghisMapper;

    @Override
    public int insertOne(Course course){     return  courseMapper.insert(course); }

    @Override
    public  List selectOne(){
        return   courseMapper.selectAll();
    }

    @Override
    public int updateOne(Course course){
        Course temCourse = courseMapper.selectByPrimaryKey(course.getId());
        if(course.getName() == null)
            course.setName(temCourse.getName());
        if(course.getCompulsory()==null)
            course.setCompulsory(temCourse.getCompulsory());
        if(course.getOfflineTeach() == null)
            course.setOfflineTeach(temCourse.getOfflineTeach());
        if (course.getCredit()==null)
            course.setCredit(temCourse.getCredit());
        if (course.getPeriod()==null)
            course.setPeriod(temCourse.getPeriod());
        return courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public int deleteOne(int id){
        return courseMapper.deleteByPrimaryKey(id);
    }
}
