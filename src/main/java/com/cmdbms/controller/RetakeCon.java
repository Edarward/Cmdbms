package com.cmdbms.controller;


import com.cmdbms.model.Examretake;
import com.cmdbms.service.RetakeSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retake")
public class RetakeCon {
    @Autowired
    private RetakeSer retakeSer;

    @PostMapping("/insertRetake")
    public ResultVO insertRetake(Examretake examretake){
        try {
            return ResultUtils.success(retakeSer.insertRetake(examretake));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/updateRetake")
    public ResultVO updateRetake(Examretake examretake){
        try {
            return ResultUtils.success(retakeSer.updateRetake(examretake));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }

    @GetMapping("/selectRetake")
    public ResultVO selectRetake(Integer exuseThrough){
        try {
            return ResultUtils.success(retakeSer.selectRetake(exuseThrough));
        }catch (Exception e){
            return ResultUtils.error(-1,"/失败");
        }
    }
}
