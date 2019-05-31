package com.cmdbms.controller;


import com.cmdbms.model.Financialstudent;
import com.cmdbms.model.Financialsubsidies;
import com.cmdbms.service.FinProjectSer;
import com.cmdbms.service.FinStudentSer;
import com.cmdbms.service.FinSubsidySer;
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
@RequestMapping("/finSubsidy")
@Api("助学金项目管理模块")
public class FinSubsidyCon {

    @Autowired
    private FinProjectSer finProjectSer;
    @Autowired
    private FinStudentSer finStudentSer;

    @Autowired
    private FinSubsidySer finSubsidySer;
    @ApiOperation(value = "助学金缴纳")
    @PostMapping("/addFinSubsidy")
    public ResultVO addFinSubsidy (Financialsubsidies record) {
        try {
            return ResultUtils.success(finSubsidySer.insertOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "管理员助学金缴纳")
    @GetMapping("/selectFinSubsidy")
    public ResultVO selectFinSubsidy () {
        try {
            return ResultUtils.success(finSubsidySer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "学生助学金查询")
    @PostMapping("/selectFinSubsidySelf")
    public ResultVO selectFinSubsidySelf (int stuId) {
        try {
            return ResultUtils.success(finSubsidySer.selectOneSelf(stuId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "管理员助学金审核")
    @PostMapping("/CheckFinSalary")
    public ResultVO CheckFinSalary (Financialsubsidies record) {
        try {
            return ResultUtils.success(finSubsidySer.updateOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }
}
