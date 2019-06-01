package com.cmdbms.mapper;

import com.cmdbms.model.Afficheuser;
import java.util.List;

public interface AfficheuserMapper {

    int deleteByPrimaryKey(Integer userId);


    int insert(Afficheuser record);


    Afficheuser selectByPrimaryKey(Integer userId);


    List<Afficheuser> selectAll();


    int updateByPrimaryKey(Afficheuser record);
}