package com.cmdbms.service.Impl;


import com.cmdbms.mapper.FinancialprojectMapper;
import com.cmdbms.model.Financialproject;
import com.cmdbms.service.FinProjectSer;
import com.cmdbms.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FinProjectSerImpl implements FinProjectSer {

    @Autowired
    private FinancialprojectMapper financialprojectMapper;

    public int insertOne(Financialproject financialproject){

        System.out.println(financialproject.getProEndTime());
        System.out.println(financialproject.getProName());
        System.out.println(financialproject.getProMoney());
        System.out.println(financialproject.getProStartTime());
        System.out.println(financialproject.getProId());
        return financialprojectMapper.insert(financialproject);
    }

    public  List selectOne(){
        // proId, proName, proMoney, proStartTime, proEndTime
        List<Financialproject>temList =  financialprojectMapper.selectAll();
        List resList = new ArrayList();
        for(int i=0;i<temList.size();i++){
            Financialproject tem = temList.get(i);
            Map temMap = new HashMap();
            temMap.put("proId",tem.getProId());
            temMap.put("proName",tem.getProName());
            temMap.put("proMoney",tem.getProMoney());
            temMap.put("proStartTime", DateFormatUtil.stampToDate(tem.getProStartTime()));
            temMap.put("proEndTime", DateFormatUtil.stampToDate(tem.getProEndTime()));
            
            resList.add(temMap);
        }
        return  resList;
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
