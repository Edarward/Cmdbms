package com.cmdbms.controller;

import com.cmdbms.mapper.SpoilageMapper;
import com.cmdbms.model.Spoilage;
import com.cmdbms.service.EnergySer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/energy")
public class EnergyCon {
    @Autowired
    SpoilageMapper spoilageMapper;
    @Autowired
    EnergySer energySer;
    @PostMapping("/insertOne")
    public ResultVO insertOne (Spoilage spoilage){
        try {
            return ResultUtils.success(energySer.insertOne(spoilage));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }
}
