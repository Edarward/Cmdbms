package com.cmdbms.service;

import com.cmdbms.model.Traininginfo;

import java.util.List;

public interface TraininginfoSer {

    List selectOne();

    List selectOneEnd();

    int updateOne(Traininginfo teaarrange);

    int deleteOne(int id);

    int insertOne(Traininginfo teaarrange);

}
