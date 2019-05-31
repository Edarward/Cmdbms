package com.cmdbms.service;

import com.cmdbms.controller.FinStudentCon;
import com.cmdbms.model.Financialstudent;

import java.util.List;

public interface FinStudentSer {

    int insertOne(Financialstudent f);

    List selectOne();

    List selectStuSelf(int stuId);


    int updateOne(Financialstudent f);

    int deleteOne(int id);

}
