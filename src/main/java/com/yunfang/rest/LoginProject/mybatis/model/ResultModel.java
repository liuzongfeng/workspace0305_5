package com.yunfang.rest.LoginProject.mybatis.model;


import com.yunfang.rest.LoginProject.mybatis.model.eBillModel.Cityrange;

import java.util.List;

public class ResultModel {
    private int code;
    private String msg;
    private int count;
    private List<Cityrange> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Cityrange> getData() {
        return data;
    }

    public void setData(List<Cityrange> data) {
        this.data = data;
    }
}
