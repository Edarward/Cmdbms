package com.cmdbms.mapper;

import com.cmdbms.model.Examstuarrange;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ExamstuarrangeMapper {

    int deleteByPrimaryKey(@Param("id") Integer id);


    int insert(@Param(value = "id")Integer id,
               @Param(value = "stuexamStuId")Integer stuexamStuId,
               @Param(value = "stuexamClrId")Integer stuexamClrId,
               @Param(value = "stuexamSubId")Integer stuexamSubId,
               @Param(value = "stuexamDate")Date stuexamDate,
               @Param(value = "stuexamTime")Integer stuexamTime,
               @Param(value = "stuexamClrName")String stuexamClrName,
               @Param(value = "stuexamSubName")String stuexamSubName,
               @Param(value = "stuexamYear")Integer stuexamYear);


    List<Examstuarrange> selectByPrimaryKey(@Param("id") Integer id, @Param("stuexamStuId") Integer stuexamStuId);


    List<Examstuarrange> selectAll();


    int updateByPrimaryKey(@Param(value = "id")Integer id,
                           @Param(value = "stuexamClrId")Integer stuexamClrId,
                           @Param(value = "stuexamDate")Date stuexamDate,
                           @Param(value = "stuexamTime")Integer stuexamTime,
                           @Param(value = "stuexamClrName")String stuexamClrName
                           );


//学生管理用
    List<Examstuarrange> selectStuexam(Integer stuexamStuId);
}