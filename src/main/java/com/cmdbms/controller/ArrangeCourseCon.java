package com.cmdbms.controller;

import com.cmdbms.model.Argcoure;
import com.cmdbms.service.ArrangeCourseSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/arrangeCourse")
@Api("课程表模块")
public class ArrangeCourseCon {

    @Autowired
    private ArrangeCourseSer arrangeCourseSer;


    /***********测试ing**********/
    @ApiOperation(value = "添加课表")
    @PostMapping("/addArgCourse")
    public ResultVO addArgCourse (@RequestBody Argcoure argcoure) {
        try {
            return ResultUtils.success(arrangeCourseSer.insertOne(argcoure));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }


    /***********测试成功************/
    @ApiOperation(value = "修改课表")
    @PostMapping("/updateArgCourse")
    public ResultVO updateArgCourse (Argcoure argcoure) {
        try {
            return ResultUtils.success(arrangeCourseSer.updateOne(argcoure));
        } catch (Exception e) {
            return ResultUtils.error(-1,"更改失败！");
        }
    }

    @ApiOperation(value = "删除课表")
    @PostMapping("/delArgCourse")
    public ResultVO delArgCourse (int id) {
        try {
            return ResultUtils.success(arrangeCourseSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"删除失败！");
        }
    }


    /*测试成功*/
    @ApiOperation(value = "查询课表")
    @GetMapping("/selectArgCourse")
    public ResultVO selectArgCourse () {
        try {
            return ResultUtils.success(arrangeCourseSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

}
