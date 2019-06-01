package com.cmdbms.mapper;

import com.cmdbms.model.Afficheauditor;
import java.util.List;

public interface AfficheauditorMapper {

    int deleteByPrimaryKey(Integer audId);


    int insert(Afficheauditor record);


    Afficheauditor selectByPrimaryKey(Integer audId);


    List<Afficheauditor> selectAll();


    int updateByPrimaryKey(Afficheauditor record);
}