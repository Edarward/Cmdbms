package com.cmdbms.enums;

/**
 * Description:错误类型enum，主要用来返回错误码
 * Date: 2019/1/28
 */
public enum ExceptionCodeEnums {

    NO_ACCESS(1,"没有权限"),

    DATA_NOT_FOUND(5, "不存在此数据"),

    ADMIN_NOT_FOUND(2, "管理员账号或密码错误"),

    NO_TOKEN(3, "没有token"),

    NO_SIGN(4, "没有登陆"),

    DATA_IS_EXIST(6, "数据已经存在"),

    NO_DATA(8,"缺少参数"),

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
