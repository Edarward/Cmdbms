package com.cmdbms.controller;


import com.cmdbms.mapper.ChoosecourseMapper;
import com.cmdbms.model.Choocheck;
import com.cmdbms.model.Choosecourse;
import com.cmdbms.model.Quitcheck;
import com.cmdbms.model.Quitcoure;
import com.cmdbms.service.ChooCheckSer;
import com.cmdbms.service.ChooseCourseSer;
import com.cmdbms.service.QuitChooseSer;
import com.cmdbms.util.ResultUtils;
import com.cmdbms.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stuChoose")
public class StuChooseCon {

    @Autowired
    private ChooseCourseSer chooseCourseSer;



    @Autowired
    private QuitChooseSer quitChooseSer;


    /*******************************************************选课*****************************************************/


    /*测试通过*/
    @ApiOperation(value = "（查看）学生选课信息，返回的是指定学生选的课以及学生未选的课")
    @PostMapping("/stuChooseInfo")
    public ResultVO stuChooseInfo (int stuId) {
        try {
            return ResultUtils.success(chooseCourseSer.selectChooseInfo(stuId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    /*测试通过*/
    @ApiOperation(value = "（申请）学生选课申请")
    @PostMapping("/stuChooseApply")
    public ResultVO stuChooseApply (Choosecourse choosecourse) {
        try {
            return ResultUtils.success(chooseCourseSer.stuChooseApply(choosecourse));
        } catch (Exception e) {
            return ResultUtils.error(-1,"选课失败！");
        }
    }

    /*测试通过*/
    @ApiOperation(value = "（取消）学生选课取消")
    @PostMapping("/cancelChoose")
    public ResultVO cancelChoose (int id) {
        try {
            return ResultUtils.success(chooseCourseSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"取消失败！");
        }
    }


    /*测试通过*/
    @ApiOperation(value = "（查看）管理员查看选课信息，通过信息进行审核")
    @GetMapping("/selectChooseInfo")
    public ResultVO selectChooseInfo () {
        try {
            return ResultUtils.success(chooseCourseSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }


    /*测试成功*/
    @ApiOperation(value = "（审核）管理员审核选课信息")
    @PostMapping("/checkChooseInfo")
    public ResultVO checkChooseInfo (Choocheck choocheck) {
        try {
            return ResultUtils.success(chooseCourseSer.checkChooseInfo(choocheck));
        } catch (Exception e) {
            return ResultUtils.error(-1,"审核失败！");
        }
    }


    @ApiOperation(value = "（审核）管理员查看审核信息")
    @GetMapping("/selectCheckChooseInfo")
    public ResultVO selectCheckChooseInfo () {
        try {
            return ResultUtils.success(chooseCourseSer.selectCheckChooseInfo());
        } catch (Exception e) {
            return ResultUtils.error(-1,"审核失败！");
        }
    }



/****************************************退课阶段*****************************************************************/
/*测试通过*/

    @ApiOperation(value = "（学生查看）学生已审核的信息，通过信息进行退课")
    @PostMapping("/selectQuitInfo")
    public ResultVO selectQuitInfo (int stuId) {
        try {
            return ResultUtils.success(quitChooseSer.selectChoCheckInfo(stuId));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "（申请）学生退课申请")
    @PostMapping("/quitChooseApply")
    public ResultVO quitChooseApply (Quitcoure quitcoure) {
        try {
            return ResultUtils.success(quitChooseSer.insertOne(quitcoure));
        } catch (Exception e) {
            return ResultUtils.error(-1,"选课失败！");
        }
    }

    @ApiOperation(value = "（学生取消）学生退课取消")
    @PostMapping("/cancelQuit")
    public ResultVO cancelQuit (int id) {
        try {
            return ResultUtils.success(quitChooseSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"取消失败！");
        }
    }


    @ApiOperation(value = "（管理员查看）管理员查看退课信息，通过信息进行审核")
    @GetMapping("/selectQuitCheck")
    public ResultVO selectQuitCheck () {
        try {
            return ResultUtils.success(quitChooseSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "（审核）管理员审核退课信息")
    @PostMapping("/checkQuitInfo")
    public ResultVO checkQuitInfo (Quitcheck quitcheck) {
        try {
            return ResultUtils.success(quitChooseSer.checkQuitInfo(quitcheck));
        } catch (Exception e) {
            return ResultUtils.error(-1,"审核失败！");
        }
    }

    @ApiOperation(value = "（审核）管理员查看审核信息")
    @GetMapping("/selectCheckQuitInfo")
    public ResultVO selectCheckQuitInfo () {
        try {
            return ResultUtils.success(chooseCourseSer.selectCheckQuitInfo());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

}
