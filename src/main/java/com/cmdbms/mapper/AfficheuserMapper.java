package com.cmdbms.mapper;

import com.cmdbms.model.Afficheuser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AfficheuserMapper {

    int deleteByPrimaryKey(Integer userId);


    int insert(Afficheuser record);


    Afficheuser selectByPrimaryKey(Integer userId);


    List<Afficheuser> selectAll();


    int updateByPrimaryKey(Afficheuser record);
}