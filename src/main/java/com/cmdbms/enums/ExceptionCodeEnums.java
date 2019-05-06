package com.cmdbms.enums;

/**
 * Description:错误类型enum，主要用来返回错误码
 * Date: 2019/1/28
 */
public enum ExceptionCodeEnums {

    DATA_NOT_FOUND(1, "不存在此数据"),

    ADMIN_NOT_FOUND(2, "管理员账号或密码错误"),

    NO_TOKEN(3, "没有token"),

    NO_SIGN(4, "没有登陆"),

    WX_ERROR(5, "微信错误"),

    DATA_IS_EXIST(6, "数据已经存在"),

    WX_OK(7, "微信成功"),

    NO_DATA(8,"缺少参数"),

    ERROR_STATE(9,"订单不符合状态"),

    ERROR_MONEY(10,"支付金额与原订单金额不一致"),

    FAIL_OPERATION(11,"操作失败")


    ;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Integer code;

    private String msg;

    ExceptionCodeEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
