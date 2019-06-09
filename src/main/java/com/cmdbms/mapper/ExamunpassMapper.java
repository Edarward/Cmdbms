package com.cmdbms.mapper;

import com.cmdbms.model.Examunpass;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamunpassMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("unpassStuId") Integer unpassStuId);


    int insert(Examunpass record);


    Examunpass selectByPrimaryKey(@Param("id") Integer id, @Param("unpassStuId") Integer unpassStuId);


    List<Examunpass> selectAll();


    int updateByPrimaryKey(Examunpass record);
}