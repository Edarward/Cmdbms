package com.cmdbms.mapper;

import com.cmdbms.model.Teaarrange;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaarrangeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Teaarrange record);

    Teaarrange selectByPrimaryKey(Integer id);

    List<Teaarrange> selectAll();

    int updateByPrimaryKey(Teaarrange record);


    /*查询教师姓名，课程名字，上课时间，上课教室，上课日期*/
    String selectTeaNameById(int id);
    String selectClassNameById(int id);

    int selectTeaIdById(int id);
    int selectClassIdById(int id);
}