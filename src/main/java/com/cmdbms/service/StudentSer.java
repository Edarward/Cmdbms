package com.cmdbms.service;

import com.cmdbms.model.Student;

import java.util.List;

public interface StudentSer {

    List<Student> studentList ();

    int delStudent (Integer id);

    String insertOne(Student student);

    String updataOne(Student student);

}
