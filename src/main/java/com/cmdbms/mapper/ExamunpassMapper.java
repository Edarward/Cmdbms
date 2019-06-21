package com.cmdbms.mapper;

import com.cmdbms.model.Examunpass;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamunpassMapper {

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("unpassStuId") Integer unpassStuId);


    int insert(@Param(value = "id") Integer id,
               @Param(value = "unpassSubId")Integer unpassSubId,
               @Param(value = "unpassStuId")Integer unpassStuId,
               @Param(value = "unpassGradeStu") Integer unpassGradeStu,
               @Param(value = "unpassVio")Integer unpassVio,
               @Param(value = "unpassSubName")String unpassSubName);


   List<Examunpass> selectByPrimaryKey(@Param("unpassStuId") Integer unpassStuId);


    List<Examunpass> selectAll();


    int updateByPrimaryKey(Examunpass record);
}