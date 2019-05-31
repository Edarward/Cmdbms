package com.cmdbms.service.Impl;


import com.cmdbms.controller.FinStudentCon;
import com.cmdbms.mapper.FinancialstudentMapper;
import com.cmdbms.model.Financialstudent;
import com.cmdbms.service.FinStudentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FinStudentSerImpl implements FinStudentSer {

    @Autowired
    FinancialstudentMapper financialstudentMapper;

    public int insertOne(Financialstudent financialstudent){
        return  financialstudentMapper.insert(financialstudent);
    }

    public List selectOne(){
        List<Financialstudent> temList = financialstudentMapper.selectAll();
        List resList = new ArrayList();
        System.out.println(temList.get(0).getProId()
                +"+++++++++"+temList.get(0).getStuId());
        for (int i = 0;i<temList.size();i++){
            Financialstudent temFin = temList.get(i);
            int proId = temFin.getProId();
            int stuId = temFin.getStuId();
            String proName = financialstudentMapper.selectProNameById(proId);
            String stuName = financialstudentMapper.selectStuNameById(stuId);
            System.out.println(proName);
            System.out.println(stuName);

            Map temMap = new HashMap();
            temMap.put("proId",temFin.getProId());
            temMap.put("proName",proName);
            temMap.put("stuId",temFin.getStuId());
            temMap.put("stuName",stuName);
            temMap.put("proTime",temFin.getProTime());
            temMap.put("proState",temFin.getProState());
            resList.add(temMap);
        }

        return resList;
    }

    public List selectStuSelf(int stuId){
        List resList = new ArrayList();

        List<Financialstudent> temList = financialstudentMapper.selectStuSelf(stuId);
        System.out.println(stuId);
        for (int i = 0;i<temList.size();i++){
            Financialstudent temFin = temList.get(i);
            int proId = temFin.getProId();
            String proName = financialstudentMapper.selectProNameById(proId);
            System.out.println(proName);
            String stuName = financialstudentMapper.selectStuNameById(stuId);
            System.out.println(stuName);
            Map temMap = new HashMap();
            temMap.put("proId",temFin.getProId());
            temMap.put("proName",proName);
            temMap.put("stuId",temFin.getStuId());
            temMap.put("stuName",stuName);
            temMap.put("proTime",temFin.getProTime());
            temMap.put("proState",temFin.getProState());
            resList.add(temMap);
        }
        return  resList;
    }


    public int updateOne(Financialstudent financialstudent){
        return 0;
    }

    public int deleteOne(int id){
        return 0;
    }

}
