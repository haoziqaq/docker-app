package com.wjsrz.doctorApp.utils;

public class Result {
    private int code;
    private Object data;
    private String message;

    public Result setMsg(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.data = data;
        this.message = resultCode.getMsg();
        return this;
    }

    public Result setMsg(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.data = "no data";
        this.message = resultCode.getMsg();
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
