package com.cmdbms.controller;


import com.cmdbms.mapper.ArgcoureMapper;
import com.cmdbms.model.Argcoure;
import com.cmdbms.service.ArrangeCourseSer;
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
    ArrangeCourseSer arrangeCourseSer;


    @PostMapping("/addCourse")
    public ResultVO addCourse (Argcoure argcoure) {
        try {
            return ResultUtils.success(arrangeCourseSer.insertOne(argcoure));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }
}
