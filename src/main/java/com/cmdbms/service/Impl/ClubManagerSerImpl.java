package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ClubmanagerMapper;
import com.cmdbms.model.Clubmanager;
import com.cmdbms.service.ClubManagerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClubManagerSerImpl implements ClubManagerSer {

    @Autowired
    private ClubmanagerMapper clubmanagerMapper;

    @Override
    public List<Object> clubNameList(Integer clubStatus){
        List<Clubmanager>  clubmanagerList= clubmanagerMapper.selectByClubStatus(clubStatus);
        List<Object> objectList = new ArrayList<>();
        for (Clubmanager clubmanager : clubmanagerList) {
            Map<String,Object> clubName = new HashMap<>();
            clubName.put("id",clubmanager.getId());
            clubName.put("name",clubmanager.getName());
            objectList.add(clubName);
        }
        return objectList;
    }
}
