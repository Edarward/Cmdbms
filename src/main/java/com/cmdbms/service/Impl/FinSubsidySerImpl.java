package com.cmdbms.service.Impl;

import com.cmdbms.mapper.FinancialsubsidiesMapper;
import com.cmdbms.model.Financialsubsidies;
import com.cmdbms.service.FinSubsidySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FinSubsidySerImpl implements FinSubsidySer {

    @Autowired
    FinancialsubsidiesMapper financialsubsidiesMapper;

    public int insertOne(Financialsubsidies record){

        System.out.println(record.getStuName());
        System.out.println(record.getStiReason());
        System.out.println(record.getStiGrade());
        System.out.println(record.getStuAdress());
        record.setStiState("1");
        return financialsubsidiesMapper.insert(record);
    }

    public List selectOne(){
        return  financialsubsidiesMapper.selectAll();
    }

    public List selectOneSelf(int stuId){


        return financialsubsidiesMapper.selectOneByStuid(stuId);
    }

    public int updateOne(Financialsubsidies record){

        return financialsubsidiesMapper.updateByPrimaryKey(record);
    }

    public int deleteOne(int id){
        return 0;
    }


}
