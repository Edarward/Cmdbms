package com.cmdbms.service.Impl;

import com.cmdbms.mapper.StudentsMapper;
import com.cmdbms.model.Student;
import com.cmdbms.service.StudentSer;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSerImpl implements StudentSer {

    @Autowired
    StudentsMapper studentsMappers;

    @Override
    public List<Student> studentList (){

        return studentsMappers.selectAll();

    }

    @Override
    public int delStudent (Integer id) {

        return 1;
    }
    @Override
    public String insertOne(Student student){
        Integer record  = studentsMappers.insertOne(student);
        System.out.println(record);
        return record.toString();
    }
    @Override
    public String updataOne(Student student){
        Integer record  = studentsMappers.updataOne(student);

        return record.toString();
    }
}
