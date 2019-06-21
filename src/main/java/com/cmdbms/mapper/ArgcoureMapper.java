package com.cmdbms.mapper;

import com.cmdbms.model.Argcoure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ArgcoureMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Argcoure record);

    Argcoure selectByPrimaryKey(Integer id);

    List seleByClasAndTea(int teaId,int classId);

    List<Argcoure> selectAll();

    int updateByPrimaryKey(Argcoure record);


    /*查询教师姓名，课程名字，上课时间，上课教室，上课日期*/
    String selectTeaNameById(int id);
    String selectClassNameById(int id);

    //学生管理用
    int selectTeaId(Integer classId);

}