package com.cmdbms.mapper;

import com.cmdbms.model.Financialconsumables;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialconsumablesMapper {

    int deleteByPrimaryKey(Integer matId);


    int insert(Financialconsumables record);


    Financialconsumables selectByPrimaryKey(Integer matId);


    List<Financialconsumables> selectAll();


    int updateByPrimaryKey(Financialconsumables record);
}