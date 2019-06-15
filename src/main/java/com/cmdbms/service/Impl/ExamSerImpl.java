package com.cmdbms.service.Impl;

import com.cmdbms.mapper.*;
import com.cmdbms.model.Examarrange;
import com.cmdbms.service.ExamSer;
import com.cmdbms.service.SalaryLevelSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ExamSerImpl implements ExamSer {
    @Autowired
    private ExamarrangeMapper examarrangeMapper;

    @Autowired
    private ChoocheckMapper choocheckMapper;

    @Autowired
    private ExamstuarrangeMapper examstuarrangeMapper;

    @Autowired
    private ExamgradeMapper examgradeMapper;

    @Autowired
    private ExamunpassMapper examunpassMapper;

    @Autowired
    private ExamviolentMapper examviolentMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertArrange(Integer id,
                                Integer examSubId,
                                String examDate,
                                Integer examTime,
                                Integer examClassroomId,
                                String examClrName,
                                String examSubName) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newexamDate = sdf.parse(examDate);
        Integer record = examarrangeMapper.insert(id,examSubId,newexamDate,examTime,examClassroomId,examClrName,examSubName);
        List<Integer> integerList = choocheckMapper.selectstuId(examSubId);
        for (int i = 0;i<integerList.size();i++){
            Integer stuexamStuId = integerList.get(i);
            System.out.println(stuexamStuId.toString());
            Integer integer = examstuarrangeMapper.insert(id,stuexamStuId,examClassroomId,examSubId,newexamDate,examTime,examClrName,examSubName);
            Integer integer1 = examgradeMapper.insert(id,stuexamStuId,examSubId,examSubName);
        }
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examarrange> selectArrang(Integer id){
        List<Examarrange> examarrangeList = examarrangeMapper.selectByPrimaryKey(id);
        return examarrangeList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteArrang(Integer id){
        Integer record = examarrangeMapper.deleteByPrimaryKey(id);
        Integer integer = examstuarrangeMapper.deleteByPrimaryKey(id);
        return record;
    }

    public String updateArrange(Integer id,
                                Integer examSubId,
                                String examDate,
                                Integer examTime,
                                Integer examClassroomId,
                                String examClrName,
                                String examSubName) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newexamDate = sdf.parse(examDate);
        Integer record = examarrangeMapper.updateByPrimaryKey(id,examSubId,newexamDate,examTime,examClassroomId,examClrName,examSubName);
        Integer integer = examstuarrangeMapper.updateByPrimaryKey(id,examClassroomId,examSubId,newexamDate,examTime,examClrName,examSubName);
        return record.toString();
    }

    public String updateGrade(Integer id,
                              Integer gradeStuId,
                              Integer gradeStu,
                              String gradeLimit,
                              Integer gradeJudge,
                              Integer gradeViolate,
                              Integer gradeReview) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newgradeLimit = sdf.parse(gradeLimit);
        Integer record = examgradeMapper.updateByPrimaryKey(id,gradeStuId,gradeStu,newgradeLimit,gradeJudge,gradeViolate,gradeReview);
        List<Integer> integerList = examgradeMapper.selectgradeSub(id,gradeStuId);
        Integer gradeSubId = integerList.get(0);
        List<String> stringList = examgradeMapper.selectgradeSubName(id,gradeStuId);
        String gradeSubName = stringList.get(0);
        if (gradeStu<60){
            examunpassMapper.insert(id,gradeSubId,gradeStuId,gradeStu,gradeViolate,gradeSubName);
        }
        if (gradeViolate == 0){
            examviolentMapper.insert(id,gradeStuId);
        }
        return record.toString();
    }
}
