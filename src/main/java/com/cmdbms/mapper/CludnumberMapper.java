package com.cmdbms.mapper;

import com.cmdbms.model.Cludnumber;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CludnumberMapper {

    int deleteByPrimaryKey(@Param("studentId") Integer studentId, @Param("cludId") Integer cludId);


    int insert(Cludnumber record);


    Cludnumber selectByPrimaryKey(@Param("studentId") Integer studentId, @Param("cludId") Integer cludId);


    List<Cludnumber> selectAll();


    int updateByPrimaryKey(Cludnumber record);
}