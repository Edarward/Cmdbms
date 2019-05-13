package com.cmdbms.controller;

import com.cmdbms.mapper.WaterMapper;
import com.cmdbms.model.Electric;
import com.cmdbms.model.Water;
import com.cmdbms.service.EnergySer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/energy")
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

    @PostMapping("/delWater")
    public ResultVO delwater (Integer id){
        try {
            return ResultUtils.success(energySer.delwater(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }
    @PostMapping("/updateWater")
    public ResultVO updatewater (Water water){
        try {
            return ResultUtils.success(energySer.updatewater(water));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }
    @GetMapping("/selectWater")
    public ResultVO selectwater (String watPlace,Integer watMonth,Integer watYear,String watPlaceType){
        try {
            return ResultUtils.success(energySer.selectwater(watPlace,watMonth,watYear,watPlaceType));
        } catch (Exception e) {
            return ResultUtils.error(-1,"失败");
        }
    }
    @PostMapping("/insertElectricity")
    public ResultVO insertelectricity (Electric electric){
        try {
            return ResultUtils.success(energySer.insertElectricity(electric));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }
}
