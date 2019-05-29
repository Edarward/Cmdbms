package com.cmdbms.mapper;

import com.cmdbms.model.Electric;
import java.util.List;

public interface ElectricMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_electric
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer eleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_electric
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Electric record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_electric
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Electric selectByPrimaryKey(Integer eleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_electric
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Electric> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_electric
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Electric record);
}