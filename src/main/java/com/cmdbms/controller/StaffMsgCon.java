package com.cmdbms.controller;

import com.cmdbms.model.Financialsubsidies;
import com.cmdbms.model.Staffmsg;
import com.cmdbms.service.StaffMsgSer;
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
@RequestMapping("/staffMsg")
@Api("员工管理")
public class StaffMsgCon {

    @Autowired
    private StaffMsgSer staffMsgSer;

    @ApiOperation(value = "添加员工")
    @PostMapping("/addStaffMsg")
    public ResultVO addStaffMsg (Staffmsg record) {
        try {
            return ResultUtils.success(staffMsgSer.insertOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"添加失败！");
        }
    }

    @ApiOperation(value = "修改员工信息")
    @PostMapping("/updateStaffMsg")
    public ResultVO updateStaffMsg (Staffmsg record) {
        try {
            return ResultUtils.success(staffMsgSer.updateOne(record));
        } catch (Exception e) {
            return ResultUtils.error(-1,"修改失败！");
        }
    }

    @ApiOperation(value = "查询员工信息")
    @GetMapping("/selectStaffMsg")
    public ResultVO selectStaffMsg () {
        try {
            return ResultUtils.success(staffMsgSer.selectOne());
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "员工查询员工信息")
    @PostMapping("/selectStaffMsgSelf")
    public ResultVO selectStaffMsgSelf (int id) {
        try {
            return ResultUtils.success(staffMsgSer.selectInfoSelf(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"查询失败！");
        }
    }

    @ApiOperation(value = "员工删除员工信息")
    @PostMapping("/delStaffMsgSelf")
    public ResultVO delStaffMsgSelf (int id) {
        try {
            return ResultUtils.success(staffMsgSer.deleteOne(id));
        } catch (Exception e) {
            return ResultUtils.error(-1,"删除失败！");
        }
    }
}
