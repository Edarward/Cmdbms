package com.cmdbms.mapper;

import com.cmdbms.model.Teaarghis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaarghisMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Teaarghis record);

    Teaarghis selectByPrimaryKey(Integer id);

    List<Teaarghis> selectAll();

    int updateByPrimaryKey(Teaarghis record);
}