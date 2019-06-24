package com.cmdbms.exception;

import com.cmdbms.enums.ExceptionCodeEnums;
import lombok.Data;

@Data
public class CoException extends RuntimeException {

    private Integer code;

    private String msg;

    public CoException(ExceptionCodeEnums exceptionCodeEnums) {
        super(exceptionCodeEnums.getMsg());
        this.code = exceptionCodeEnums.getCode();
        this.msg = exceptionCodeEnums.getMsg();
    }

    public CoException(ExceptionCodeEnums exceptionCodeEnums, String msg) {
        super(msg);
        this.code = exceptionCodeEnums.getCode();
    }

}
