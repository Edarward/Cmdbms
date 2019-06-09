package com.cmdbms.mapper;

import com.cmdbms.model.Studentquestion;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentquestionMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Studentquestion record);


    Studentquestion selectByPrimaryKey(Integer id);


    List<Studentquestion> selectAll();


    int updateByPrimaryKey(Studentquestion record);
}