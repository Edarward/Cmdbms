package com.cmdbms.mapper;

import com.cmdbms.model.Quitcoure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuitcoureMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Quitcoure record);


    Quitcoure selectByPrimaryKey(Integer id);


    List<Quitcoure> selectAll();


    int updateByPrimaryKey(Quitcoure record);
}