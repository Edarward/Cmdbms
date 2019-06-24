package com.cmdbms.controller;

import com.cmdbms.service.ClubManagerSer;
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
@RequestMapping("/clubManager")
@Api("社团建设管理模块")
public class ClubManagerCon {

    @Autowired
    private ClubManagerSer clubManagerSer;

    /**
     * 后台管理
     */
    @ApiOperation(value = "审核社团状态—显示")
    @GetMapping("/clubMaList")
    public ResultVO clubMaList (Integer clubStatus) {
        try {
            return ResultUtils.success(clubManagerSer.clubmanagerList(clubStatus));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "审核社团状态—审核")
    @PostMapping("/clubStatus")
    public ResultVO clubStatus (Integer id,Integer clubStatus) {
        try {
            return ResultUtils.success(clubManagerSer.clubStatus(id,clubStatus));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    /**
     * 信息门户
     */
    @ApiOperation(value = "社团创立申请")
    @PostMapping("/clubCreateApp")
    public ResultVO clubCreateApp (String name,Integer number,Integer studentId) {
        try {
            return ResultUtils.success(clubManagerSer.ClubCreateApp(name, number, studentId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "社团解散申请")
    @PostMapping("/clubDismissApp")
    public ResultVO clubDismissApp (Integer id,Integer studentId) {
        try {
            return ResultUtils.success(clubManagerSer.clubDismissApp(id, studentId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "社团展示")
    @GetMapping("/selClub")
    public ResultVO selClub () {
        try {
            return ResultUtils.success(clubManagerSer.clubmanagerList(3));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }
}
