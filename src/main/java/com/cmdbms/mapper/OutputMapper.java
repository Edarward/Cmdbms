package com.cmdbms.mapper;

import com.cmdbms.model.Output;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutputMapper {

    int deleteByPrimaryKey(Integer outputId);


    int insert(Output record);


    Output selectByPrimaryKey(Integer outputId);


    List<Output> selectAll();


    int updateByPrimaryKey(Output record);
}