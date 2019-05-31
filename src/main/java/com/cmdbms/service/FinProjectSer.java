package com.cmdbms.service;

import com.cmdbms.model.Financialproject;

import java.util.List;

public interface FinProjectSer {

    int insertOne(Financialproject financialproject);

    List selectOne();

    int updateOne(Financialproject financialproject);

    int deleteOne(int id);

}
