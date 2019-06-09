package com.cmdbms.mapper;

import com.cmdbms.model.Studentevaluationstate;
import java.util.List;

public interface StudentevaluationstateMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentevaluationstate record);


    Studentevaluationstate selectByPrimaryKey(Integer id);


    List<Studentevaluationstate> selectAll();


    int updateByPrimaryKey(Studentevaluationstate record);
}