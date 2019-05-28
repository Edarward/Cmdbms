package com.cmdbms.service.Impl;

import com.cmdbms.mapper.TeaarrangeMapper;
import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.TeaArrangeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeaArrangeSerImpl implements TeaArrangeSer {

    @Autowired
    TeaarrangeMapper teaarrangeMapper;

    @Override
    public  int insertOne(Teaarrange teaarrange){
     return 0;
    }

    @Override
    public List selectOne(){
        return teaarrangeMapper.selectTeaarrange();
    }

    @Override
    public int updateOne(Teaarrange course){
        return teaarrangeMapper.updateByPrimaryKey(course);
    }

    @Override
    public int deleteOne(int id){
        return teaarrangeMapper.deleteByPrimaryKey(id);
    }

}
