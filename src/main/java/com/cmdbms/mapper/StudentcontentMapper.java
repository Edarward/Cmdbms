package com.cmdbms.mapper;

import com.cmdbms.model.Studentcontent;
import java.util.List;

public interface StudentcontentMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentcontent record);


    Studentcontent selectByPrimaryKey(Integer id);


    List<Studentcontent> selectAll();


    int updateByPrimaryKey(Studentcontent record);
}