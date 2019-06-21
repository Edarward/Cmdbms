package com.cmdbms.service.Impl;

import com.cmdbms.controller.StudentsCon;
import com.cmdbms.mapper.*;
import com.cmdbms.model.*;
import com.cmdbms.service.StudentsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentsSerImpl implements StudentsSer {
    @Autowired
    private StudentmsgMapper studentmsgMapper;

    @Autowired
    private StudentcontentMapper studentcontentMapper;

    @Autowired
    private StudentevaluationstateMapper studentevaluationstateMapper;

    @Autowired
    private ExamgradeMapper examgradeMapper;

    @Autowired
    private ChoocheckMapper choocheckMapper;

    @Autowired
    private ExamstuarrangeMapper examstuarrangeMapper;

    @Autowired
    private ArgcoureMapper argcoureMapper;

    @Autowired
    private StudentquestionMapper studentquestionMapper;

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
    public Studentmsg selectStudents(Integer id){
        Studentmsg studentmsgList = studentmsgMapper.selectByPrimaryKey(id);
        return studentmsgList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteStudents(Integer id){
        Integer integer = studentmsgMapper.deleteByPrimaryKey(id);
        return integer;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertContent(Integer id, Integer stuId, Integer stuCourseid, Integer stuQuestionid, String stuType, String stuContent){
        Integer stuTeacherid = argcoureMapper.selectTeaId(stuCourseid);
        Integer integer = studentcontentMapper.insert(id,stuId,stuTeacherid,stuCourseid,stuQuestionid,stuType,stuContent);
        return integer.toString();
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Studentquestion> selectQuestion(){
        List<Studentquestion> studentquestionList = studentquestionMapper.selectAll();
        return studentquestionList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertState(Studentevaluationstate studentevaluationstate){
        Integer integer = studentevaluationstateMapper.insert(studentevaluationstate);
        return integer.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examgrade> selectgrade(Integer gradeStuId, String gradeMajor, Integer gradeYear){
        List<Examgrade> examgradeList;
        String recod = studentevaluationstateMapper.selectByPrimaryKey(gradeStuId);
        Integer integer = Integer.parseInt(recod);
        if (integer == 1){
        examgradeList = examgradeMapper.selectgrade(gradeStuId,gradeMajor,gradeYear);
        return examgradeList;
        }
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Choocheck> selectChoo(Integer stuId){
        List<Choocheck> choocheckList = choocheckMapper.selectpass(stuId);
        return choocheckList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examstuarrange> selectStuexam(Integer stuexamStuId){
        List<Examstuarrange> examstuarrangeList = examstuarrangeMapper.selectStuexam(stuexamStuId);
        return examstuarrangeList;
    }
}
