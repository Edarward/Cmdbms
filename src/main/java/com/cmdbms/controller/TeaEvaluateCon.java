package com.cmdbms.controller;


import com.cmdbms.model.Teaevaluate;
import com.cmdbms.service.TeaEvaluateSer;
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
@RequestMapping("/teaEvaluate")
@Api("考评管理模块")
public class TeaEvaluateCon {

    @Autowired
    TeaEvaluateSer teaEvaluateSer;

    @ApiOperation(value = "管理员查询考评")
    @GetMapping("/selectEvalu")
    public ResultVO selectEvalu () {
        try {
            return ResultUtils.success(teaEvaluateSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"管理员查询考评失败！");
        }
    }

    @ApiOperation(value = "职工查询考评")
    @PostMapping("/selectEvaluSelf")
    public ResultVO selectEvaluSelf (int teacherId) {
        try {
            return ResultUtils.success(teaEvaluateSer.selectOneSelf(teacherId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"职工查询考评失败！");
        }
    }

    @ApiOperation(value = "管理员添加考评")
    @PostMapping("/insertEvaluSelf")
    public ResultVO insertEvaluSelf (Teaevaluate teaevaluate) {
        try {
            return ResultUtils.success(teaEvaluateSer.insertOne(teaevaluate));
        } catch (Exception e) {
            return ResultUtils.error(-1,"管理员添加考评失败！");
        }
    }

    @ApiOperation(value = "管理员删除考评")
    @PostMapping("/deleteEvaluSelf")
    public ResultVO deleteEvaluSelf (int id) {
        try {
            return ResultUtils.success(teaEvaluateSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"删除考评失败！");
        }
    }

    @ApiOperation(value = "管理员修改考评")
    @PostMapping("/updateEvaluSelf")
    public ResultVO updateEvaluSelf (Teaevaluate teaevaluate) {
        try {
            return ResultUtils.success(teaEvaluateSer.updateOne(teaevaluate));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改考评失败！");
        }
    }

}
