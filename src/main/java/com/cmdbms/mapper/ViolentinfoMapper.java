package com.cmdbms.mapper;

import com.cmdbms.model.Violentinfo;
import java.util.List;

public interface ViolentinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_violent_info
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_violent_info
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int insert(Violentinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_violent_info
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    Violentinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_violent_info
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    List<Violentinfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_violent_info
     *
     * @mbg.generated Mon May 13 10:13:50 CST 2019
     */
    int updateByPrimaryKey(Violentinfo record);
}