package com.cmdbms.mapper;

import com.cmdbms.model.Clubmessage;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubmessageMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubmessage record);


    Clubmessage selectByPrimaryKey(Integer id);


    List<Clubmessage> selectAll();


    int updateByPrimaryKey(Clubmessage record);
}