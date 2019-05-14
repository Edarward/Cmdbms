package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ElectricMapper;
import com.cmdbms.mapper.WaterMapper;
import com.cmdbms.model.Electric;
import com.cmdbms.model.Water;
import com.cmdbms.service.EnergySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EnergySerImpl implements EnergySer {

    @Autowired
    private WaterMapper waterMapper;

    @Autowired
    private ElectricMapper electricMapper;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Water> selectwater(String watPlace,Integer watMonth,Integer watYear,String watPlaceType){
        List<Water> waterList= waterMapper.selectByPrimaryKey(watPlace,watMonth,watYear,watPlaceType);
        System.out.println(waterList);
        return waterList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertElectricity (Electric electric){
        Integer integer = electricMapper.insert(electric);
        return integer.toString();
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delelectricity (Integer id){
        electricMapper.deleteByPrimaryKey(id);
        return id;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Electric> selectElectricity(Integer elePlace,Integer eleMonth,Integer eleYear,String elePlaceType){
        List<Electric> electricList = electricMapper.selectByPrimaryKey(elePlace,eleMonth,eleYear,elePlaceType);
        return electricList;
    }
}
