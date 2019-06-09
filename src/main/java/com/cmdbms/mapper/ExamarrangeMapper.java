package com.cmdbms.mapper;

import com.cmdbms.model.Examarrange;
import java.util.List;

public interface ExamarrangeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examarrange record);


    Examarrange selectByPrimaryKey(Integer id);


    List<Examarrange> selectAll();


    int updateByPrimaryKey(Examarrange record);
}