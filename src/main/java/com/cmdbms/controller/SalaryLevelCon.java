package com.cmdbms.controller;


import com.cmdbms.model.Staffmsg;
import com.cmdbms.model.Staffsalary;
import com.cmdbms.service.SalaryLevelSer;
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
@RequestMapping("/salaryLevel")
@Api("薪水管理")
public class SalaryLevelCon {

    @Autowired
    SalaryLevelSer salaryLevelSer;

    @ApiOperation(value = "添加薪资")
    @PostMapping("/addSalaryLevel")
    public ResultVO addSalaryLevel (Staffsalary record) {
        try {
            return ResultUtils.success(salaryLevelSer.insertOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }


    @ApiOperation(value = "修改薪资")
    @PostMapping("/updateSalary")
    public ResultVO updateSalary (Staffsalary record) {
        try {
            return ResultUtils.success(salaryLevelSer.updateOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "删除薪资")
    @PostMapping("/deleteSalary")
    public ResultVO deleteSalary (int id) {
        try {
            return ResultUtils.success(salaryLevelSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "添加薪资")
    @GetMapping("/selectSalary")
    public ResultVO selectSalary () {
        try {
            return ResultUtils.success(salaryLevelSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

}
