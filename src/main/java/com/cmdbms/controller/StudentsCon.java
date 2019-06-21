package com.cmdbms.controller;

import com.cmdbms.model.Studentcontent;
import com.cmdbms.model.Studentevaluationstate;
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

    @ApiOperation(value = "添加教评信息")
    @PostMapping("/insertContent")
    public ResultVO insertContent(Integer id, Integer stuId, Integer stuCourseid, Integer stuQuestionid, String stuType, String stuContent){
        try {
            return ResultUtils.success(studentsSer.insertContent(id,stuId,stuCourseid,stuQuestionid,stuType,stuContent));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询问题信息")
    @GetMapping("/selectQuestion")
    public ResultVO selectQuestion(){
        try {
            return ResultUtils.success(studentsSer.selectQuestion());
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "添加已教评信息")
    @PostMapping("/insertState")
    public ResultVO insertState(Studentevaluationstate studentevaluationstate){
        try {
            return ResultUtils.success(studentsSer.insertState(studentevaluationstate));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询成绩信息")
    @GetMapping("/selectgrade")
    public ResultVO selectgrade(Integer gradeStuId, String gradeMajor, Integer gradeYear){
        try {
            return ResultUtils.success(studentsSer.selectgrade(gradeStuId, gradeMajor, gradeYear));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询选课信息")
    @GetMapping("/selectChoo")
    public ResultVO selectChoo(Integer stuId){
        try {
            return ResultUtils.success(studentsSer.selectChoo(stuId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询考试信息")
    @GetMapping("/selectStuexam")
    public ResultVO selectStuexam(Integer stuexamStuId){
        try {
            return ResultUtils.success(studentsSer.selectStuexam(stuexamStuId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询课程信息信息")
    @GetMapping("/selectCode")
    public ResultVO selectCode(Integer stuId){
        try {
            return ResultUtils.success(studentsSer.selectCode(stuId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }
}
