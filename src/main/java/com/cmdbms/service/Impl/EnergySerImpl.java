package com.cmdbms.service.Impl;

import com.cmdbms.mapper.SpoilageMapper;
import com.cmdbms.mapper.WaterMapper;
import com.cmdbms.model.Water;
import com.cmdbms.service.EnergySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnergySerImpl implements EnergySer {
    @Autowired
    WaterMapper waterMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertOne(Water water){
        Integer record  = waterMapper.insert(water);
        System.out.println(record);
        return record.toString();
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delwater(Integer id){
        waterMapper.deleteByPrimaryKey(id);
        return id;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updatewater(Water water){
        Integer integer = waterMapper.updateByPrimaryKey(water);
        return integer.toString();
    }
}
