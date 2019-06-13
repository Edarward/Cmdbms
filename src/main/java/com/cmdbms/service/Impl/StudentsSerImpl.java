package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StudentmsgMapper;
import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.StudentsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentsSerImpl implements StudentsSer {
    @Autowired
    private StudentmsgMapper studentmsgMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertStudents(Studentmsg studentmsg){
        Integer integer = studentmsgMapper.insert(studentmsg);
        return integer.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateStudents(Studentmsg studentmsg){
        Integer integer = studentmsgMapper.updateByPrimaryKey(studentmsg);
        return integer.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Studentmsg> selectStudents(Integer id){
        List<Studentmsg> studentmsgList = studentmsgMapper.selectByPrimaryKey(id);
        return studentmsgList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteStudents(Integer id){
        Integer integer = studentmsgMapper.deleteByPrimaryKey(id);
        return integer;
    }
}
