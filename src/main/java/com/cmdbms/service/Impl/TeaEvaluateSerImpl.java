package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StaffmsgMapper;
import com.cmdbms.mapper.TeaevaluateMapper;
import com.cmdbms.model.Teaevaluate;
import com.cmdbms.service.TeaEvaluateSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TeaEvaluateSerImpl implements TeaEvaluateSer {

    @Autowired
    TeaevaluateMapper teaevaluateMapper;

    @Autowired
    StaffmsgMapper staffmsgMapper;

    public List selectOne(){
        List<Teaevaluate> temList = teaevaluateMapper.selectAll();
        List resList = new ArrayList();
        for (int i=0;i<temList.size();i++){

            Map temMap = new HashMap();
            Teaevaluate temEva = temList.get(i);
            int id  = temEva.getId();
            String teacherName = staffmsgMapper.selectNamefromId(id);
            System.out.println(id);
            System.out.println(teacherName);
            temMap.put("id",id);
            temMap.put("teacherId",temEva.getTeacherId());
            temMap.put("teacherName",teacherName);
            temMap.put("evaluateDate",temEva.getEvaluateDate());
            temMap.put("evaluateLevel",temEva.getEvaluateLevel());
            resList.add(temMap);

        }
        return resList;
    }

    public List selectOneSelf(int staffId){
        List<Teaevaluate> temList = teaevaluateMapper.selectAllById(staffId);
        List resList = new ArrayList();
        for (int i=0;i<temList.size();i++){
            Teaevaluate temEva = temList.get(i);
            Map temMap = new HashMap();
            String teacherName = staffmsgMapper.selectNamefromId(temEva.getId());
            System.out.println(teacherName);
            temMap.put("id",temEva.getId());
            temMap.put("teacherId",temEva.getTeacherId());
            temMap.put("teacherName",teacherName);
            temMap.put("evaluateDate",temEva.getEvaluateDate());
            temMap.put("evaluateLevel",temEva.getEvaluateLevel());
            resList.add(temMap);
        }
        return resList;
    }

    public int updateOne(Teaevaluate teaevaluate){
        System.out.println("dsadasdasd");
        Teaevaluate temEvalu = teaevaluateMapper.selectByPrimaryKey(teaevaluate.getId());
        System.out.println("dsadasdasd");
        if(teaevaluate.getEvaluateDate() == null)
            teaevaluate.setEvaluateDate(temEvalu.getEvaluateDate());
        if(teaevaluate.getEvaluateLevel() == null)
            teaevaluate.setEvaluateLevel(temEvalu.getEvaluateLevel());
        if(teaevaluate.getTeacherId() == null)
            teaevaluate.setTeacherId(temEvalu.getTeacherId());
        System.out.println(teaevaluate.getTeacherId()+ " asdddd"+ teaevaluate.getId());
        System.out.println(temEvalu.getEvaluateLevel()+temEvalu.getEvaluateDate());
        return teaevaluateMapper.updateByPrimaryKey(teaevaluate);
    }

    public int deleteOne(int id){
        return teaevaluateMapper.deleteByTeaId(id);
    }

    public int insertOne(Teaevaluate teaevaluate){
        return teaevaluateMapper.insert(teaevaluate);
    }
}
