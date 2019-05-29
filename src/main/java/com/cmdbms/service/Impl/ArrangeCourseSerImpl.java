package com.cmdbms.service.Impl;
import com.cmdbms.mapper.*;
import com.cmdbms.model.Argcoure;
import com.cmdbms.model.Teaarghis;
import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.ArrangeCourseSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**************************测试成功**************************/
@Service
public class ArrangeCourseSerImpl implements ArrangeCourseSer{

    @Autowired
    ArgcoureMapper argcoureMapper;
    @Autowired
    CourseMapper courseMapper ;
    @Autowired
    StaffmsgMapper staffmsgMapper;
    @Autowired
    TeaarrangeMapper teaarrangeMapper;
    @Autowired
    TeaarghisMapper teaarghisMapper;

    @Override
    public int insertOne(Argcoure argcoure){

        System.out.println(argcoure.getTeacherId());
        System.out.println(argcoure.getClassId());
        System.out.println(argcoure.getTestTime());
        System.out.println(argcoure.getCourseTime());
        System.out.println(argcoure.getClassroomId());
        System.out.println(argcoure.getDegree());
        System.out.println(argcoure.getId());
        System.out.println(argcoure.getCoureDate());
        //为老师设置课程，向教师排课表内添加数据
        Teaarrange teaarrange = new Teaarrange(null,argcoure.getClassId(),argcoure.getTeacherId());
        //向老师排课历史表内插入数据
        Teaarghis teaarghis = new Teaarghis(null,argcoure.getClassId(),argcoure.getTeacherId(),
                argcoure.getCourseTime(), argcoure.getCourseTime());

        return  (argcoureMapper.insert(argcoure)==0)&&(teaarrangeMapper.insert(teaarrange)==0)&&(teaarghisMapper.insert(teaarghis)==0)?0:1;
    }
    /**********测试成功*********/
    @Override
    public List selectOne(){
        List<Argcoure> argcoureList = argcoureMapper.selectAll();
        List resList = new ArrayList();

        for (int i =0;i<argcoureList.size();i++){
            Argcoure argcoure=argcoureList.get(i);
            String courseName = courseMapper.selectNamefromId(argcoure.getClassId());
            String teacherName = staffmsgMapper.selectNamefromId(argcoure.getTeacherId());
            System.out.println(courseName);
            System.out.println(argcoure.getClassId());
            Map temMap = new HashMap();
            temMap.put("id",argcoure.getId());
            temMap.put("classId",argcoure.getClassId());
            temMap.put("className",courseName);
            temMap.put("teacherId",argcoure.getTeacherId());
            temMap.put("teacherName",teacherName);
            temMap.put("classroomId",argcoure.getClassroomId());
            temMap.put("coureDate",argcoure.getCoureDate());
            temMap.put("courseTime",argcoure.getCourseTime());
            resList.add(temMap);
        }
        return resList;
    }

    /**********测试成功********/
    @Override
    public int updateOne(Argcoure course){

        Argcoure argcoure = argcoureMapper.selectByPrimaryKey(course.getId());
        if (course.getTeacherId() == null)
            course.setTeacherId(argcoure.getTeacherId());
        if (course.getClassId() == null)
            course.setClassId(argcoure.getClassId());
        if (course.getCoureDate() == null)
            course.setCoureDate(argcoure.getCoureDate());
        if (course.getClassroomId() == null)
            course.setClassroomId(argcoure.getClassroomId());
        if (course.getTestTime() == null)
            course.setTestTime(argcoure.getTestTime());
        if (course.getDegree() == null)
            course.setDegree(argcoure.getDegree());
        if (course.getCourseTime() == null)
            course.setCourseTime(argcoure.getCourseTime());
        return argcoureMapper.updateByPrimaryKey(course);
    }

    @Override
    public int deleteOne(int id){
        return argcoureMapper.deleteByPrimaryKey(id);
    }

}
