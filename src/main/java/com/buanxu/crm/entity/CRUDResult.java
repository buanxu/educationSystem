package com.buanxu.crm.entity;

public class CRUDResult {
    private int success=1;
    private String msg="";

    public CRUDResult() {
    }

    public CRUDResult(int success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CRUDResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
