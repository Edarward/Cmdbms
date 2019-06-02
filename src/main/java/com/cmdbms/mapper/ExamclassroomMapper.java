package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroom;
import java.util.List;

public interface ExamclassroomMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examclassroom record);


    Examclassroom selectByPrimaryKey(Integer id);


    List<Examclassroom> selectAll();


    int updateByPrimaryKey(Examclassroom record);
}