package com.cmdbms.mapper;

import com.cmdbms.model.Clubappraising;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClubappraisingMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Clubappraising record);


    Clubappraising selectByPrimaryKey(Integer id);


    List<Clubappraising> selectAll();


    int updateByPrimaryKey(Clubappraising record);
}