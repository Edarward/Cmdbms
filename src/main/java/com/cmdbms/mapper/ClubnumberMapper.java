package com.cmdbms.mapper;

import com.cmdbms.model.Clubnumber;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubnumberMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubnumber record);


    Clubnumber selectByPrimaryKey(Integer id);


    List<Clubnumber> selectAll();


    int updateByPrimaryKey(Clubnumber record);

    /**
     * Description: 查询社团成员信息
     * Author: Edarward
     * Date: 2019/6/12
     */
    List<Clubnumber> selectByStudentId(@Param(value = "studentId")Integer studentId);

    /**
     * Description: 修改社团成员信息（所属社团和职务）
     * Author: Edarward
     * Date: 2019/6/14
     */
    int updateById(@Param(value = "id") Integer id,
                   @Param(value = "clubId") Integer clubId,
                   @Param(value = "clubId") Integer clubPositionId);
}