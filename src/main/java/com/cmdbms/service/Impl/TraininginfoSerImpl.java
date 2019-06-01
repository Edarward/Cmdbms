package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StaffmsgMapper;
import com.cmdbms.mapper.TraininginfoMapper;
import com.cmdbms.model.Traininginfo;
import com.cmdbms.service.TraininginfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TraininginfoSerImpl implements TraininginfoSer {

    @Autowired
    TraininginfoMapper traininginfoMapper;

    @Autowired
    StaffmsgMapper staffmsgMapper;

    public List selectOne(){
        List resList = new ArrayList();
        List<Traininginfo> trainList = traininginfoMapper.selectAll();
        for (int i=0;i<trainList.size();i++){
            Map temMap = new HashMap();
            Traininginfo temTrain = trainList.get(i);
            int staffId = temTrain.getStaffId();
            String staffName = staffmsgMapper.selectNamefromId(staffId);
            temMap.put("staffId",temTrain.getStaffId());
            temMap.put("staffName",staffName);
            temMap.put("startDate",temTrain.getStartDate());
            temMap.put("endDate",temTrain.getEndDate());
            temMap.put("traingInfo",temTrain.getTraingInfo());
            resList.add(temMap);
        }
        return resList;
    }

    public List selectOneEnd(){
        List resList = new ArrayList();
        List<Traininginfo> trainList = traininginfoMapper.selectAllEnd();
        for (int i=0;i<trainList.size();i++){
            Map temMap = new HashMap();
            Traininginfo temTrain = trainList.get(i);
            int staffId = temTrain.getStaffId();
            String staffName = staffmsgMapper.selectNamefromId(staffId);
            temMap.put("staffId",temTrain.getStaffId());
            temMap.put("staffName",staffName);
            temMap.put("startDate",temTrain.getStartDate());
            temMap.put("endDate",temTrain.getEndDate());
            temMap.put("traingInfo",temTrain.getTraingInfo());
            resList.add(temMap);
        }
        return resList;
    }

    public int updateOne(Traininginfo traininginfo){

        Traininginfo temInfo = traininginfoMapper.selectByPrimaryKey(traininginfo.getStaffId());
        if (traininginfo.getTraingInfo()==null)
            traininginfo.setTraingInfo(temInfo.getTraingInfo());
        if (traininginfo.getEndDate()==null)
            traininginfo.setEndDate(temInfo.getEndDate());
        if(traininginfo.getStartDate()==null)
            traininginfo.setStartDate(temInfo.getStartDate());

        return traininginfoMapper.updateByPrimaryKey(traininginfo);
    }

    public int deleteOne(int id){
        return traininginfoMapper.deleteByPrimaryKey(id);
    }

    public int insertOne(Traininginfo traininginfo){

        traininginfoMapper.deleteByPrimaryKey(traininginfo.getStaffId());
        return traininginfoMapper.insert(traininginfo);
    }

}
