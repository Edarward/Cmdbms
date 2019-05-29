package com.cmdbms.mapper;

import com.cmdbms.model.Stugrade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StugradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Stugrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Stugrade selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Stugrade> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stu_grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Stugrade record);
}