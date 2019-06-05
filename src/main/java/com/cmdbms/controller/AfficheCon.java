package com.cmdbms.controller;

import com.cmdbms.model.Affichenotice;
import com.cmdbms.service.AfficheSer;
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
@RequestMapping("/affiche")
@Api("公告管理模块")
public class AfficheCon {
    @Autowired
    private AfficheSer afficheSer;

    @ApiOperation(value = "查询公告信息")
    @GetMapping("/selectNotice")
    public ResultVO selectNotice(Integer notStatetype){
        try {
            return ResultUtils.success(afficheSer.selectNotice(notStatetype));
        }catch (Exception e){
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
    public ResultVO updeteNotice(Integer notId, String notType, String notWriter, String notReleaser, Integer notState, Integer notStatetype){
        try {
            return ResultUtils.success(afficheSer.updateNotice(notId,notType,notWriter,notReleaser,notState,notStatetype));
        }catch (Exception e){
            return ResultUtils.error(-1,"失败");
        }
    }
}
