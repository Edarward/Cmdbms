package com.cmdbms.service;

import java.util.List;

public interface ClubAppraisingSer {

    List<Object> clubAppList (Integer term);

    int updateClubApp (Integer status,Integer term);

    int clubNumberPing(Integer id,Integer appraisiontId);

    List<Object> clubNumberPingList();
}
