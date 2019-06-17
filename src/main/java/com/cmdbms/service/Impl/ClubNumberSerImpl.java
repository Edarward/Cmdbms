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
                recording.put("exitTime",DateFormatUtil.DateFormat(clubnumber.getExitTime().toString()));
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
        return clubnumberMapper.updateById(id,clubId,clubPositionId);
    }
}
