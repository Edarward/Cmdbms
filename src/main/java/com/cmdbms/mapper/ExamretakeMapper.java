package com.cmdbms.mapper;

import com.cmdbms.model.Examretake;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExamretakeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Examretake record);


    List<Examretake> selectByPrimaryKey(Integer exuseThrough);


    List<Examretake> selectByPrimaryKeytwo(Integer exuseStuId);


    List<Examretake> selectAll();


    int updateByPrimaryKey(Examretake record);
}