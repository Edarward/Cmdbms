package com.cmdbms.controller;

import com.cmdbms.model.*;
import com.cmdbms.service.EnergySer;
import com.cmdbms.service.EquipmentSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/equipment")

public class EquipmentCon {
    @Autowired
    private EquipmentSer equipmentSer;

    @GetMapping("/selectSpo")
    public ResultVO selectSpo (){
        try {
            return ResultUtils.success(equipmentSer.selectSpo());
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertSpo")
    public ResultVO insertSpo(Spoilage spoilage){
        try {
            return ResultUtils.success(equipmentSer.insertSpo(spoilage));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/updateSpo")
    public ResultVO updateSpo(Spoilage spoilage){
        try {
            return ResultUtils.success(equipmentSer.updateSpo(spoilage));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectOut")
    public ResultVO selectOut(){
        try {
            return ResultUtils.success(equipmentSer.selectOut());
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertOut")
    public ResultVO insertOut(Output output){
        try {
            return ResultUtils.success(equipmentSer.insertOut(output));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectStock")
    public ResultVO selectStock(String stockEquipment){
        try {
            return ResultUtils.success(equipmentSer.selectStock(stockEquipment));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertStock")
    public ResultVO insertStock(Stock stock){
        try {
            return ResultUtils.success(equipmentSer.insertStock(stock));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/updateStock")
    public ResultVO updateStock(Stock stock){
        try {
            return ResultUtils.success(equipmentSer.updateStock(stock));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/deleteStock")
    public ResultVO deleteStock(Integer stockId){
        try {
            return ResultUtils.success(equipmentSer.deleteStock(stockId));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectPur")
    public ResultVO selectPur(Boolean purAuditing){
        try {
            return ResultUtils.success(equipmentSer.selectPur(purAuditing));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertPur")
    public ResultVO insertPur(Integer purId,String purEquipment,String purProName,String purTime,Integer purAmount,
                              BigDecimal purPrice,String purMan,Boolean purAuditing){
        try {
            return ResultUtils.success(equipmentSer.insertPur(purId,purEquipment,purProName,purTime,purAmount,purPrice,purMan,purAuditing));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectChe")
    public ResultVO selectChe(){
        try {
            return ResultUtils.success(equipmentSer.selectChe());
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertChe")
    public ResultVO insertChe(Check check){
        try {
            return ResultUtils.success(equipmentSer.insertChe(check));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }
}
