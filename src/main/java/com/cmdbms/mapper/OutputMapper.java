package com.cmdbms.mapper;

import com.cmdbms.model.Output;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OutputMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_output
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer outputId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_output
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Output record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_output
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Output selectByPrimaryKey(Integer outputId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_output
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Output> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_output
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Output record);
}