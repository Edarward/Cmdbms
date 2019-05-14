package com.cmdbms.service;

import com.cmdbms.model.Electric;
import com.cmdbms.model.Water;

import java.util.List;

public interface EnergySer {

    String insertOne(Water water);

    int delwater(Integer id);

    String updatewater(Water water);

    List<Water> selectwater(String watPlace,Integer watMonth,Integer watYear,String watPlaceType);

    String insertElectricity (Electric electric);

    int delelectricity (Integer id);

    List<Electric> selectElectricity(Integer elePlace,Integer eleMonth,Integer eleYear,String elePlaceType);
}
