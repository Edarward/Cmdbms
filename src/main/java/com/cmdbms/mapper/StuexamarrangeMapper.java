package com.cmdbms.mapper;

import com.cmdbms.model.Stuexamarrange;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StuexamarrangeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Stuexamarrange record);


    Stuexamarrange selectByPrimaryKey(Integer id);


    List<Stuexamarrange> selectAll();


    int updateByPrimaryKey(Stuexamarrange record);
}