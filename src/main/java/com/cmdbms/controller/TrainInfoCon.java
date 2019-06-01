package com.cmdbms.controller;

import com.cmdbms.mapper.TraininginfoMapper;
import com.cmdbms.model.Teaarrange;
import com.cmdbms.model.Traininginfo;
import com.cmdbms.service.TraininginfoSer;
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
@RequestMapping("/trainInfo")
@Api("考评管理模块")
public class TrainInfoCon {

    @Autowired
    TraininginfoSer traininginfoSer;

    @ApiOperation(value = "查询培训")
    @GetMapping("/selectTrainInfo")
    public ResultVO selectTrainInfo () {
        try {
            return ResultUtils.success(traininginfoSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询培训失败！");
        }
    }

    @ApiOperation(value = "查询完成的培训")
    @GetMapping("/selectTrainInfoEnd")
    public ResultVO selectTrainInfoEnd () {
        try {
            return ResultUtils.success(traininginfoSer.selectOneEnd());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询培训失败！");
        }
    }

    @ApiOperation(value = "增加培训")
    @PostMapping("/addTrainInfo")
    public ResultVO addTrainInfo (Traininginfo traininginfo) {
        try {
            return ResultUtils.success(traininginfoSer.insertOne(traininginfo));
        } catch (Exception e) {
            return ResultUtils.error(-1,"增加失败！");
        }
    }

    @ApiOperation(value = "修改培训")
    @PostMapping("/updateTrainInfo")
    public ResultVO updateTrainInfo (Traininginfo traininginfo) {
        try {
            return ResultUtils.success(traininginfoSer.updateOne(traininginfo));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改失败！");
        }
    }

    @ApiOperation(value = "删除培训")
    @PostMapping("/deleteTrainInfo")
    public ResultVO deleteTrainInfo (int staffId) {
        try {
            return ResultUtils.success(traininginfoSer.deleteOne(staffId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改失败！");
        }
    }


}
