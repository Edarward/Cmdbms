package com.cmdbms.controller;


import com.cmdbms.model.Examretake;
import com.cmdbms.service.RetakeSer;
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
@RequestMapping("/retake")
@Api("重考管理模块")
public class RetakeCon {
    @Autowired
    private RetakeSer retakeSer;

    @ApiOperation(value = "添加重考信息")
    @PostMapping("/insertRetake")
    public ResultVO insertRetake(Examretake examretake){
        try {
            return ResultUtils.success(retakeSer.insertRetake(examretake));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除重考信息")
    @PostMapping("/deleteRetake")
    public ResultVO deleteRetake(Integer id){
        try {
            return ResultUtils.success(retakeSer.deleteRetake(id));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }

    @ApiOperation(value = "修改重考信息")
    @PostMapping("/updateRetake")
    public ResultVO updateRetake(Examretake examretake){
        try {
            return ResultUtils.success(retakeSer.updateRetake(examretake));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }

    @ApiOperation(value = "查询重考信息（根据审核状态）")
    @GetMapping("/selectRetake")
    public ResultVO selectRetake(Integer exuseThrough){
        try {
            return ResultUtils.success(retakeSer.selectRetake(exuseThrough));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }

    @ApiOperation(value = "查询重考信息（根据学生ID）")
    @GetMapping("/selectRetaketwo")
    public ResultVO selectRetaketwo(Integer exuseStuId){
        try {
            return ResultUtils.success(retakeSer.selectRetaketwo(exuseStuId));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }
}
