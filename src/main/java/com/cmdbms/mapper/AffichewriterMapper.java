package com.cmdbms.mapper;

import com.cmdbms.model.Affichewriter;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AffichewriterMapper {

    int deleteByPrimaryKey(Integer wriId);


    int insert(Affichewriter record);


    Affichewriter selectByPrimaryKey(Integer wriId);


    List<Affichewriter> selectAll();


    int updateByPrimaryKey(Affichewriter record);
}