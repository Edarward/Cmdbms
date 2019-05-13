package com.cmdbms.mapper;

import com.cmdbms.model.Purchasing;
import java.util.List;

public interface PurchasingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_purchasing
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int deleteByPrimaryKey(Integer purId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_purchasing
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int insert(Purchasing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_purchasing
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    Purchasing selectByPrimaryKey(Integer purId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_purchasing
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    List<Purchasing> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_purchasing
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int updateByPrimaryKey(Purchasing record);
}