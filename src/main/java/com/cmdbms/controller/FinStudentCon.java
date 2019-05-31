package com.cmdbms.controller;


import com.cmdbms.model.Financialstudent;
import com.cmdbms.service.FinProjectSer;
import com.cmdbms.service.FinStudentSer;
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
@RequestMapping("/finStudent")
@Api("财务缴费管理模块")
public class FinStudentCon {


    @Autowired
    private FinProjectSer finProjectSer;
    @Autowired
    private FinStudentSer finStudentSer;


    @ApiOperation(value = "管理员录入缴费记录")
    @PostMapping("/addFinStudent")
    public ResultVO addCourse (Financialstudent record) {
        try {
            return ResultUtils.success(finStudentSer.insertOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }


    @ApiOperation(value = "管理员查询缴费记录")
    @GetMapping("/selectFinStudent")
    public ResultVO selectFinStudent () {
        try {
            return ResultUtils.success(finStudentSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }


    @ApiOperation(value = "管理员查询缴费记录")
    @PostMapping("/selectFinStuSelf")
    public ResultVO selectFinStuSelf (int stuId) {
        try {
            return ResultUtils.success(finStudentSer.selectStuSelf(stuId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }


}
