package com.cmdbms.service.Impl;

import com.cmdbms.mapper.SpoilageMapper;
import com.cmdbms.model.Spoilage;
import com.cmdbms.service.EnergySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergySerImpl implements EnergySer {
    @Autowired
    SpoilageMapper spoilageMapper;
    @Override
    public String insertOne(Spoilage spoilage){
        Integer record  = spoilageMapper.insert(spoilage);
        System.out.println(record);
        return record.toString();
    }
}
