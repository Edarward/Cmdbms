package com.cmdbms.mapper;

import com.cmdbms.model.Afficheauditor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheauditorMapper {

    int deleteByPrimaryKey(Integer audId);


    int insert(Afficheauditor record);


    Afficheauditor selectByPrimaryKey(Integer audId);


    List<Afficheauditor> selectAll();


    int updateByPrimaryKey(Afficheauditor record);
}