package com.wjsrz.doctorApp.utils;

public enum ResultCode {
    SUCCESS(200, "操作成功"),
    PASSWORD_IS_NOT_EQUAL(1001, "密码和确认密码不相等"),
    PASSWORD_IS_NOT_EXIST(1002, "确认密码不存在");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
