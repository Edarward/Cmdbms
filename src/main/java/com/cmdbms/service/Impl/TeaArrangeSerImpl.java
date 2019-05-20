package com.cmdbms.service.Impl;

import com.cmdbms.mapper.TeaarrangeMapper;
import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.TeaArrangeSer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeaArrangeSerImpl implements TeaArrangeSer {

    @Autowired
    TeaarrangeMapper teaarrangeMapper;

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
