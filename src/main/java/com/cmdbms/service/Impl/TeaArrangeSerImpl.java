package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ArgcoureMapper;
import com.cmdbms.mapper.CourseMapper;
import com.cmdbms.mapper.TeaarrangeMapper;
import com.cmdbms.model.Argcoure;
import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.TeaArrangeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***********************测试成功**************************/
@Service
public class TeaArrangeSerImpl implements TeaArrangeSer {

    @Autowired
    TeaarrangeMapper teaarrangeMapper;

    @Autowired
    ArgcoureMapper argcoureMapper;

    @Override
    public  int insertOne(Teaarrange teaarrange){
     return 0;
    }

    @Override
    public List selectOne(){

        List<Argcoure> teaArgList = argcoureMapper.selectAll();
        List resList = new ArrayList();
        for (int inn =0;inn<teaArgList.size();inn++){
            Argcoure argcoure = teaArgList.get(inn);
            Map temMap = new HashMap();
            String className    = argcoureMapper.selectClassNameById(argcoure.getClassId());
            String teaName      = argcoureMapper.selectTeaNameById(argcoure.getTeacherId());
            System.out.println(teaName);
            System.out.println(className);
            System.out.println(argcoure.getCourseTime());
            System.out.println(argcoure.getClassroomId());
            System.out.println(argcoure.getCoureDate());
            System.out.println("____________________________");
            temMap.put("teaName",teaName);
            temMap.put("className",className);
            temMap.put("courseTime",argcoure.getCourseTime());
            temMap.put("classroomId",argcoure.getClassroomId());
            temMap.put("coureDate",argcoure.getCoureDate());
            resList.add(temMap);
        }
        return resList;
    }

    @Override
    public int updateOne(Teaarrange teaarrange){
        int teaId = teaarrange.getTeacherId();
        int classId = teaarrange.getClassId();
        System.out.println(teaarrange.getClassId()+"123231");

        int temTeaId = teaarrangeMapper.selectTeaIdById(teaarrange.getId());
        int temClassId = teaarrangeMapper.selectClassIdById(teaarrange.getId());
        System.out.println(temTeaId+"dsadasd"+temClassId+"123231");
        List<Argcoure> list = argcoureMapper.seleByClasAndTea(temTeaId,temClassId);
        Argcoure argcoure = list.get(0);
        System.out.println(argcoure.getCourseTime());
        argcoure.setTeacherId(teaId);
        argcoure.setClassId(classId);

        return (teaarrangeMapper.updateByPrimaryKey(teaarrange)==0)
                &&(argcoureMapper.updateByPrimaryKey(argcoure)==0)?0:1;
    }

    @Override
    public int deleteOne(int id){
        return teaarrangeMapper.deleteByPrimaryKey(id);
    }

}
