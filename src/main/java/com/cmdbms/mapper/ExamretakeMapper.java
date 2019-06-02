package com.cmdbms.mapper;

import com.cmdbms.model.Examretake;
import java.util.List;

public interface ExamretakeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examretake record);


    Examretake selectByPrimaryKey(Integer id);


    List<Examretake> selectAll();


    int updateByPrimaryKey(Examretake record);
}