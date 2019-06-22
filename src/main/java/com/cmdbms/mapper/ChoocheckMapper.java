package com.cmdbms.mapper;

import com.cmdbms.model.Choocheck;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ChoocheckMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Choocheck record);


    Choocheck selectByPrimaryKey(Integer id);


    List<Choocheck> selectAll();


    int updateByPrimaryKey(Choocheck record);


    Timestamp selApplTimeByClaIdAndStuId(int classId,int StudentId);

    int selChooseIdByClaIdAndStuId(int classId,int StudentId);

    int selChoCourIdByClaIdAndStuId(int classId,int StudentId);

    List selectInfoByStuId(int stuId);

    //考试管理使用
    List<Integer> selectstuId(@Param(value = "clasId")Integer clasId,
                              @Param(value = "pass")Boolean pass );

    //学生管理用
    List<Choocheck> selectpass(Integer stuId);

    //学生管理用
    List<Integer> selectclasId(Integer stuId);

    //学生管理
    List<Integer> selectAlls(@Param(value = "stuId")Integer stuId,
                             @Param(value = "pass")Boolean pass);
}