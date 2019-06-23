package com.cmdbms.mapper;

import com.cmdbms.model.Clubactivity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubactivityMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubactivity record);


    Clubactivity selectByPrimaryKey(Integer id);


    List<Clubactivity> selectAll();


    int updateByPrimaryKey(Clubactivity record);


    List<Clubactivity> selByStatus(@Param(value = "status")int status);


    int clubActAuditing(@Param(value = "reviewStatus")Integer reviewStatus,@Param(value = "id")Integer id);
}