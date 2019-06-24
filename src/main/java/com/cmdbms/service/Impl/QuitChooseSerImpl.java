package com.cmdbms.service.Impl;

import com.cmdbms.mapper.*;
import com.cmdbms.model.Choocheck;
import com.cmdbms.model.Quitcheck;
import com.cmdbms.model.Quitcoure;
import com.cmdbms.service.QuitChooseSer;
import com.cmdbms.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuitChooseSerImpl implements QuitChooseSer {

    @Autowired
    QuitcoureMapper quitcoureMapper;

    @Autowired
    QuitcheckMapper quitcheckMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    ChoocheckMapper choocheckMapper;

    /*使用此方法进行退课*/
    public int insertOne(Quitcoure quitcoure){
        return quitcoureMapper.insert(quitcoure);
    }



    public List selectOne(){
        System.out.println("here1");
        List<Quitcoure> quitList = quitcoureMapper.selectAll();
        List resList = new ArrayList();
        System.out.println("here2");
        for (int i =0;i<quitList.size();i++){
            Map temMap = new HashMap();
            Quitcoure quitcoure = quitList.get(i);
            int classId = quitcoure.getClassId();
            int stuId = quitcoure.getStuId();
            System.out.println("here3");
            String className = courseMapper.selectNamefromId(classId);
            System.out.println("here4");
            String studentName = courseMapper.selectStuNamefromId(stuId);
            temMap.put("id",        quitcoure.getId());
            temMap.put("classId",   quitcoure.getClassId());
            temMap.put("className", className);
            temMap.put("studentId", quitcoure.getStuId());
            temMap.put("studentName",studentName);
            temMap.put("applyTime", DateFormatUtil.stampToDate(quitcoure.getApplyTime()));
            resList.add(temMap);
        }
        return resList;
    }

    /*使用此方法进行取消退课*/
    public int deleteOne(int id){

        return quitcoureMapper.deleteByPrimaryKey(id);
    }


    public int checkQuitInfo(Quitcheck quitcheck){

        System.out.println("here");
        Timestamp applyTime = quitcheckMapper.
                selApplTimeByClaIdAndStuId(quitcheck.getClassId(),quitcheck.getStuId());
        System.out.println("here1");
        int quitCourseId = quitcheckMapper.
                selQuitCourIdByClaIdAndStuId(quitcheck.getClassId(),quitcheck.getStuId());
        System.out.println("here2");
        quitcheck.setApplyTime(applyTime);
        System.out.println("here3");
        int chooCourseId = choocheckMapper.selChoCourIdByClaIdAndStuId(quitcheck.getClassId(),quitcheck.getStuId());
        System.out.println("here4");
        quitcoureMapper.deleteByPrimaryKey(quitCourseId);
        System.out.println("删除这个：：：-----》》》》" + quitCourseId);
        if (!quitcheck.getPass()){
            System.out.println("还要删除删除这个：：：-----》》》》" + chooCourseId);
            choocheckMapper.deleteByPrimaryKey(chooCourseId);
        }
        return (quitcheckMapper.insert(quitcheck));

    }

    public List selectChoCheckInfo(int stuId) throws ParseException {

        List<Choocheck> checkInfo = choocheckMapper.selectInfoByStuId(stuId);
        List resList = new ArrayList();
        for (int i=0;i<checkInfo.size();i++) {
            Map temMap = new HashMap();
            Choocheck temChoCheck = checkInfo.get(i);
            temMap.put("id",temChoCheck.getId());
            temMap.put("classId",temChoCheck.getClasId());
            temMap.put("className",courseMapper.selectNamefromId(temChoCheck.getClasId()));
            temMap.put("applyTime",DateFormatUtil.DateFormat(temChoCheck.getApplyTime().toString()));
            resList.add(temMap);
        }
        return resList;
    }

}
