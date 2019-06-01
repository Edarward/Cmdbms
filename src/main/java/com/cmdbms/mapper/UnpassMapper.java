package com.cmdbms.mapper;

import com.cmdbms.model.Unpass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnpassMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Unpass record);


    Unpass selectByPrimaryKey(Integer id);


    List<Unpass> selectAll();


    int updateByPrimaryKey(Unpass record);
}