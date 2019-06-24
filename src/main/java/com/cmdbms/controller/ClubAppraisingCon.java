package com.cmdbms.controller;

import com.cmdbms.service.ClubAppraisingSer;
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
@RequestMapping("/clubAppraising")
@Api("社团评优管理模块")
public class ClubAppraisingCon {

    @Autowired
    private ClubAppraisingSer clubAppraisingSer;

    @ApiOperation(value = "评优数据显示")
    @GetMapping("/clubAppList")
    public ResultVO clubAppList (Integer term) {
        try {
            return ResultUtils.success(clubAppraisingSer.clubAppList(term));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    /**
     * Param: 1  开始评优
     *        2  评优审核
     *        3  评优结束
     *        4  发布结果
     * Author: Edarward
     */
    @ApiOperation(value = "评价状态更改")
    @PostMapping("/updateClubApp")
    public ResultVO updateClubApp (Integer status,Integer term) {
        try {
            return ResultUtils.success(clubAppraisingSer.updateClubApp(status,term));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    /**
     * 信息门户
     */
    @ApiOperation(value = "社团成员评优")
    @PostMapping("/clubNumberPing")
    public ResultVO clubNumberPing (Integer id,Integer appraisiontId) {
        try {
            return ResultUtils.success(clubAppraisingSer.clubNumberPing(id,appraisiontId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "社团评优公示")
    @PostMapping("/clubNumberPingList")
    public ResultVO clubNumberPingList () {
        try {
            return ResultUtils.success(clubAppraisingSer.clubNumberPingList());
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

}
