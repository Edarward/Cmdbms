package com.cmdbms.service;

import com.cmdbms.model.Examclassroom;
import com.cmdbms.model.Examclassroomuse;

import java.util.List;

public interface ClassroomSer {
    String insertClassroom(Examclassroom examclassroom);

    List selectClassroom(Integer clrType);

    String updateClassroom(Examclassroom examclassroom);

    String insertClruse(Examclassroomuse examclassroomuse);

    List selectClruse(Integer useThrough);

    String updateClruse(Examclassroomuse examclassroomuse);
}
