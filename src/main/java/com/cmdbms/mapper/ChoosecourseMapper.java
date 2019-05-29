package com.cmdbms.mapper;

import com.cmdbms.model.Choosecourse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoosecourseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Choosecourse record);

    Choosecourse selectByPrimaryKey(Integer id);

    List<Choosecourse> selectAll();

    int updateByPrimaryKey(Choosecourse record);

    List<Choosecourse> selectStuApply();
}