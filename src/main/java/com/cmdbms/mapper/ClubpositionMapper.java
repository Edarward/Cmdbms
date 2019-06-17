package com.cmdbms.mapper;

import com.cmdbms.model.Clubposition;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubpositionMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubposition record);


    Clubposition selectByPrimaryKey(Integer id);


    List<Clubposition> selectAll();


    int updateByPrimaryKey(Clubposition record);
}