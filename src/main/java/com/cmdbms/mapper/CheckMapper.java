package com.cmdbms.mapper;

import com.cmdbms.model.Check;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer cheId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Check record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Check selectByPrimaryKey(Integer cheId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Check> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Check record);
}