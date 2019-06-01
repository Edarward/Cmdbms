package com.cmdbms.mapper;

import com.cmdbms.model.Affichenotice;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AffichenoticeMapper {

    int deleteByPrimaryKey(Integer notId);


    int insert(Affichenotice record);


    Affichenotice selectByPrimaryKey(Integer notId);


    List<Affichenotice> selectAll();


    int updateByPrimaryKey(Affichenotice record);
}