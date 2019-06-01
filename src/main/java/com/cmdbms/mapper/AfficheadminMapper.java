package com.cmdbms.mapper;

import com.cmdbms.model.Afficheadmin;
import java.util.List;

public interface AfficheadminMapper {

    int deleteByPrimaryKey(Integer adminId);


    int insert(Afficheadmin record);


    Afficheadmin selectByPrimaryKey(Integer adminId);


    List<Afficheadmin> selectAll();


    int updateByPrimaryKey(Afficheadmin record);
}