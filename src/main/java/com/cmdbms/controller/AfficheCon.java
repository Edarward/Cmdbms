package com.cmdbms.controller;

import com.cmdbms.mapper.AffichepictureMapper;
import com.cmdbms.model.Affichenotice;
import com.cmdbms.model.Affichepicture;
import com.cmdbms.service.AfficheSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.util.UpLoadPicture;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/affiche")
@Api("公告管理模块")
public class AfficheCon {
    @Autowired
    private AfficheSer afficheSer;
    @Autowired
    private UpLoadPicture upLoadPicture;
    @Autowired
    private AffichepictureMapper affichepictureMapper;

    @ApiOperation(value = "查询公告信息")
    @GetMapping("/selectNotice")
    public ResultVO selectNotice(Integer notStatetype){
        try {
            return ResultUtils.success(afficheSer.selectNotice(notStatetype));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询公告信息（根据公告state）")
    @GetMapping("/selectNoticetwo")
    public ResultVO selectNoticetwo(String  notWriter){
        try {
            return ResultUtils.success(afficheSer.selectNoticetwo(notWriter));
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "添加公告信息")
    @PostMapping("/insertNotice")
    public ResultVO insertNotice(Affichenotice affichenotice){
        try {
            return ResultUtils.success(afficheSer.insertNotice(affichenotice));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "更新公告信息")
    @PostMapping("/updeteNotice")
    public ResultVO updeteNotice(Integer notId, String notType, String notContent, String notWriter, String notReleaser, Integer notState, Integer notStatetype){
        try {
            return ResultUtils.success(afficheSer.updateNotice(notId,notType,notContent,notWriter,notReleaser,notState,notStatetype));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除公告信息")
    @PostMapping("/deleteNotice")
    public ResultVO deleteNotice(Integer notId){
        try {
            return ResultUtils.success(afficheSer.deleteNotice(notId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "添加评论信息")
    @PostMapping("/insertCom")
    public ResultVO insertCom(Integer userComId,Integer notId,Integer userId,String userComCon){
        try {
            return ResultUtils.success(afficheSer.insertCom(userComId,notId,userId,userComCon));
        }catch (Exception e){
            System.out.println(e);
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "删除评论信息")
    @PostMapping("/deleteCom")
    public ResultVO deleteCom(Integer userComId){
        try {
            return ResultUtils.success(afficheSer.deleteCom(userComId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "查询评论信息")
    @GetMapping("/selectCom")
    public ResultVO selectCom(Integer notId){
        try {
            return ResultUtils.success(afficheSer.selectCom(notId));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }

    @ApiOperation(value = "添加图片")
    @PostMapping("/addPicture")
    public ResultVO addPicture (@RequestParam("picture") MultipartFile file) {
        String img_url = upLoadPicture.upload(file);
        return ResultUtils.success(img_url);
    }

    @ApiOperation(value = "添加轮播图")
    @PostMapping("/addBanner")
    public ResultVO addBanner (String picAddress){
        Affichepicture affichepicture = new Affichepicture();
        affichepicture.setPicAddress(picAddress);
        affichepicture.setPicReleaser("管理员");
        return ResultUtils.success(affichepictureMapper.insert(affichepicture));
    }
}
