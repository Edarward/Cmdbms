package com.cmdbms.service;


import com.cmdbms.model.Financialsubsidies;

import java.util.List;

public interface FinSubsidySer {

    int insertOne(Financialsubsidies f);

    List selectOne();

    List selectOneSelf(int stuId);

    int updateOne(Financialsubsidies f);

    int deleteOne(int id);
}
