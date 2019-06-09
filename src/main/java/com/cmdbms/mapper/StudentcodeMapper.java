package com.cmdbms.mapper;

import com.cmdbms.model.Studentcode;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentcodeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentcode record);


    Studentcode selectByPrimaryKey(Integer id);


    List<Studentcode> selectAll();


    int updateByPrimaryKey(Studentcode record);
}