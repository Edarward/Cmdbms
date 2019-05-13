package com.cmdbms.mapper;

import com.cmdbms.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Course selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Course> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Course record);
}