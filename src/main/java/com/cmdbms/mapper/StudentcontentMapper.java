package com.cmdbms.mapper;

import com.cmdbms.model.Studentcontent;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentcontentMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentcontent record);


    Studentcontent selectByPrimaryKey(Integer id);


    List<Studentcontent> selectAll();


    int updateByPrimaryKey(Studentcontent record);
}