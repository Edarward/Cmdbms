package com.cmdbms.service.Impl;

import com.cmdbms.mapper.*;
import com.cmdbms.model.Examarrange;
import com.cmdbms.model.Examgrade;
import com.cmdbms.model.Examunpass;
import com.cmdbms.model.Examviolent;
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

    @Autowired
    private StudentmsgMapper studentmsgMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public String insertArrange(Integer id,
                                Integer examSubId,
                                String examDate,
                                Integer examTime,
                                Integer examClassroomId,
                                String examClrName,
                                String examSubName,
                                Integer examYear) throws ParseException {
        Boolean pass = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newexamDate = sdf.parse(examDate);
        Integer record = examarrangeMapper.insert(id,examSubId,newexamDate,examTime,examClassroomId,examClrName,examSubName,examYear);
        List<Integer> integerList = choocheckMapper.selectstuId(examSubId,pass);
        for (int i = 0;i<integerList.size();i++){
            Integer stuexamStuId = integerList.get(i);
            System.out.println(stuexamStuId.toString());
            String gradeMajor = studentmsgMapper.selectmajor(stuexamStuId);
            Integer integer = examstuarrangeMapper.insert(id,stuexamStuId,examClassroomId,examSubId,newexamDate,examTime,examClrName,examSubName,examYear);
            Integer integer1 = examgradeMapper.insert(id,stuexamStuId,examSubId,examSubName,gradeMajor,examYear);
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
        examgradeMapper.deleteByPrimaryKey(id);
        return record;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateArrange(Integer id,
                                String examDate,
                                Integer examTime,
                                Integer examClassroomId,
                                String examClrName) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newexamDate = null;
        if (examDate!=null) {
            newexamDate = sdf.parse(examDate);
        }
        Integer record = examarrangeMapper.updateByPrimaryKey(id,newexamDate,examTime,examClassroomId,examClrName);
        Integer integer = examstuarrangeMapper.updateByPrimaryKey(id,examClassroomId,newexamDate,examTime,examClrName);
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateGrade(Integer id,
                              Integer gradeStuId,
                              Integer gradeStu,
                              String gradeLimit,
                              Integer gradeJudge,
                              Integer gradeViolate,
                              Integer gradeReview) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newgradeLimit = null;
        if(gradeLimit!=null){
            newgradeLimit = sdf.parse(gradeLimit);
        }
        Integer record = examgradeMapper.updateByPrimaryKey(id,gradeStuId,gradeStu,newgradeLimit,gradeJudge,gradeViolate,gradeReview);
        List<Integer> integerList = examgradeMapper.selectgradeSub(id,gradeStuId);
        Integer gradeSubId = integerList.get(0);
        List<String> stringList = examgradeMapper.selectgradeSubName(id,gradeStuId);
        String gradeSubName = stringList.get(0);
        if(gradeStu!=null) {
            if (gradeStu < 60) {
                examunpassMapper.insert(id, gradeSubId, gradeStuId, gradeStu, gradeViolate, gradeSubName);
            }
        }
        if (gradeViolate!=null) {
            if (gradeViolate == 0) {
                examviolentMapper.insert(id, gradeStuId);
            }
        }
        return record.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examgrade> selectGrade(Integer gradeStuId){
        List<Examgrade> examgradeList = examgradeMapper.selectstugrade(gradeStuId);
        return examgradeList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examunpass> selectunpass(Integer unpassStuId){
        List<Examunpass> examunpassList = examunpassMapper.selectByPrimaryKey(unpassStuId);
        return examunpassList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examviolent> selectViolent(Integer id){
        List<Examviolent> examviolentList = examviolentMapper.selectByPrimaryKey(id);
        return examviolentList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String updateViolent(Integer id,Integer vioStuId, String vioBehavior, String vioContent, Integer vioLevel){
        Integer integer = examviolentMapper.updateByPrimaryKey(id,vioStuId,vioBehavior,vioContent,vioLevel);
        return integer.toString();
    }
}
