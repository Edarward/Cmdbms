package com.cmdbms.mapper;

import com.cmdbms.model.Classroomuse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassroomuseMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Classroomuse record);


    Classroomuse selectByPrimaryKey(Integer id);


    List<Classroomuse> selectAll();


    int updateByPrimaryKey(Classroomuse record);
}