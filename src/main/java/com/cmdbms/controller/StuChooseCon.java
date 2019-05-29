package com.cmdbms.controller;


import com.cmdbms.mapper.ChoosecourseMapper;
import com.cmdbms.model.Choosecourse;
import com.cmdbms.service.ChooseCourseSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stuChoose")
public class StuChooseCon {

    @Autowired
    private ChooseCourseSer chooseCourseSer;

    @ApiOperation(value = "学生选课申请")
    @PostMapping("/stuChooseApply")
    public ResultVO stuChooseApply (Choosecourse choosecourse) {
        try {
            return ResultUtils.success(chooseCourseSer.stuChooseApply(choosecourse));
        } catch (Exception e) {
            return ResultUtils.error(-1,"选课失败！");
        }
    }

    @ApiOperation(value = "学生选课取消")
    @PostMapping("/cancelChoose")
    public ResultVO cancelChoose (int id) {
        try {
            return ResultUtils.success(chooseCourseSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"取消失败！");
        }
    }

    @ApiOperation(value = "学生选课信息")
    @GetMapping("/stuChooseInfo")
    public ResultVO stuChooseInfo () {
        try {
            return ResultUtils.success(chooseCourseSer.selectChooseInfo());
        } catch (Exception e) {
            return ResultUtils.error(-1,"取消失败！");
        }
    }
}
