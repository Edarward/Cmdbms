package com.cmdbms.service;

import com.cmdbms.model.Examarrange;

import java.text.ParseException;
import java.util.List;

public interface ExamSer {
    String insertArrange(Integer id, Integer examSubId, String examDate, Integer examTime, Integer examClassroomId, String examClrName, String examSubName) throws ParseException;

    List selectArrang(Integer id);

    int deleteArrang(Integer id);

    String updateArrange(Integer id, Integer examSubId, String examDate, Integer examTime, Integer examClassroomId, String examClrName, String examSubName) throws ParseException;
}
