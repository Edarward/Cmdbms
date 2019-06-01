package com.cmdbms.mapper;

import com.cmdbms.model.Financialstudent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialstudentMapper {

    int deleteByPrimaryKey(@Param("stuId") Integer stuId, @Param("proId") Integer proId);


    int insert(Financialstudent record);


    Financialstudent selectByPrimaryKey(@Param("stuId") Integer stuId, @Param("proId") Integer proId);


    List<Financialstudent> selectAll();


    int updateByPrimaryKey(Financialstudent record);

    String selectProNameById(int proId);

    String selectStuNameById(int stuId);

    List<Financialstudent> selectStuSelf(int stuId);


}