package com.cmdbms.service.Impl;


import com.cmdbms.mapper.FinancialprojectMapper;
import com.cmdbms.model.Financialproject;
import com.cmdbms.service.FinProjectSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinProjectSerImpl implements FinProjectSer {

    @Autowired
    FinancialprojectMapper financialprojectMapper;

    public int insertOne(Financialproject financialproject){

        System.out.println(financialproject.getProEndTime());
        System.out.println(financialproject.getProName());
        System.out.println(financialproject.getProMoney());
        System.out.println(financialproject.getProStartTime());
        System.out.println(financialproject.getProId());
        return financialprojectMapper.insert(financialproject);
    }

    public  List selectOne(){
        return  financialprojectMapper.selectAll();
    }

    public  int updateOne(Financialproject finpro){
        Financialproject  temFin = financialprojectMapper.selectByPrimaryKey(finpro.getProId());
        if (finpro.getProEndTime()==null)
            finpro.setProEndTime(temFin.getProEndTime());
        if (finpro.getProMoney()==null)
            finpro.setProMoney(temFin.getProMoney());
        if (finpro.getProName()==null)
            finpro.setProName(temFin.getProName());
        if (finpro.getProStartTime()==null)
            finpro.setProStartTime(temFin.getProStartTime());
        return financialprojectMapper.updateByPrimaryKey(finpro);
    }

    public  int deleteOne(int id){
        return financialprojectMapper.deleteByPrimaryKey(id);
    }



}
