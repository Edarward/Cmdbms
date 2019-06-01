package com.cmdbms.mapper;

import com.cmdbms.model.Teaevaluate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaevaluateMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Teaevaluate record);


    Teaevaluate selectByPrimaryKey(Integer id);


    List<Teaevaluate> selectAll();


    int updateByPrimaryKey(Teaevaluate record);
}