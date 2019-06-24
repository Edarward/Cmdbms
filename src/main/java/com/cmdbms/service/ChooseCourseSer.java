package com.cmdbms.service;

import com.cmdbms.model.Choocheck;
import com.cmdbms.model.Choosecourse;

import java.text.ParseException;
import java.util.List;

public interface ChooseCourseSer {


    List selectStudentGrade();


    List selectCheckChooseInfo() throws Exception;

    List selectCheckQuitInfo() throws Exception;


    //使用此方法进行选课
    int stuChooseApply(Choosecourse choosecourse);

    //查询选课信息
    List selectOne();

    int updateOne(Choosecourse choosecourse);

    int deleteOne(int id);


    //获取学生的选课信息（未选课程，已选课程）
    List selectChooseInfo(int stuId);


    //通过此方法审核选课申请
    int checkChooseInfo(Choocheck choocheck);

}
