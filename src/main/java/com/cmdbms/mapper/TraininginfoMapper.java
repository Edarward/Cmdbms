package com.cmdbms.mapper;

import com.cmdbms.model.Traininginfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraininginfoMapper {

    int deleteByPrimaryKey(Integer staffId);


    int insert(Traininginfo record);


    Traininginfo selectByPrimaryKey(Integer staffId);


    List<Traininginfo> selectAll();


    int updateByPrimaryKey(Traininginfo record);
}