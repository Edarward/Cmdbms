package com.cmdbms.service;

import com.cmdbms.model.Choocheck;

import java.util.List;

public interface ChooCheckSer {
    int insertOne(Choocheck choocheck);

    List selectOne();


    int deleteOne(int id);

}
