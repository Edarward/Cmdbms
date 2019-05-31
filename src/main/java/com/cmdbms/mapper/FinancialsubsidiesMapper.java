package com.cmdbms.mapper;

import com.cmdbms.model.Financialsubsidies;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialsubsidiesMapper {

    int deleteByPrimaryKey(Integer stuId);

    int insert(Financialsubsidies record);

    Financialsubsidies selectByPrimaryKey(Integer stuId);

    List<Financialsubsidies> selectAll();

    List<Financialsubsidies> selectOneByStuid(int stuId);

    int updateByPrimaryKey(Financialsubsidies record);



}