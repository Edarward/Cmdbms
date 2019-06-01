package com.cmdbms.mapper;

import com.cmdbms.model.Classroom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassroomMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Classroom record);


    Classroom selectByPrimaryKey(Integer id);


    List<Classroom> selectAll();


    int updateByPrimaryKey(Classroom record);
}