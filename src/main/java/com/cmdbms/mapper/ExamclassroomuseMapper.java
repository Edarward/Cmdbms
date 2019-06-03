package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroomuse;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamclassroomuseMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examclassroomuse record);


    List<Examclassroomuse> selectByPrimaryKey(Integer useThrough);


    List<Examclassroomuse> selectAll();


    int updateByPrimaryKey(Examclassroomuse record);
}