package com.cmdbms.mapper;

import com.cmdbms.model.Studentcontent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentcontentMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "stuId")Integer stuId,
               @Param(value = "stuTeacherid")Integer stuTeacherid,
               @Param(value = "stuCourseid")Integer stuCourseid,
               @Param(value = "stuQuestionid")Integer stuQuestionid,
               @Param(value = "stuType") String stuType,
               @Param(value = "stuContent") String stuContent);


    Studentcontent selectByPrimaryKey(Integer id);


    List<Studentcontent> selectAll();


    int updateByPrimaryKey(Studentcontent record);
}