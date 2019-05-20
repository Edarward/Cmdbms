package com.cmdbms.service;

import com.cmdbms.model.Teaarrange;

import java.util.List;

public interface TeaArrangeSer {

    List selectOne();

    int updateOne(Teaarrange course);

    int deleteOne(int id);


}
