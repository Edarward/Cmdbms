package com.cmdbms.mapper;

import com.cmdbms.model.Examclassroomuse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ExamclassroomuseMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "useClrId")Integer useClrId,
               @Param(value = "useClrTime")Integer useClrTime,
               @Param(value = "useClrDate") Date useClrDate,
               @Param(value = "useThrough")Integer useThrough,
               @Param(value = "useClrName")String useClrName);


    List<Examclassroomuse> selectByPrimaryKey(@Param(value = "useThrough")Integer useThrough);

    List<Examclassroomuse> selectByPrimaryKeytwo(Date useClrDate);

    List<Examclassroomuse> selectAll();


    int updateByPrimaryKey(@Param(value = "id")Integer id,
                           @Param(value = "useThrough")Integer useThrough);
}