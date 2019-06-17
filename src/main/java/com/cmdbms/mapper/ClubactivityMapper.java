package com.cmdbms.mapper;

import com.cmdbms.model.Clubactivity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubactivityMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubactivity record);


    Clubactivity selectByPrimaryKey(Integer id);


    List<Clubactivity> selectAll();


    int updateByPrimaryKey(Clubactivity record);
}