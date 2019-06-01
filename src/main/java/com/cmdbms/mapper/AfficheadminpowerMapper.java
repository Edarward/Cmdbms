package com.cmdbms.mapper;

import com.cmdbms.model.Afficheadminpower;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheadminpowerMapper {

    int deleteByPrimaryKey(Integer adminPowId);


    int insert(Afficheadminpower record);


    Afficheadminpower selectByPrimaryKey(Integer adminPowId);


    List<Afficheadminpower> selectAll();


    int updateByPrimaryKey(Afficheadminpower record);
}