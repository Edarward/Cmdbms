package com.cmdbms.mapper;

import com.cmdbms.model.Teaevaluate;
import java.util.List;

public interface TeaevaluateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int insert(Teaevaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    Teaevaluate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    List<Teaevaluate> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_evaluate
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int updateByPrimaryKey(Teaevaluate record);
}