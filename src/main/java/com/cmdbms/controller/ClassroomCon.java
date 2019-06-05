package com.cmdbms.controller;

import com.cmdbms.model.Examclassroom;
import com.cmdbms.model.Examclassroomuse;
import com.cmdbms.service.ClassroomSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomCon {
    @Autowired
    private ClassroomSer classroomSer;

    @PostMapping("/insertClassroom")
    public ResultVO insertClassroom(Examclassroom examclassroom){
        try {
            return ResultUtils.success(classroomSer.insertClassroom(examclassroom));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/updateClassroom")
    public ResultVO updateClassroom(Examclassroom examclassroom){
        try {
            return ResultUtils.success(classroomSer.updateClassroom(examclassroom));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectClassroom")
    public ResultVO selectClassroom(Integer clrType){
        try {
            return ResultUtils.success(classroomSer.selectClassroom(clrType));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/insertClruse")
    public ResultVO insertClruse(Integer id,Integer useClrId,Integer useClrTime, String useClrDate,Integer useThrough, String useClrName){
        try {
            return ResultUtils.success(classroomSer.insertClruse(id,useClrId,useClrTime,useClrDate,useThrough,useClrName));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @PostMapping("/updateClruse")
    public ResultVO updateClruse(Integer id,Integer useThrough){
        try {
            return ResultUtils.success(classroomSer.updateClruse(id,useThrough));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectClruse")
    public ResultVO selectClruse(Integer useThrough){
        try {
            return ResultUtils.success(classroomSer.selectClruse(useThrough));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @GetMapping("/selectClrusetwo")
    public ResultVO selectClrusetwo(String useClrDate){
        try {
            return ResultUtils.success(classroomSer.selectClrusetwo(useClrDate));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }
}
