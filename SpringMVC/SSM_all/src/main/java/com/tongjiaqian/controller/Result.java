package com.tongjiaqian.controller;

public class Result {
    //传输的数据封装成result
    //1、Object对象data 2、Integer状态码 3、msg返回的信息
    private Object data;
    private Integer code;
    private String msg;

    public Result() {
    }
    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }
    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
