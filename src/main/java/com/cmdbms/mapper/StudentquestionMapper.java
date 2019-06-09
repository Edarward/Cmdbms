package com.cmdbms.mapper;

import com.cmdbms.model.Studentquestion;
import java.util.List;

public interface StudentquestionMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentquestion record);


    Studentquestion selectByPrimaryKey(Integer id);


    List<Studentquestion> selectAll();


    int updateByPrimaryKey(Studentquestion record);
}