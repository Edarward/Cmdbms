package com.cmdbms.controller;

import com.cmdbms.model.Course;
import com.cmdbms.service.CourseManageSer;
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
@RequestMapping("/courseManage")
@Api("课程管理模块")

/**************************************测试成功*****************************/

public class CourseManageCon {

    @Autowired
    private  CourseManageSer courseManageSer;

    @ApiOperation(value = "添加课程")
    @PostMapping("/addCourse")
    public ResultVO addCourse (Course course) {
        try {
            return ResultUtils.success(courseManageSer.insertOne(course));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "查询课程")
    @GetMapping("/selectCourse")
    public ResultVO selectCourse () {
        try {
            return ResultUtils.success(courseManageSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "更新课程")
    @PostMapping("/updateCourse")
    public ResultVO updateCourse (Course course) {
        try {
            return ResultUtils.success(courseManageSer.updateOne(course));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改失败！");
        }
    }

    @ApiOperation(value = "删除课程")
    @PostMapping("/deleteCourse")
    public ResultVO deleteCourse (int id) {
        try {
            return ResultUtils.success(courseManageSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"删除失败！");
        }
    }
}
