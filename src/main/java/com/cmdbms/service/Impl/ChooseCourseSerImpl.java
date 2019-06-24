package com.cmdbms.service.Impl;

import com.cmdbms.mapper.*;
import com.cmdbms.model.*;
import com.cmdbms.service.ChooseCourseSer;
import com.cmdbms.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***********************************************************************************/
/***********************************************************************************/
/****************************本模块用于选课使用*************************************/
/*******************************包含学生选课跟管理员审核****************************/
/***********************************************************************************/
/***********************************************************************************/

@Service
public class ChooseCourseSerImpl implements ChooseCourseSer {

    @Autowired
    private ChoosecourseMapper choosecourseMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudentmsgMapper studentmsgMapper;

    @Autowired
    private ChoocheckMapper choocheckMapper;
    @Autowired
    private QuitcheckMapper quitcheckMapper;

    public List selectCheckQuitInfo() throws ParseException {
        List resList = new ArrayList();
        System.out.println("12345678");
        List<Quitcheck> quitcheckList = quitcheckMapper.selectAllIn();
        for (int i = 0;i<quitcheckList.size();i++){
            Quitcheck temChooCheck = quitcheckList.get(i);
            System.out.println("12345678");
            int stuId = temChooCheck.getStuId();
            int classId = temChooCheck.getClassId();
            System.out.println("12345678");
            Map temMap = new HashMap();
            String stuName = courseMapper.selectStuNamefromId(stuId);
            String className = courseMapper.selectNamefromId(classId);
            System.out.println("12345678");
            temMap.put("id",temChooCheck.getId());
            temMap.put("stuId",stuId);
            temMap.put("stuName",stuName);
            temMap.put("classId",classId);
            temMap.put("className",className);
            temMap.put("applyTime",DateFormatUtil.stampToDate(temChooCheck.getApplyTime()));
            temMap.put("pass",temChooCheck.getPass());
            System.out.println("12345678");
            resList.add(temMap);
        }

        return resList;

    }
    public  List selectCheckChooseInfo()throws ParseException{
        List resList = new ArrayList();
        List<Choocheck> choocheckList = choocheckMapper.selectAll();
        for (int i = 0;i<choocheckList.size();i++){
            Choocheck temChooCheck = choocheckList.get(i);
            int stuId = temChooCheck.getStuId();
            int clasId = temChooCheck.getClasId();
            Map temMap = new HashMap();
            String stuName = courseMapper.selectStuNamefromId(stuId);
            String className = courseMapper.selectNamefromId(clasId);
            temMap.put("id",temChooCheck.getId());
            temMap.put("stuId",stuId);
            temMap.put("stuName",stuName);
            temMap.put("classId",clasId);
            temMap.put("className",className);
            temMap.put("applyTime",DateFormatUtil.DateFormat(temChooCheck.getApplyTime().toString()));
            temMap.put("pass",temChooCheck.getPass());

            resList.add(temMap);
        }

        return resList;
    }

    /*插入选课信息*/
    @Override
    public int stuChooseApply(Choosecourse choosecourse){
        System.out.println(choosecourse.getClassId());
        System.out.println(choosecourse.getStuID());
        return choosecourseMapper.insert(choosecourse);
    }


    /*查看所有学生的选课信息*/
    @Override
    public List selectOne(){
        List<Choosecourse> chooseList = choosecourseMapper.selectAll();
        List resList = new ArrayList();
        System.out.println("管理员成功获取选课信息\n开始查询学生与课程名字");
        for (int i = 0;i<chooseList.size();i++){

            Map temMap = new HashMap();
            Choosecourse temChoosecourse = chooseList.get(i);
            int stuId = temChoosecourse.getStuID();
            int classId = temChoosecourse.getClassId();
            String stuName = courseMapper.selectStuNamefromId(stuId);
            String className = courseMapper.selectNamefromId(classId);
            temMap.put("id",temChoosecourse.getId());
            temMap.put("stuId",temChoosecourse.getStuID());
            temMap.put("stuName",stuName);
            temMap.put("classId",temChoosecourse.getClassId());
            temMap.put("className",className);
            temMap.put("applytime", DateFormatUtil.stampToDate(temChoosecourse.getApplytime()));
            resList.add(temMap);
        }

        return resList;
    }

    @Override
    public int updateOne(Choosecourse choosecourse){
        return  0;
    }

    @Override
    public int deleteOne(int id){
        return choosecourseMapper.deleteByPrimaryKey(id);
    }

    /*通过此方法查询某个学生的已选课程以及未选课程*/
    @Override
    public List selectChooseInfo(int stuId ){
        List resList = new ArrayList();     //返回这个List
        System.out.println("开始查询-- -- -- -- --");

        System.out.println(stuId);
        //获得所有课程
        List<Course> courList = courseMapper.selectAll();
        System.out.println(courList.size());
        //获得选课申请信息
        List<Choosecourse>chooseList = choosecourseMapper.selectStuApply(stuId);
        System.out.println(chooseList.size());
        for (int i =0;i<courList.size();i++){
            Map temMap = new HashMap();
            Course temCourse = courList.get(i);
            System.out.println(temCourse.getName());
            temMap.put("id",temCourse.getId());
            temMap.put("name",temCourse.getName());
            temMap.put("credit",temCourse.getCredit());
            temMap.put("compulsory",temCourse.getCompulsory());
            temMap.put("period",temCourse.getPeriod());
            temMap.put("offlineTeach",temCourse.getOfflineTeach());
            boolean applyOrNot=false;
            for(int j = 0;j<chooseList.size();j++){
                Choosecourse temChoose = chooseList.get(j);
                if (temChoose.getClassId() == temCourse.getId()) {
                    applyOrNot=true;
                    temMap.put("applyOrNot", applyOrNot);
                }
            }
            if (!applyOrNot)
                temMap.put("applyOrNot", applyOrNot);
            resList.add(temMap);
        }
        return resList;
    }


    /*插入选课审核信息*/
    public int checkChooseInfo(Choocheck choocheck){
        System.out.println("dasdasdasd");
        Timestamp applyTime = choocheckMapper.
                selApplTimeByClaIdAndStuId(choocheck.getClasId(),choocheck.getStuId());
        int chooseCourseId = choocheckMapper.
                selChooseIdByClaIdAndStuId(choocheck.getClasId(),choocheck.getStuId());
        choocheck.setApplyTime(applyTime);
        choosecourseMapper.deleteByPrimaryKey(chooseCourseId);
        System.out.println("删除这个：：：-----》》》》"+chooseCourseId);
        return (choocheckMapper.insert(choocheck));
    }

    public List selectStudentGrade(){
        List resList = new ArrayList();
    System.out.println("12324");
        List<Studentmsg> temStudent = studentmsgMapper.selectAll();
        System.out.println("12324");
        for (int i =0;i<temStudent.size();i++){
            Studentmsg studentmsg = temStudent.get(i);
            Map temMap = new HashMap();
            int stuId = studentmsg.getId();
            System.out.println(stuId);
            int grade = courseMapper.selectCreditById(stuId);
            System.out.println(grade);
            String stuName = courseMapper.selectStuNamefromId(stuId);
            System.out.println(stuName);
            temMap.put("stuId",stuId);
            temMap.put("stuName",stuName);
            temMap.put("grade",grade);
            resList.add(temMap);
        }
        return resList;
    }


}
