package com.cmdbms.mapper;

import com.cmdbms.model.Financialproject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialprojectMapper {

    int deleteByPrimaryKey(Integer proId);


    int insert(Financialproject record);


    Financialproject selectByPrimaryKey(Integer proId);


    List<Financialproject> selectAll();


    int updateByPrimaryKey(Financialproject record);
}