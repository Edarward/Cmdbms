package com.cmdbms.controller;


import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arrangeCourse")
public class ArrangeCourseCon {

    @Autowired
    ArgcoureMapper argcoureMapper;


    @PostMapping("/addCourse")
    public ResultVO addCourse (Argcoure argcoure) {
        try {
            return ResultUtils.success(argcoureMapper.insert(argcoure));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }
}
