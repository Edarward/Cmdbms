package com.cmdbms.mapper;

import com.cmdbms.model.Choosecourse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoosecourseMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Choosecourse record);

    Choosecourse selectByPrimaryKey(Integer id);

    List<Choosecourse> selectAll();

    int updateByPrimaryKey(Choosecourse record);


    //根据查询指定学生的选课信息
    List<Choosecourse> selectStuApply(int stuId);



}