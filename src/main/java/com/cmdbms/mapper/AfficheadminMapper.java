package com.cmdbms.mapper;

import com.cmdbms.model.Afficheadmin;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheadminMapper {

    int deleteByPrimaryKey(Integer adminId);


    int insert(Afficheadmin record);


    Afficheadmin selectByPrimaryKey(Integer adminId);


    List<Afficheadmin> selectAll();


    int updateByPrimaryKey(Afficheadmin record);
}