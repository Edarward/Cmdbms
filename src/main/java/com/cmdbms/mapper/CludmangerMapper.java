package com.cmdbms.mapper;

import com.cmdbms.model.Cludmanger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CludmangerMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Cludmanger record);


    Cludmanger selectByPrimaryKey(Integer id);


    List<Cludmanger> selectAll();


    int updateByPrimaryKey(Cludmanger record);
}