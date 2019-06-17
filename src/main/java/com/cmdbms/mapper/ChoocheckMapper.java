package com.cmdbms.mapper;

import com.cmdbms.model.Choocheck;
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
    List<Integer> selectstuId(Integer clasId);

    //学生管理用
    List<Choocheck> selectpass(Integer stuId);
}