package com.cmdbms.service.Impl;

import com.cmdbms.model.Choocheck;
import com.cmdbms.service.ChooCheckSer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChooCheckSerImpl implements ChooCheckSer {

    public int insertOne(Choocheck choocheck){
        return  0;
    }

    public  List selectOne(){
        return null;
    }


    public int deleteOne(int id){
        return 0;
    }
}
