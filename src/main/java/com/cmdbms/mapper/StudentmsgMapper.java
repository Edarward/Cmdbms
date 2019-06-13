package com.cmdbms.mapper;

import com.cmdbms.model.Studentmsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentmsgMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentmsg record);


    List<Studentmsg> selectByPrimaryKey(Integer id);


    List<Studentmsg> selectAll();


    int updateByPrimaryKey(Studentmsg record);
}