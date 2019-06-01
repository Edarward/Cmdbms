package com.cmdbms.service;

import com.cmdbms.model.Staffsalary;

import java.util.List;

public interface SalaryLevelSer {

    int insertOne(Staffsalary staffsalary);

    int updateOne(Staffsalary staffsalary);

    List selectOne();

    int deleteOne(int id);

}
