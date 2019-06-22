package com.cmdbms.controller;


import com.cmdbms.mapper.ExamarrangeMapper;
import com.cmdbms.model.Examarrange;
import com.cmdbms.service.ExamSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/exam")
@Api("考试管理模块")
public class ExamCon {
    @Autowired
    private ExamSer examSer;

    @ApiOperation(value = "添加考试信息")
    @PostMapping("/insertArrange")
    public ResultVO insertArrange(Integer id,Integer examSubId, String examDate, Integer examTime, Integer examClassroomId, String examClrName, String examSubName, Integer examYear){
        try {
            return ResultUtils.success(examSer.insertArrange(id,examSubId,examDate,examTime,examClassroomId,examClrName,examSubName,examYear));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "修改考试信息")
    @PostMapping("/updateArrange")
    public ResultVO updateArrange(Integer id, String examDate, Integer examTime, Integer examClassroomId, String examClrName){
        try {
            return ResultUtils.success(examSer.updateArrange(id,examDate,examTime,examClassroomId,examClrName));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除考试信息")
    @PostMapping("/deleteArrange")
    public ResultVO deleteArrange(Integer id){
        try {
            return ResultUtils.success(examSer.deleteArrang(id));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询考试信息")
    @GetMapping("/selectArrange")
    public ResultVO selectArrange(Integer id){
        try {
            return ResultUtils.success(examSer.selectArrang(id));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "修改成绩信息")
    @PostMapping("/updateGrade")
    public ResultVO updateGrade(Integer id, Integer gradeStuId, Integer gradeStu, String gradeLimit, Integer gradeJudge, Integer gradeViolate, Integer gradeReview){
        try {
            return ResultUtils.success(examSer.updateGrade(id,gradeStuId,gradeStu,gradeLimit,gradeJudge,gradeViolate,gradeReview));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询成绩信息")
    @GetMapping("/selectGrade")
    public ResultVO selectGrade(Integer gradeStuId){
        try {
            return ResultUtils.success(examSer.selectGrade(gradeStuId));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询不及格成绩信息")
    @GetMapping("/selectUnpass")
    public ResultVO selectunpass(Integer unpassStuId){
        try {
            return ResultUtils.success(examSer.selectunpass(unpassStuId));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询违纪信息")
    @GetMapping("/selectViolent")
    public ResultVO selectViolent(Integer id){
        try {
            return ResultUtils.success(examSer.selectViolent(id));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "修改违纪信息")
    @PostMapping("/updateViolent")
    public ResultVO updateViolent(Integer id,Integer vioStuId, String vioBehavior, String vioContent, Integer vioLevel){
        try {
            return ResultUtils.success(examSer.updateViolent(id,vioStuId,vioBehavior,vioContent,vioLevel));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }
}
