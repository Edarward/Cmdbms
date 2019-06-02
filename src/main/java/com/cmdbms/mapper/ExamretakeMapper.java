package com.cmdbms.mapper;

import com.cmdbms.model.Examretake;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamretakeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examretake record);


    Examretake selectByPrimaryKey(Integer id);


    List<Examretake> selectAll();


    int updateByPrimaryKey(Examretake record);
}