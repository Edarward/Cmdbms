package com.cmdbms.controller;

import com.cmdbms.service.ClubManagerSer;
import com.cmdbms.service.ClubNumberSer;
import com.cmdbms.service.ClubPositionSer;
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
    @Autowired
    private ClubPositionSer clubPositionSer;

    @ApiOperation(value = "社团成员信息列表")
    @GetMapping("/selClubNumber")
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
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员信息修改—显示社团编号")
    @GetMapping("/selClubId")
    public ResultVO selectClubId (Integer clubStatus) {
        try {
            return ResultUtils.success(clubManagerSer.clubNameList(clubStatus));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员信息修改—显示社团职位")
    @GetMapping("/selClubPosId")
    public ResultVO selectClubPositionId () {
        try {
            return ResultUtils.success(clubPositionSer.positionList());
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员申请审核—入社(退社)申请显示")
    @GetMapping("appList")
    public ResultVO applicationList (Integer appState) {
        try {
            return ResultUtils.success(clubNumberSer.applicationList(appState));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员申请审核—入社(退社)审核")
    @PostMapping("auditingList")
    public ResultVO auditingList (Integer appState,Integer id) {
        try {
            return ResultUtils.success(clubNumberSer.auditing(appState,id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    /**
     * 信息门户
     */
    @ApiOperation(value = "个人信息查询")
    @GetMapping("selClubPsoNumber")
    public ResultVO auditingList (Integer studentId) {
        try {
            return ResultUtils.success(clubNumberSer.auditingList(studentId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员入社申请")
    @PostMapping("joinApp")
    public ResultVO joinApp (Integer studentId,Integer clubId) {
        try {
            return ResultUtils.success(clubNumberSer.joinApp(studentId,clubId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "成员退社申请")
    @PostMapping("exitApp")
    public ResultVO exitApp (Integer studentId,Integer id) {
        try {
            return ResultUtils.success(clubNumberSer.exitApp(studentId,id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

}
