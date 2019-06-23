package com.cmdbms.mapper;

import com.cmdbms.model.Clubmanager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubmanagerMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubmanager record);


    Clubmanager selectByPrimaryKey(Integer id);


    List<Clubmanager> selectAll();


    int updateByPrimaryKey(Clubmanager record);

    /**
     * Description: 根据社团状态返回社团列表
     * Param: cludStatus  社团状态  0为全部查询
     * return: id  name
     * Author: Edarward
     */
    List<Clubmanager> selectByClubStatus (@Param(value = "clubStatus")Integer clubStatus);

    int clubStatus (@Param(value = "id")Integer id,@Param(value = "clubStatus")Integer clubStatus);
}