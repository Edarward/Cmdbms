package com.cmdbms.mapper;

import com.cmdbms.model.Spoilage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpoilageMapper {

    int deleteByPrimaryKey(Integer spoId);


    int insert(Spoilage record);


    Spoilage selectByPrimaryKey(Integer spoId);


    List<Spoilage> selectAll();


    int updateByPrimaryKey(Spoilage record);
}