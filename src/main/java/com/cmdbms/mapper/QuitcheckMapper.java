package com.cmdbms.mapper;

import com.cmdbms.model.Quitcheck;
import java.util.List;

public interface QuitcheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Quitcheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Quitcheck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Quitcheck> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_quit_check
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Quitcheck record);
}