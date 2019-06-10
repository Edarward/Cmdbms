package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ChoocheckMapper;
import com.cmdbms.mapper.ExamarrangeMapper;
import com.cmdbms.mapper.ExamstuarrangeMapper;
import com.cmdbms.model.Examarrange;
import com.cmdbms.service.ExamSer;
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
}
