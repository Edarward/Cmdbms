package com.cmdbms.mapper;

import com.cmdbms.model.Examgrade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamgradeMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("gradeStuId") Integer gradeStuId);


    int insert(Examgrade record);


    Examgrade selectByPrimaryKey(@Param("id") Integer id, @Param("gradeStuId") Integer gradeStuId);


    List<Examgrade> selectAll();


    int updateByPrimaryKey(Examgrade record);
}