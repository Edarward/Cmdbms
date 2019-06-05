package com.cmdbms.controller;

import com.cmdbms.mapper.WaterMapper;
import com.cmdbms.model.Electric;
import com.cmdbms.model.Water;
import com.cmdbms.service.EnergySer;
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
@RequestMapping("/energy")
@Api("用电模块")
public class EnergyCon {
    @Autowired
    private WaterMapper waterMapper;
    @Autowired
    private EnergySer energySer;

    @ApiOperation(value = "添加用水")
    @PostMapping("/insertWater")
    public ResultVO insertOne (Water water){
        try {
            return ResultUtils.success(energySer.insertOne(water));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除用水信息")
    @PostMapping("/delWater")
    public ResultVO delWater (Integer id){
        try {
            return ResultUtils.success(energySer.delwater(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "此接口无用，当时写多了")
    @PostMapping("/updateWater")
    public ResultVO updateWater (Water water){
        try {
            return ResultUtils.success(energySer.updatewater(water));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询用水信息")
    @GetMapping("/selectWater")
    public ResultVO selectWater (String watPlace,Integer watMonth,Integer watYear,String watPlaceType){
        try {
            return ResultUtils.success(energySer.selectwater(watPlace,watMonth,watYear,watPlaceType));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "添加用电信息")
    @PostMapping("/insertElectricity")
    public ResultVO insertElectricity (Electric electric){
        try {
            return ResultUtils.success(energySer.insertElectricity(electric));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除用电信息")
    @PostMapping("/delElectricity")
    public ResultVO delElectricity (Integer id){
        try {
            return ResultUtils.success(energySer.delelectricity(id));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询用电信息")
    @GetMapping("/selectElectricity")
    public ResultVO selectElectricity (Integer elePlace,Integer eleMonth,Integer eleYear,String elePlaceType){
        try {
            return ResultUtils.success(energySer.selectElectricity(elePlace,eleMonth,eleYear,elePlaceType));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

}
