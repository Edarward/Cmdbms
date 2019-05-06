package com.cmdbms.controller;

import com.cmdbms.mapper.StudentsMapper;
import com.cmdbms.model.Student;
import com.cmdbms.service.StudentSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentCon {

    @Autowired
    StudentsMapper studentsMapper;
    @Autowired
    StudentSer studentSer;


    @GetMapping("/studentList")
    public ResultVO studentList () {
        try {
            return ResultUtils.success(studentSer.studentList());
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/delStudent")
    public ResultVO delStudent (Integer id) {
        try {
            return ResultUtils.success(studentsMapper.deleteByPrimaryKey(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }
    @PostMapping("/insertOne")
    public ResultVO insertOne (Student student){
        try {
            return ResultUtils.success(studentSer.insertOne(student));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }
    @PostMapping("/updataOne")
    public ResultVO updataOne (Student student){
        try {
            return ResultUtils.success(studentSer.updataOne(student));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }


}
