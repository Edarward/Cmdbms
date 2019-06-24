package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ClubmanagerMapper;
import com.cmdbms.mapper.StudentmsgMapper;
import com.cmdbms.model.Clubmanager;
import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.ClubManagerSer;
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
public class ClubManagerSerImpl implements ClubManagerSer {

    @Autowired
    private ClubmanagerMapper clubmanagerMapper;
    @Autowired
    private StudentmsgMapper studentmsgMapper;

    @Override
    public List<Object> clubNameList(Integer clubStatus){
        List<Clubmanager>  clubmanagerList= clubmanagerMapper.selectByClubStatus(clubStatus);
        List<Object> objectList = new ArrayList<>();
        for (Clubmanager clubmanager : clubmanagerList) {
            Map<String,Object> clubName = new HashMap<>(2);
            clubName.put("id",clubmanager.getId());
            clubName.put("name",clubmanager.getName());
            objectList.add(clubName);
        }
        return objectList;
    }

    @Override
    public List<Object> clubmanagerList(Integer clubStatus) throws ParseException {
        List<Clubmanager>  clubmanagerList = clubmanagerMapper.selectByClubStatus(clubStatus);
        List<Object> resultList = new ArrayList<>();
        for (Clubmanager clubmanager : clubmanagerList) {
            Map<String,Object> clubmanagerMap = new HashMap<>(7);
            clubmanagerMap.put("id",clubmanager.getId());
            clubmanagerMap.put("name",clubmanager.getName());
            clubmanagerMap.put("number",clubmanager.getNumber());
            clubmanagerMap.put("declarationTime", DateFormatUtil.DateFormat(clubmanager.getDeclarationTime().toString()));
            clubmanagerMap.put("studentId",clubmanager.getStudentId());
            Studentmsg studentmsg =  studentmsgMapper.selectByPrimaryKey(clubmanager.getStudentId());
            clubmanagerMap.put("studentName",studentmsg.getName());
            if (clubStatus == 1) {
                clubmanagerMap.put("clubStatus","申请创建");
            } else if (clubStatus == 2) {
                clubmanagerMap.put("clubStatus","申请解散");
            } else if (clubStatus == 3) {
                clubmanagerMap.put("clubStatus","已创建");
            } else if (clubStatus == 4) {
                clubmanagerMap.put("clubStatus","已解散");
            }
            resultList.add(clubmanagerMap);
        }
        return resultList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int clubStatus(Integer id,Integer clubStatus) {
        return clubmanagerMapper.clubStatus(id,clubStatus);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int ClubCreateApp(String name,Integer number,Integer studentId) {
        Clubmanager clubmanager = new Clubmanager();
        clubmanager.setName(name);
        clubmanager.setNumber(number);
        clubmanager.setStudentId(studentId);
        clubmanager.setClubStatus(1);
        return clubmanagerMapper.insert(clubmanager);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int clubDismissApp(Integer id,Integer studentId) throws Exception {
        Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(id);
        if (clubmanager.getStudentId().equals(studentId)) {
            return clubmanagerMapper.deleteByPrimaryKey(id);
        } else {
            throw new Exception();
        }
    }

}
