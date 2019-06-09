package com.cmdbms.service;

import com.cmdbms.model.Financialconsumables;
import com.cmdbms.model.Financialwage;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FinConsumbSer {

    int insertOne(Financialconsumables financialconsumables);

    List selectOne();

    int updateOne(Financialconsumables financialconsumables);

    int deleteOne(int id);

    int insertTeacherSalary(Financialwage record);

    int teacherUpdateSalary(Financialwage record);

    List selectTeaSal();
}
