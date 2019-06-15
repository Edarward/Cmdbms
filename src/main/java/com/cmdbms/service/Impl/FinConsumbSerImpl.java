package com.cmdbms.service.Impl;

import com.cmdbms.mapper.*;
import com.cmdbms.model.*;
import com.cmdbms.service.FinConsumbSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class FinConsumbSerImpl implements FinConsumbSer {

    @Autowired
    private FinancialconsumablesMapper finComMapper;

    @Autowired
    private FinancialexpendMapper finExpandMapper;

    @Autowired
    private StaffsalaryMapper staffsalaryMapper;

    @Autowired
    private StaffmsgMapper staffmsgMapper;

    @Autowired
    private FinancialwageMapper financialwageMapper;


    public int insertOne(Financialconsumables record){
        System.out.println("222222");
        Financialexpend expendCord = new Financialexpend();
        System.out.println("222222");
        expendCord.setFinMoney(record.getMatLossMoney());
        expendCord.setFinName(record.getMatName());
        System.out.println("222222");
        finExpandMapper.insert(expendCord);
        System.out.println(expendCord);
        System.out.println("222222");
        return finComMapper.insert(record);
    }

    public List selectOne(){
        return finComMapper.selectAll();
    }

    public int updateOne(Financialconsumables record){
        return  0;
    }

    public int deleteOne(int id){
        return 0;
    }

    public int insertIntoExpend(Financialexpend record){

        return finExpandMapper.insert(record);
    }

    public int insertTeacherSalary(Financialwage record){

        int teaId = record.getTeaId();
        System.out.println(teaId);
        System.out.println(record.getTeaState());
        System.out.println(record.getTeaMoney());


        Financialexpend expend = new Financialexpend();
        expend.setFinName("发工资");
        expend.setFinMoney(record.getTeaMoney());
        finExpandMapper.insert(expend);

        return financialwageMapper.insertWage(record);
    }


    public int teacherUpdateSalary(Financialwage record){
        System.out.println("1dsadasdas");
        System.out.println(record.getId());
        Financialwage temFin = financialwageMapper.selectByPrimaryKey(record.getId());
        System.out.println(record.getTeaMoney()+"++++"+record.getTeaState()+"++++"+record.getTeaId()+"++++"+record.getId());
        System.out.println(temFin.getTeaMoney()+"++++"+temFin.getTeaState()+"++++"+temFin.getTeaId()+"++++"+temFin.getId());
        if (record.getTeaMoney()==null)
            record.setTeaMoney(temFin.getTeaMoney());
        System.out.println("3dsadasdas");
        if (record.getTeaId()==null)
            record.setTeaId(temFin.getTeaId());
        System.out.println("4dsadasdas");
        if (record.getTeaState()==null)
            record.setTeaState(temFin.getTeaState());
        System.out.println("5dsadasdas");
        System.out.println(record.getTeaMoney()+"++++"+record.getTeaState()+"++++"+record.getTeaId()+"++++"+record.getId());
        return financialwageMapper.updateByPrimaryKey(record);
    }

    public List selectTeaSal(){
        List resList = new ArrayList();
        List<Financialwage> temList = financialwageMapper.selectAll();

        for (int i = 0 ; i<temList.size();i++){
            Financialwage temWage = temList.get(i);
            Map temMap = new HashMap();
            int teaId = temWage.getTeaId();
            String teaName = staffmsgMapper.selectNamefromId(teaId);
            temMap.put("id",temWage.getId());
            System.out.println("Id"+temWage.getId());
            temMap.put("teaId",temWage.getTeaId());
            System.out.println("teaId"+temWage.getTeaId());
            temMap.put("teaName",teaName);
            temMap.put("teaState",temWage.getTeaState());
            temMap.put("teaMoney",temWage.getTeaMoney());
            resList.add(temMap);
        }
        return resList;
    }

}
