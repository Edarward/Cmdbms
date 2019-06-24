package com.cmdbms.service;

import com.cmdbms.model.Clubactivity;

import java.text.ParseException;
import java.util.List;

public interface ClubActivitySer {

    List<Object> selActivity(Integer status) throws ParseException;

    int clubActAuditing(Integer reviewStatus,Integer id);

    int addClubActPublish(Clubactivity clubactivity);

    List<Object> clubActPublish() throws ParseException;

    int clubMessageDown(Integer id);

    List<Object> selClubMessage (Integer clubActivityId);

    int clubActivityApp(Clubactivity clubactivity,Integer studentId);

    List<Object> selActivity() throws ParseException;

    int addConOne(Integer id,String content);

    List<Object> selMyActivity(Integer studentId) throws ParseException;

    int activityApp(Integer studentId,Integer actId);
}
