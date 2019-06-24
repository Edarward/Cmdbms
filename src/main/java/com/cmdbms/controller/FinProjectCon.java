package com.cmdbms.controller;


import com.cmdbms.model.Financialproject;
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
@RequestMapping("/finProjectCon")
@Api("财务缴费项目管理模块")
public class FinProjectCon {

    @Autowired
    private FinProjectSer finProjectSer;
    @ApiOperation(value = "添加缴费项目")
    @PostMapping("/addFinProject")
    public ResultVO addCourse (Financialproject financialproject) {
        try {
            return ResultUtils.success(finProjectSer.insertOne(financialproject));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "修改缴费项目")
    @PostMapping("/updateFinProject")
    public ResultVO updateFinProject (Financialproject financialproject) {
        try {
            return ResultUtils.success(finProjectSer.updateOne(financialproject));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "删除缴费项目")
    @PostMapping("/delFinProject")
    public ResultVO delFinProject (int proId) {
        try {
            return ResultUtils.success(finProjectSer.deleteOne(proId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    //修改时间
    @ApiOperation(value = "查询缴费项目")
    @GetMapping("/selectFinProject")
    public ResultVO selectFinProject () {
        try {
            return ResultUtils.success(finProjectSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

}
