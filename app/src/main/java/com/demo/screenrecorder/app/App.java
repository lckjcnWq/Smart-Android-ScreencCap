package com.demo.screenrecorder.app;

import android.app.Application;
import android.content.Context;

/**
 * @author: wuquan
 * @time: 2022/12/6
 * @describe: com.demo.screenrecorder.app
 */
public class App extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
    public static Context getContext(){
        return context;
    }
}
