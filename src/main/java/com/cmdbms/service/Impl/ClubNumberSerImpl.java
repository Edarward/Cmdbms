package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ClubmanagerMapper;
import com.cmdbms.mapper.ClubnumberMapper;
import com.cmdbms.mapper.ClubpositionMapper;
import com.cmdbms.mapper.StudentmsgMapper;
import com.cmdbms.model.Clubmanager;
import com.cmdbms.model.Clubnumber;
import com.cmdbms.model.Clubposition;
import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.ClubNumberSer;
import com.cmdbms.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClubNumberSerImpl implements ClubNumberSer {

    @Autowired
    private ClubnumberMapper clubnumberMapper;
    @Autowired
    private StudentmsgMapper studentmsgMapper;
    @Autowired
    private ClubmanagerMapper clubmanagerMapper;
    @Autowired
    private ClubpositionMapper clubpositionMapper;


    @Override
    public List<Object> numberList (Integer studentId) throws ParseException {
        List<Object> numberList = new ArrayList<>();
        List<Clubnumber> clubnumberList = clubnumberMapper.selectByStudentId(studentId);
        for (Clubnumber clubnumber : clubnumberList) {
            Map<String,String> recording = new HashMap<>(8);
            Studentmsg studentmsg = studentmsgMapper.selectByPrimaryKey(clubnumber.getStudentId());
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubnumber.getClubId());
            Clubposition clubposition = clubpositionMapper.selectByPrimaryKey(clubnumber.getClubPositionId());
            recording.put("id",clubnumber.getId().toString());
            recording.put("studentId",clubnumber.getStudentId().toString());
            recording.put("studentName",studentmsg.getName());
            recording.put("clubId",clubnumber.getClubId().toString());
            recording.put("clubName", clubmanager.getName());
            recording.put("joinTime", DateFormatUtil.DateFormat(clubnumber.getJoinTime().toString(),"yyyy-MM-dd"));
            //判断是否退出社团
            if (clubnumber.getExitApplication()){
                recording.put("exitTime",DateFormatUtil.DateFormat(clubnumber.getExitTime().toString(),"yyyy-MM-dd"));
            } else {
                recording.put("exitTime","暂无");
            }
            recording.put("clubPositionId",clubnumber.getClubPositionId().toString());
            recording.put("clubPositionName",clubposition.getName());
            numberList.add(recording);
        }
        return numberList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateClubNumber (Integer id,Integer clubId,Integer clubPositionId) {
        clubnumberMapper.updateById(id,clubId,clubPositionId);
        return id;
    }

    @Override
    public List<Object> applicationList (Integer appState) {
        List<Object> applicationList = new ArrayList<>();
        List<Clubnumber> clubnumberList = clubnumberMapper.ApplicationList(appState);
        for (Clubnumber clubnumber : clubnumberList) {
            String applicationResult = "申请中";
            String studentSex = "";
            Map<String,Object> recording = new HashMap<>(10);
            Integer studentId = clubnumber.getStudentId();
            Studentmsg studentmsg = studentmsgMapper.selectByPrimaryKey(studentId);
            recording.put("id",clubnumber.getId());
            recording.put("studentId",studentId);
            recording.put("studentName",studentmsg.getName());
            if (studentmsg.getSex()=="0"){
                studentSex="女";
            }else { studentSex="男"; }
            recording.put("studentSex",studentSex);
            recording.put("studentFolk",studentmsg.getFolk());
            recording.put("studentGrade",studentmsg.getGrade());
            recording.put("studentPhone",studentmsg.getPhone());
            Integer clubId = clubnumber.getClubId();
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubId);
            recording.put("clubId",clubId);
            recording.put("clubName",clubmanager.getName());
            if (appState==1) {
                recording.put("joinApplication",applicationResult);
            } else {
                recording.put("exitApplication",applicationResult);
            }
            applicationList.add(recording);
        }
        return applicationList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int auditing(Integer appState,Integer id) {
        if (appState==1){
            //入社审核 修改
            return clubnumberMapper.joinAuditing(id);
        } else {
            //退社审核 修改
            return clubnumberMapper.exitAuditing(id);
        }
    }

    @Override
    public List<Object> auditingList(Integer studentId) throws ParseException {
        List<Clubnumber> clubnumberList = clubnumberMapper.selectByStudentId(studentId);
        List<Object> clubnumbers = new ArrayList<>();
        for (Clubnumber clubnumber : clubnumberList) {
            Map<String,Object> recording = new HashMap<>();
            recording.put("id",clubnumber.getId());
            recording.put("studentId",clubnumber.getStudentId());
            Studentmsg studentmsg = studentmsgMapper.selectByPrimaryKey(studentId);
            recording.put("studentName",studentmsg.getName());
            recording.put("clubId",clubnumber.getClubId());
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubnumber.getClubId());
            recording.put("clubName",clubmanager.getName());
            recording.put("joinTime",DateFormatUtil.DateFormat(clubnumber.getJoinTime().toString()));
            recording.put("exitTime",DateFormatUtil.DateFormat(clubnumber.getExitTime().toString()));
            clubnumbers.add(recording);
        }
        return clubnumbers;
    }

    @Override
    public int joinApp(Integer studentId,Integer clubId) {
        Clubnumber clubnumber = new Clubnumber();
        clubnumber.setStudentId(studentId);
        clubnumber.setClubId(clubId);
        clubnumber.setJoinApplication(false);
        clubnumber.setExitApplication(false);
        clubnumber.setClubPositionId(4);
        return clubnumberMapper.insert(clubnumber);
    }

    @Override
    public int exitApp(Integer studentId,Integer clubId) {
        Clubnumber clubnumber = new Clubnumber();
        clubnumber.setStudentId(studentId);
        clubnumber.setClubId(clubId);
        clubnumber.setJoinApplication(true);
        clubnumber.setExitApplication(true);
        return clubnumberMapper.insert(clubnumber);
    }
}
