package com.cmdbms.mapper;

import com.cmdbms.model.Examviolent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamviolentMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("vioStuId") Integer vioStuId);


    int insert(Examviolent record);


    Examviolent selectByPrimaryKey(@Param("id") Integer id, @Param("vioStuId") Integer vioStuId);


    List<Examviolent> selectAll();


    int updateByPrimaryKey(Examviolent record);
}