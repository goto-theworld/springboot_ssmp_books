package com.itheima.controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
   public R(Boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    /* *
     * 获取
     * @return flag

    public Boolean getFlag() {
        return flag;
    }

    *
     * 设置
     * @param flag

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    *
     * 获取
     * @return data

    public Object getData() {
        return data;
    }

    *
     * 设置
     * @param data

    public void setData(Object data) {
        this.data = data;
    }

    *
     * 获取
     * @return msg

    public String getMsg() {
        return msg;
    }

    *
     * 设置
     * @param msg

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "R{flag = " + flag + ", data = " + data + ", msg = " + msg + "}";
    }*/
}
