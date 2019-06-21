package com.cmdbms.mapper;

import com.cmdbms.model.Examviolent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamviolentMapper {

    int deleteByPrimaryKey(@Param("id") Integer id,
                           @Param("vioStuId") Integer vioStuId);


    int insert(@Param(value = "id") Integer id,
               @Param(value = "vioStuId") Integer vioStuId);


    List<Examviolent> selectByPrimaryKey(@Param("id") Integer id);


    List<Examviolent> selectAll();


    int updateByPrimaryKey(@Param("id")Integer id,
                           @Param("vioStuId")Integer vioStuId,
                           @Param("vioBehavior")String vioBehavior,
                           @Param("vioContent")String vioContent,
                           @Param("vioLevel")Integer vioLevel
                            );
}