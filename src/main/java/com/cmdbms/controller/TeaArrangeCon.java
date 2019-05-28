package com.cmdbms.controller;

import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.TeaArgHisSer;
import com.cmdbms.service.TeaArrangeSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arrangeCourse")
@Api("教师管理模块")
public class TeaArrangeCon {

    @Autowired
    TeaArrangeSer teaArrangeSer;
    @Autowired
    TeaArgHisSer teaArgHisSer;

    @ApiOperation(value = "添加教师课程")
    @PostMapping("/addTeaArg")
    public ResultVO addCourse (Teaarrange teaarrange) {
        try {
            return ResultUtils.success(teaArrangeSer.insertOne(teaarrange));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

}
