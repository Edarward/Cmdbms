package com.cmdbms.mapper;

import com.cmdbms.model.Reexam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReexamMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Reexam record);


    Reexam selectByPrimaryKey(Integer id);


    List<Reexam> selectAll();


    int updateByPrimaryKey(Reexam record);
}