package com.cmdbms.mapper;

import com.cmdbms.model.Traininginfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraininginfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Traininginfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Traininginfo selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Traininginfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_training_info
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Traininginfo record);
}