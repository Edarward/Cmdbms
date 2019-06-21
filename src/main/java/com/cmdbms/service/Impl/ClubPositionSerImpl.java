package com.cmdbms.service.Impl;

import com.cmdbms.mapper.ClubpositionMapper;
import com.cmdbms.model.Clubposition;
import com.cmdbms.service.ClubPositionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubPositionSerImpl implements ClubPositionSer {

    @Autowired
    private ClubpositionMapper clubpositionMapper;

    @Override
    public List<Clubposition> positionList() {
        return clubpositionMapper.selectAll();
    }
}
