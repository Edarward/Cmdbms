package com.cmdbms.service.Impl;

import com.cmdbms.exception.CoException;
import com.cmdbms.mapper.ClubactivityMapper;
import com.cmdbms.mapper.ClubmanagerMapper;
import com.cmdbms.mapper.ClubmessageMapper;
import com.cmdbms.mapper.StudentmsgMapper;
import com.cmdbms.model.Clubactivity;
import com.cmdbms.model.Clubmanager;
import com.cmdbms.model.Clubmessage;
import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.ClubActivitySer;
import com.cmdbms.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cmdbms.enums.ExceptionCodeEnums.NO_ACCESS;

@Service
public class ClubActivitySerImpl implements ClubActivitySer {

    @Autowired
    private ClubactivityMapper clubactivityMapper;
    @Autowired
    private ClubmanagerMapper clubmanagerMapper;
    @Autowired
    private ClubmessageMapper clubmessageMapper;
    @Autowired
    private StudentmsgMapper studentmsgMapper;


    @Override
    public List<Object> selActivity(Integer status) throws ParseException {
        List<Object> resultList = new ArrayList<>();
        List<Clubactivity> clubactivityList = clubactivityMapper.selByStatus(status);
        for (Clubactivity clubactivity : clubactivityList) {
            Map<String,Object> clubMap = new HashMap<>();
            clubMap.put("id",clubactivity.getId());
            //社团名称
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubactivity.getClubId());
            clubMap.put("clubName",clubmanager.getName());
            clubMap.put("actDescription",clubactivity.getActDescription());
            clubMap.put("actLocation",clubactivity.getActLocation());
            clubMap.put("actStartTime", DateFormatUtil.DateFormat(clubactivity.getActStartTime().toString()));
            clubMap.put("actStopTime",DateFormatUtil.DateFormat(clubactivity.getActStopTime().toString()));
            if (status == 1) {
                clubMap.put("status","请求审核中");
            } else if (status == 2) {
                clubMap.put("status","审核通过");
            } else if (status == 3) {
                clubMap.put("status","审核不通过");
            } else {
                clubMap.put("status","活动结束");
            }
            resultList.add(clubMap);
        }
        return resultList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int clubActAuditing(Integer reviewStatus,Integer id){
        return clubactivityMapper.clubActAuditing(reviewStatus,id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addClubActPublish(Clubactivity clubactivity) {
        return clubactivityMapper.insert(clubactivity);
    }

    @Override
    public  List<Object> clubActPublish() throws ParseException {
        List<Object> resultList = new ArrayList<>();
        List<Clubactivity> clubactivityList = clubactivityMapper.selectAll();
        for (Clubactivity clubactivity : clubactivityList) {
            Map<String,Object> clubMap = new HashMap<>();
            clubMap.put("clubActivityId",clubactivity.getId());
            //社团名称
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubactivity.getClubId());
            clubMap.put("clubName",clubmanager.getName());
            clubMap.put("actDescription",clubactivity.getActDescription());
            clubMap.put("actLocation",clubactivity.getActLocation());
            clubMap.put("actStartTime", DateFormatUtil.DateFormat(clubactivity.getActStartTime().toString()));
            clubMap.put("actStopTime",DateFormatUtil.DateFormat(clubactivity.getActStopTime().toString()));
            if (clubactivity.getActStatus()&&!clubactivity.getReviewStatus()) {
                clubMap.put("status","请求审核中");
            } else if(clubactivity.getActStatus()&&clubactivity.getReviewStatus()){
                clubMap.put("status","活动结束");
            } else if (!clubactivity.getActStatus()&&!clubactivity.getReviewStatus()) {
                clubMap.put("status","审核通过");
            } else {
                clubMap.put("status","审核不通过");
            }
            //参加活动人数
            Integer number = clubmessageMapper.ActCount(clubactivity.getId());
            if (number==0) {
                clubMap.put("ActCount","暂无学生报名");
            } else {
                clubMap.put("ActCount",number);
            }
            resultList.add(clubMap);
        }
        return resultList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int clubMessageDown(Integer id) {
        return clubmessageMapper.clubMessageDown(id);
    }

    @Override
    public  List<Object> selClubMessage (Integer clubActivityId) {
        List<Object> resultList = new ArrayList<>();
        List<Clubmessage> clubmessageList = clubmessageMapper.selClubMessage(clubActivityId);
        for (Clubmessage clubmessage : clubmessageList) {
            Map<String,Object> resultMap =  new HashMap<>();
            resultMap.put("id",clubmessage.getId());
            //活动信息
            Clubactivity clubactivity = clubactivityMapper.selectByPrimaryKey(clubActivityId);
            resultMap.put("actDescription",clubactivity.getActDescription());
            resultMap.put("content",clubmessage.getContent());
            //学生信息
            Integer studentId = clubmessage.getStudentId();
            Studentmsg studentmsg = studentmsgMapper.selectByPrimaryKey(studentId);
            resultMap.put("studentId",studentId);
            resultMap.put("studentName",studentmsg.getName());
            if (clubmessage.getContentStatus()) {
                resultMap.put("contentStatus","通过");
            } else {
                resultMap.put("contentStatus","已下架");
            }
            resultList.add(resultMap);
        }
        return resultList;
    }

    @Override
    public int clubActivityApp(Clubactivity clubactivity,Integer studentId) throws CoException{
        Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubactivity.getClubId());
        if (clubmanager.getStudentId().equals(studentId)) {
            return clubactivityMapper.insert(clubactivity);
        } else {
            throw new CoException(NO_ACCESS);
        }
    }

    @Override
    public List<Object> selActivity() throws ParseException {
        List<Object> resultList = new ArrayList<>();
        List<Clubactivity> clubactivityList = clubactivityMapper.selectAll();
        for (Clubactivity clubactivity  : clubactivityList) {
            Map<String,Object> resultMap =  new HashMap<>();
            resultMap.put("id",clubactivity.getId());
            //社团名称
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubactivity.getClubId());
            resultMap.put("clubName",clubmanager.getName());
            resultMap.put("actDescription",clubactivity.getActDescription());
            resultMap.put("actLocation",clubactivity.getActLocation());
            resultMap.put("actStartTime",DateFormatUtil.DateFormat(clubactivity.getActStartTime().toString()));
            resultMap.put("actStopTime",DateFormatUtil.DateFormat(clubactivity.getActStopTime().toString()));
            resultList.add(resultMap);
        }
        return resultList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addConOne(Integer id,String content) {
        return clubmessageMapper.addConOne(id, content);
    }

    @Override
    public List<Object> selMyActivity(Integer studentId) throws ParseException {
        List<Object> resultList = new ArrayList<>();
        List<Clubmessage> clubmessageList = clubmessageMapper.selClubByStuId(studentId);
        for (Clubmessage Clubmessage  : clubmessageList) {
            Integer actId = Clubmessage.getClubActivityId();
            Map<String,Object> resultMap =  new HashMap<>();
            resultMap.put("id",Clubmessage.getId());
            resultMap.put("actId",actId);
            //社团名称
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(actId);
            resultMap.put("clubName",clubmanager.getName());
            //活动信息
            Clubactivity clubactivity = clubactivityMapper.selectByPrimaryKey(actId);
            resultMap.put("actDescription",clubactivity.getActDescription());
            resultMap.put("actLocation",clubactivity.getActLocation());
            resultMap.put("actStartTime",DateFormatUtil.DateFormat(clubactivity.getActStartTime().toString()));
            resultMap.put("actStopTime",DateFormatUtil.DateFormat(clubactivity.getActStopTime().toString()));
            if (Clubmessage.getContent() == null) {
                resultMap.put("context","请留言");
            } else {
                resultMap.put("context",Clubmessage.getContent());
            }

            resultList.add(resultMap);
        }
        return resultList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int activityApp(Integer studentId,Integer actId) {
        Clubmessage clubmessage = new Clubmessage();
        clubmessage.setStudentId(studentId);
        clubmessage.setClubActivityId(actId);
        clubmessage.setContentStatus(true);
        return clubmessageMapper.insert(clubmessage);
    }

}
