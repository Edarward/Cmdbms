package com.cmdbms.service;

import com.cmdbms.model.Teaarrange;

import java.util.List;

public interface TeaArrangeSer {

    List selectOne();

    int updateOne(Teaarrange teaarrange);

    int deleteOne(int id);

    int insertOne(Teaarrange teaarrange);

}
