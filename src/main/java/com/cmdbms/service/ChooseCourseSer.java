package com.cmdbms.service;

import com.cmdbms.model.Choosecourse;

import java.util.List;

public interface ChooseCourseSer {

    int stuChooseApply(Choosecourse choosecourse);

    List selectOne();

    int updateOne(Choosecourse choosecourse);

    int deleteOne(int id);


    //获取学生的选课信息（未选课程，已选课程）
    List selectChooseInfo();
}
