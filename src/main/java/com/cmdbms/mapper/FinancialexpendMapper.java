package com.cmdbms.mapper;

import com.cmdbms.model.Financialexpend;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialexpendMapper {

    int deleteByPrimaryKey(Integer finId);


    int insert(Financialexpend record);


    Financialexpend selectByPrimaryKey(Integer finId);


    List<Financialexpend> selectAll();


    int updateByPrimaryKey(Financialexpend record);
}