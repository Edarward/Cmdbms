package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ExamretakeMapper;
import com.cmdbms.model.Examretake;
import com.cmdbms.service.RetakeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RetakeSerImpl implements RetakeSer {
    @Autowired
    private ExamretakeMapper examretakeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertRetake(Examretake examretake){
        Integer record = examretakeMapper.insert(examretake);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateRetake(Examretake examretake){
        Integer record = examretakeMapper.updateByPrimaryKey(examretake);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String deleteRetake(Integer id){
        Integer record = examretakeMapper.deleteByPrimaryKey(id);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examretake> selectRetake(Integer exuseThrough){
        List<Examretake> examretakeList = examretakeMapper.selectByPrimaryKey(exuseThrough);
        return examretakeList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examretake> selectRetaketwo(Integer exuseStuId){
        List<Examretake> examretakeList = examretakeMapper.selectByPrimaryKeytwo(exuseStuId);
        return examretakeList;
    }
}
