package com.cmdbms.controller;


import com.cmdbms.model.Financialconsumables;
import com.cmdbms.model.Financialproject;
import com.cmdbms.model.Financialwage;
import com.cmdbms.service.FinConsumbSer;
import com.cmdbms.service.FinProjectSer;
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
@RequestMapping("/finConsumab")
@Api("财务报账模块")
public class FinConsumabCon {

    @Autowired
    private FinConsumbSer finConsumbSer;



    @ApiOperation(value = "添加财务报账")
    @PostMapping("/addFinConsumab")
    public ResultVO addFinConsumab (Financialconsumables record) {
        try {
            return ResultUtils.success(finConsumbSer.insertOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "查询财务报账")
    @GetMapping("/selectFinConsumab")
    public ResultVO selectFinConsumab () {
        try {
            return ResultUtils.success(finConsumbSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "下发工资")
    @PostMapping("/teacherSalary")
    public ResultVO teacherSalary (Financialwage record) {
        try {
            return ResultUtils.success(finConsumbSer.insertTeacherSalary(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "查询工资")
    @GetMapping("/selectTeacSalary")
    public ResultVO selectTeacSalary () {
        try {
            return ResultUtils.success(finConsumbSer.selectTeaSal());
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

}
