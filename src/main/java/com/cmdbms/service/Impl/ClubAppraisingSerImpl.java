package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ClubappraisingMapper;
import com.cmdbms.mapper.ClubmanagerMapper;
import com.cmdbms.mapper.ClubnumberMapper;
import com.cmdbms.mapper.StudentmsgMapper;
import com.cmdbms.model.Clubappraising;
import com.cmdbms.model.Clubmanager;
import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.ClubAppraisingSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClubAppraisingSerImpl implements ClubAppraisingSer {

    @Autowired
    public ClubappraisingMapper clubappraisingMapper;
    @Autowired
    private ClubmanagerMapper clubmanagerMapper;
    @Autowired
    private StudentmsgMapper studentmsgMapper;
    @Autowired
    private ClubnumberMapper clubnumberMapper;

    @Override
    public List<Object> clubAppList (Integer term)  {
        List<Object> resultList = new ArrayList<>();
        List<Clubappraising> clubappraisingList = clubappraisingMapper.selByTerm(term);
        for (Clubappraising clubappraising : clubappraisingList) {
            Map<String,Object> clubapp = new HashMap<>();
            clubapp.put("id",clubappraising.getId());
            clubapp.put("clubId",clubappraising.getClubId());
            //社团名称
            Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubappraising.getClubId());
            clubapp.put("clubName",clubmanager.getName());
            if (clubappraising.getAppraisingStart()&&!clubappraising.getAppraisingResult()) {
                clubapp.put("status","开始评价");
            } else if(clubappraising.getAppraisingStart()&&clubappraising.getAppraisingResult()){
                clubapp.put("status","评价审核");
            } else if (!clubappraising.getAppraisingStart()&&!clubappraising.getAppraisingResult()) {
                clubapp.put("status","结束评价");
            } else {
                clubapp.put("status","发布结果");
            }
            clubapp.put("studentId",clubappraising.getStudentId());
            Studentmsg studentmsg =  studentmsgMapper.selectByPrimaryKey(clubappraising.getStudentId());
            if (studentmsg == null) {
                clubapp.put("studentName","暂未选出");
            } else {
                clubapp.put("studentName",studentmsg.getName());
            }
            resultList.add(clubapp);
        }
        return resultList;
    }

    @Override
    public int updateClubApp (Integer status,Integer term) {
        //开始评价 1
        if (status == 1) {
            //将所有创建的社团放入评优
            List<Clubmanager> clubmanagerList = clubmanagerMapper.selectByClubStatus(3);
            for (Clubmanager clubmanager : clubmanagerList) {
                Clubappraising clubappraising = new Clubappraising();
                clubappraising.setClubId(clubmanager.getId());
                clubappraising.setTerm(term);
                clubappraising.setAppraisingStart(true);
                clubappraising.setAppraisingResult(false);
                clubappraisingMapper.insert(clubappraising);
            }

        } else {
            clubappraisingMapper.updateClubApp(status,term);
        }
        return status;
    }

    @Override
    public int clubNumberPing(Integer id,Integer appraisiontId) {
        return clubnumberMapper.clubNumberPing(id, appraisiontId);
    }

    @Override
    public  List<Object> clubNumberPingList() {
        List<Object> resultList = new ArrayList<>();
        List<Clubappraising> clubappraisingList =  clubappraisingMapper.selectAll();
        for (Clubappraising clubappraising : clubappraisingList) {
            if (!clubappraising.getAppraisingStart()&&clubappraising.getAppraisingResult()) {
                Map<String,Object> resultMap = new HashMap<>(3);
                //学期
                resultMap.put("term",clubappraising.getTerm());
                //社团名称
                Clubmanager clubmanager = clubmanagerMapper.selectByPrimaryKey(clubappraising.getClubId());
                resultMap.put("clubName",clubmanager.getName());
                //学生名字
                Studentmsg studentmsg = studentmsgMapper.selectByPrimaryKey(clubappraising.getStudentId());
                resultMap.put("studentName",studentmsg.getName());
                resultList.add(resultMap);
            }
        }
        return resultList;
    }
}
