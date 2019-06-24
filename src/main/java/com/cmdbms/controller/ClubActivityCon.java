package com.cmdbms.controller;

import com.cmdbms.exception.CoException;
import com.cmdbms.model.Clubactivity;
import com.cmdbms.service.ClubActivitySer;
import com.cmdbms.util.DateFormatUtil;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/clubActivity")
@Api("社团活动管理模块")
public class ClubActivityCon {

    @Autowired
    private ClubActivitySer clubActivitySer;

    @ApiOperation(value = "审核社团活动—按照审核类型显示")
    @GetMapping("/selClubNumber")
    public ResultVO selActivity (Integer status) {
        try {
            return ResultUtils.success(clubActivitySer.selActivity(status));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "审核社团活动—审核")
    @PostMapping("/clubActAuditing")
    public ResultVO clubActAuditing (Integer reviewStatus,Integer id) {
        try {
            return ResultUtils.success(clubActivitySer.clubActAuditing(reviewStatus,id));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "发布活动内容—发布")
    @PostMapping("/clubActPublish")
    public ResultVO clubActPublish (Integer clubId, String actDescription, String actLocation, String actStartTime, String actStopTime)  {
        try {
            Clubactivity clubactivity = new Clubactivity();
            clubactivity.setClubId(clubId);
            clubactivity.setActDescription(actDescription);
            clubactivity.setActLocation(actLocation);
            clubactivity.setActStartTime(DateFormatUtil.StringFormat(actStartTime));
            clubactivity.setActStopTime(DateFormatUtil.StringFormat(actStopTime));
            clubactivity.setActStatus(true);
            clubactivity.setReviewStatus(true);
            return ResultUtils.success(clubActivitySer.addClubActPublish(clubactivity));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "发布活动内容—显示")
    @GetMapping("/clubActList")
    public ResultVO clubActPublish () {
        try {
            return ResultUtils.success(clubActivitySer.clubActPublish());
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "留言管理—下架留言")
    @PostMapping("/clubMessageDown")
    public ResultVO clubMessageDown (Integer id)  {
        try {
            return ResultUtils.success(clubActivitySer.clubMessageDown(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "留言管理—查询留言")
    @GetMapping("/selClubMessage")
    public ResultVO selClubMessage (Integer clubActivityId)  {
        try {
            return ResultUtils.success(clubActivitySer.selClubMessage(clubActivityId));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    /**
     * 信息门户
     */
    @ApiOperation(value = "社团活动申请")
    @PostMapping("/clubActivityApp")
    public ResultVO clubActivityApp (Integer studentId,Integer clubId, String actDescription, String actLocation, String actStartTime, String actStopTime)  {
        try {
            Clubactivity clubactivity = new Clubactivity();
            clubactivity.setClubId(clubId);
            clubactivity.setActDescription(actDescription);
            clubactivity.setActLocation(actLocation);
            clubactivity.setActStartTime(DateFormatUtil.StringFormat(actStartTime));
            clubactivity.setActStopTime(DateFormatUtil.StringFormat(actStopTime));
            clubactivity.setActStatus(true);
            clubactivity.setReviewStatus(false);
            return ResultUtils.success(clubActivitySer.clubActivityApp(clubactivity,studentId));
        }catch (CoException e){
            return ResultUtils.error(e.getCode(),e.getMsg());
        } catch (ParseException e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "活动查询")
    @GetMapping("selActivity")
    public ResultVO selActivity () {
        try {
            return ResultUtils.success(clubActivitySer.selActivity());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "写留言")
    @PostMapping("addContent")
    public ResultVO addContent (Integer id,String content) {
        try {
            return ResultUtils.success(clubActivitySer.addConOne(id,content));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "显示参加的活动")
    @GetMapping("selMyActivity")
    public ResultVO selMyActivity (Integer studentId) {
        try {
            return ResultUtils.success(clubActivitySer.selMyActivity(studentId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "活动报名")
    @PostMapping("activityApp")
    public ResultVO activityApp (Integer studentId,Integer actId) {
        try {
            return ResultUtils.success(clubActivitySer.activityApp(studentId, actId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }
}
