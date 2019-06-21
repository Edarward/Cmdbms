package com.cmdbms.mapper;

import com.cmdbms.model.Clubnumber;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubnumberMapper {

    /**
     * Description: 退社审核 删除记录
     * Author: Edarward
     * Date: 2019/6/18
     */
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
    Integer updateById(@Param(value = "id") Integer id,
                   @Param(value = "clubId") Integer clubId,
                   @Param(value = "clubPositionId") Integer clubPositionId);

    /**
     * Description: 查询 入社（退社）申请
     * Param: appState   0为退社申请   1为入社申请
     * Author: Edarward
     * Date: 2019/6/18
     */
    List<Clubnumber> ApplicationList(@Param(value = "appState")Integer appState);

    /**
     * Description: 入社审核 更改状态
     * Author: Edarward
     * Date: 2019/6/18
     */
    int joinAuditing(@Param(value = "Id")Integer Id);

    /**
     * Description: 退社审核 更改状态
     * Author: Edarward
     * Date: 2019/6/18
     */
    int exitAuditing(@Param(value = "Id")Integer Id);
}