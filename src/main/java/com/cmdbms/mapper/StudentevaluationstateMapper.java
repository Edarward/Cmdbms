package com.cmdbms.mapper;

import com.cmdbms.model.Studentevaluationstate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentevaluationstateMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentevaluationstate record);


    Studentevaluationstate selectByPrimaryKey(Integer id);


    List<Studentevaluationstate> selectAll();


    int updateByPrimaryKey(Studentevaluationstate record);
}