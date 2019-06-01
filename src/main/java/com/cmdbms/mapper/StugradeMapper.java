package com.cmdbms.mapper;

import com.cmdbms.model.Stugrade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StugradeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Stugrade record);


    Stugrade selectByPrimaryKey(Integer id);


    List<Stugrade> selectAll();


    int updateByPrimaryKey(Stugrade record);
}