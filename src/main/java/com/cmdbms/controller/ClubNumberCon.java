package com.cmdbms.controller;

import com.cmdbms.service.ClubManagerSer;
import com.cmdbms.service.ClubNumberSer;
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
@RequestMapping("/clubNumber")
@Api("社团成员信息管理模块")
public class ClubNumberCon {

    @Autowired
    private ClubNumberSer clubNumberSer;
    @Autowired
    private ClubManagerSer clubManagerSer;

    @ApiOperation(value = "社团成员信息列表")
    @GetMapping("/selectClubNumber")
    public ResultVO selectClubNumber (Integer studentId) {
        try {
            return ResultUtils.success(clubNumberSer.numberList(studentId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员信息修改—修改")
    @PostMapping("/updateClubNumber")
    public ResultVO updateClubNumber (Integer id,Integer clubId,Integer clubPositionId) {
        try {
            return ResultUtils.success(clubNumberSer.updateClubNumber(id,clubId,clubPositionId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员信息修改—显示社团编号")
    @GetMapping("/selectClubId")
    public ResultVO selectClubId (Integer clubStatus) {
        try {
            return ResultUtils.success(clubManagerSer.clubNameList(clubStatus));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员信息修改—显示社团职位")
    @GetMapping("/selectClubPositionId")
    public ResultVO selectClubPositionId (Integer clubStatus) {
        try {
            return ResultUtils.success(clubManagerSer.clubNameList(clubStatus));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }
}
