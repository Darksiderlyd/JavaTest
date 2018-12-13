package com.xiaoyu;

public abstract class ApiCallback<T> {

    public void onSuccess(T t){

    }

    public void onSuccess(T t,String extra){
        this.onSuccess(t);
    }

    public void onErr(String msg, int code) {

    }
}