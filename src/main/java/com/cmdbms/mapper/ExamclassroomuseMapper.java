package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroomuse;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamclassroomuseMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examclassroomuse record);


    Examclassroomuse selectByPrimaryKey(Integer id);


    List<Examclassroomuse> selectAll();


    int updateByPrimaryKey(Examclassroomuse record);
}