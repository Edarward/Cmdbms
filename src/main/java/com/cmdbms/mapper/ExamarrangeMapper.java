package com.cmdbms.mapper;

import com.cmdbms.model.Examarrange;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ExamarrangeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "examSubId")Integer examSubId,
               @Param(value = "examDate")Date examDate,
               @Param(value = "examTime")Integer examTime,
               @Param(value = "examClassroomId")Integer examClassroomId,
               @Param(value = "examClrName")String examClrName,
               @Param(value = "examSubName")String examSubName,
               @Param(value = "examYear")Integer examYear);


    List<Examarrange> selectByPrimaryKey(@Param(value = "id")Integer id);


    List<Examarrange> selectAll();


    int updateByPrimaryKey(@Param(value = "id")Integer id,
                           @Param(value = "examDate")Date examDate,
                           @Param(value = "examTime")Integer examTime,
                           @Param(value = "examClassroomId")Integer examClassroomId,
                           @Param(value = "examClrName")String examClrName
                           );
}