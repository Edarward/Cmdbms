package com.cmdbms.enums;

public enum  OrderStateEnum {

    NO_PAY(0, "未付款"),

    PAID(1, "服务中"),

    COMPLETED(2, "已完成"),

    REFUNDED(3, "已退款"),

    CANCEL(4, "已取消"),

    REFUNDING(5, "退款中")


    ;


    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    OrderStateEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
