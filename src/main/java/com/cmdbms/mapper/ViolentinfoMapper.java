package com.cmdbms.mapper;

import com.cmdbms.model.Violentinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViolentinfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Violentinfo record);


    Violentinfo selectByPrimaryKey(Integer id);


    List<Violentinfo> selectAll();


    int updateByPrimaryKey(Violentinfo record);
}