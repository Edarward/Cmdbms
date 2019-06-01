package com.cmdbms.mapper;

import com.cmdbms.model.Affichewriter;
import java.util.List;

public interface AffichewriterMapper {

    int deleteByPrimaryKey(Integer wriId);


    int insert(Affichewriter record);


    Affichewriter selectByPrimaryKey(Integer wriId);


    List<Affichewriter> selectAll();


    int updateByPrimaryKey(Affichewriter record);
}