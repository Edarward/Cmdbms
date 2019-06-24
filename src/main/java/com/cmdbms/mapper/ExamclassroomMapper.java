package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroom;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamclassroomMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examclassroom record);


    List<Examclassroom> selectByPrimaryKey(String clrType);


    List<Examclassroom> selectAll();


    int updateByPrimaryKey(Examclassroom record);
}