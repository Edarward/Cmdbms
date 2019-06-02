package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ExamclassroomMapper;
import com.cmdbms.mapper.ExamclassroomuseMapper;
import com.cmdbms.model.Examclassroom;
import com.cmdbms.model.Examclassroomuse;
import com.cmdbms.service.ClassroomSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClassroomSerImpl implements ClassroomSer {
    @Autowired
    private ExamclassroomMapper examclassroomMapper;

    @Autowired
    private ExamclassroomuseMapper examclassroomuseMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertClassroom(Examclassroom examclassroom){
        Integer record = examclassroomMapper.insert(examclassroom);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examclassroom> selectClassroom(Integer clrType){
        List<Examclassroom> examclassroomList = examclassroomMapper.selectByPrimaryKey(clrType);
        return examclassroomList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateClassroom(Examclassroom examclassroom){
        Integer record = examclassroomMapper.updateByPrimaryKey(examclassroom);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertClruse(Examclassroomuse examclassroomuse){
        Integer record = examclassroomuseMapper.insert(examclassroomuse);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examclassroomuse> selectClruse(Integer useThrough){
        List<Examclassroomuse> examclassroomuseList = examclassroomuseMapper.selectByPrimaryKey(useThrough);
        return examclassroomuseList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateClruse(Examclassroomuse examclassroomuse){
        Integer record = examclassroomuseMapper.updateByPrimaryKey(examclassroomuse);
        return record.toString();
    }
}
