package com.cmdbms.mapper;

import com.cmdbms.model.Staffsalary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffsalaryMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Staffsalary record);


    Staffsalary selectByPrimaryKey(Integer id);


    List<Staffsalary> selectAll();


    int updateByPrimaryKey(Staffsalary record);
}