package com.cmdbms.service.Impl;

import com.cmdbms.model.Teaarghis;
import com.cmdbms.service.TeaArgHisSer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaArgHisSerImpl implements TeaArgHisSer {

    @Override
    public int insertTeaHis(Teaarghis teaarghis){
        return 1;
    }

    @Override
    public List selectOne(){
        return  null;
    }

    @Override
    public int updateOne(Teaarghis teaarghis){
        return  1;
    }

    @Override
    public int deleteOne(int id){
        return 1;
    }
}
