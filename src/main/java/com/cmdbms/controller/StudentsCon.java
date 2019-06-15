package com.cmdbms.controller;

import com.cmdbms.model.Studentmsg;
import com.cmdbms.service.StudentsSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
@Api("学生管理模块")
public class StudentsCon {
    @Autowired
    private StudentsSer studentsSer;

    @ApiOperation(value = "添加学生信息")
    @PostMapping("/insertStudents")
    public ResultVO insertStudents(Studentmsg studentmsg){
        try {
            return ResultUtils.success(studentsSer.insertStudents(studentmsg));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "修改学生信息")
    @PostMapping("/updateStudents")
    public ResultVO updateStudents(Studentmsg studentmsg){
        try {
            return ResultUtils.success(studentsSer.updateStudents(studentmsg));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除学生信息")
    @PostMapping("/deleteStudents")
    public ResultVO deleteStudents(Integer id){
        try {
            return ResultUtils.success(studentsSer.deleteStudents(id));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询学生信息")
    @GetMapping("/selectStudents")
    public ResultVO selectStudents(Integer id){
        try {
            return ResultUtils.success(studentsSer.selectStudents(id));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }
}
