package com.cmdbms.mapper;

import com.cmdbms.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    Course selectByPrimaryKey(Integer id);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);

    int selectIDfromName(String name);

    String selectNamefromId(int id);

    String selectStuNamefromId(int id);
    /*查询课表信息*/
    //List selectCourse();
}