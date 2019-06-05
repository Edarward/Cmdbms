package com.cmdbms.controller;

import com.cmdbms.model.Teaarrange;
import com.cmdbms.service.TeaArgHisSer;
import com.cmdbms.service.TeaArrangeSer;
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
@RequestMapping("/argTeaCourse")
@Api("教师管理模块")
public class TeaArrangeCon {

    @Autowired
    TeaArrangeSer teaArrangeSer;
    @Autowired
    TeaArgHisSer teaArgHisSer;

    @ApiOperation(value = "修改教师课程")
    @PostMapping("/updateTeaArg")
    public ResultVO updateTeaArg (Teaarrange teaarrange) {
        try {
            return ResultUtils.success(teaArrangeSer.updateOne(teaarrange));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改失败！");
        }
    }

    @ApiOperation(value = "查询教师课程")
    @GetMapping("/selectTeaArg")
    public ResultVO selectTeaArg () {
        try {
            return ResultUtils.success(teaArrangeSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "删除教师课程")
    @PostMapping("/delTeaArg")
    public ResultVO delTeaArg (int id) {
        try {
            return ResultUtils.success(teaArrangeSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"删除失败！");
        }
    }
}
