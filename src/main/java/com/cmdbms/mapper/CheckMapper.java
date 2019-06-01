package com.cmdbms.mapper;

import com.cmdbms.model.Check;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckMapper {

    int deleteByPrimaryKey(Integer cheId);


    int insert(Check record);


    Check selectByPrimaryKey(Integer cheId);


    List<Check> selectAll();


    int updateByPrimaryKey(Check record);
}