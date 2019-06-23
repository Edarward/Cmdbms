package com.cmdbms.service;

import com.cmdbms.model.Examarrange;

import java.text.ParseException;
import java.util.List;

public interface ExamSer {
    String insertArrange(Integer id, Integer examSubId, String examDate, Integer examTime, Integer examClassroomId, String examClrName, String examSubName, Integer examYear) throws ParseException;

    List selectArrang(Integer id);

    int deleteArrang(Integer id);

    String updateArrange(Integer id, String examDate, Integer examTime, Integer examClassroomId, String examClrName) throws ParseException;

    String updateGrade(Integer id, Integer gradeStuId, Integer gradeStu, String gradeLimit, Integer gradeJudge, Integer gradeViolate, Integer gradeReview) throws ParseException;

    List selectGrade(Integer gradeStuId,Integer gradeReview);

    List selectunpass(Integer unpassStuId);

    List selectViolent(Integer id);

    String updateViolent(Integer id,Integer vioStuId, String vioBehavior, String vioContent, Integer vioLevel);
}
