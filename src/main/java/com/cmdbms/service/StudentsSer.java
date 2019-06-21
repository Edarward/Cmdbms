package com.cmdbms.service;

import com.cmdbms.model.Studentcontent;
import com.cmdbms.model.Studentevaluationstate;
import com.cmdbms.model.Studentmsg;

import java.util.List;

public interface StudentsSer {
    String insertStudents(Studentmsg studentmsg);

    String updateStudents(Studentmsg studentmsg);

    Studentmsg selectStudents(Integer id);

    int deleteStudents(Integer id);

    String insertContent(Integer id, Integer stuId,  Integer stuCourseid, Integer stuQuestionid, String stuType, String stuContent);

    List selectQuestion();

    String insertState(Studentevaluationstate studentevaluationstate);

    List selectgrade(Integer gradeStuId, String gradeMajor, Integer gradeYear);

    List selectChoo(Integer stuId);

    List selectStuexam(Integer stuexamStuId);

    List selectCode(Integer stuId);

}
