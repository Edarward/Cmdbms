package com.cmdbms.service;

import com.cmdbms.model.Examclassroom;
import com.cmdbms.model.Examclassroomuse;

import java.text.ParseException;
import java.util.List;

public interface ClassroomSer {
    String insertClassroom(Examclassroom examclassroom);

    List selectClassroom(Integer clrType);

    String updateClassroom(Examclassroom examclassroom);

    String insertClruse(Integer id,Integer useClrId,Integer useClrTime, String useClrDate,Integer useThrough, String useClrName) throws ParseException;

    List selectClruse(Integer useThrough);

    String updateClruse(Integer id,Integer useThrough);

    List selectClrusetwo(String useClrDate) throws ParseException;
}
