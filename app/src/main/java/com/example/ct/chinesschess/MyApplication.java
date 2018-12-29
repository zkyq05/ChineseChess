package com.example.ct.chinesschess;

import android.app.Application;

import org.xutils.x;

/**
 * 类描述：
 * 创建： han
 * 时间：2018/12/29 0029
 * 修改备注：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
