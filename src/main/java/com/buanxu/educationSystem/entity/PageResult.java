package com.buanxu.educationSystem.entity;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    private int code;   //0 表示成功   1表示失败
    private String msg;   //错误信息
    private int count;    //总记录数  300000
    private List<T> data;  //课程订单信息

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
