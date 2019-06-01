package com.cmdbms.mapper;

import com.cmdbms.model.Financialwage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialwageMapper {

    int deleteByPrimaryKey(Integer teaId);


    int insert(Financialwage record);


    Financialwage selectByPrimaryKey(Integer teaId);


    List<Financialwage> selectAll();


    int updateByPrimaryKey(Financialwage record);
}