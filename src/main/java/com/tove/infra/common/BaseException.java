package com.tove.infra.common;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private String code;
    private String msg;

    public BaseException(BaseError e){
        this.code = e.getCode();
        this.msg = e.getMsg();
    }
}
