package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroomuse;
import java.util.List;

public interface ExamclassroomuseMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examclassroomuse record);


    Examclassroomuse selectByPrimaryKey(Integer id);


    List<Examclassroomuse> selectAll();


    int updateByPrimaryKey(Examclassroomuse record);
}