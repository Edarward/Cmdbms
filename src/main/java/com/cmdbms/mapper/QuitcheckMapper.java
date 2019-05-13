package com.cmdbms.mapper;

import com.cmdbms.model.Quitcheck;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuitcheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Quitcheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Quitcheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Quitcheck> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Quitcheck record);
}