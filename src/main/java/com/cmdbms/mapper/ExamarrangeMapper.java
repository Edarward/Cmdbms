package com.cmdbms.mapper;

import com.cmdbms.model.Examarrange;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamarrangeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examarrange record);


    Examarrange selectByPrimaryKey(Integer id);


    List<Examarrange> selectAll();


    int updateByPrimaryKey(Examarrange record);
}