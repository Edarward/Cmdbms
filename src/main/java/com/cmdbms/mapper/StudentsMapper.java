package com.cmdbms.mapper;

import com.cmdbms.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {

    Student deleteByPrimaryKey (Integer id);

    List<Student> selectAll ();

    int insertOne(Student student);

    int updataOne(Student student);


}
