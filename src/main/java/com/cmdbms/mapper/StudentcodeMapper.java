package com.cmdbms.mapper;

import com.cmdbms.model.Studentcode;
import java.util.List;

public interface StudentcodeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentcode record);


    Studentcode selectByPrimaryKey(Integer id);


    List<Studentcode> selectAll();


    int updateByPrimaryKey(Studentcode record);
}