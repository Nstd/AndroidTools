package com.nstd.android;

import android.app.Activity;
import android.app.Application;

import com.nstd.android.utils.DebugUtil;

/**
 * Created by Nstd on 2016/3/14.
 */
public class App extends Application {

    private static App instance;

    // 当前界面显示的Activity，供Console调用
    private Activity mAct = null;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        DebugUtil.init(this);
    }

    public static App getInstance() {
        return instance;
    }

    // 方便从Console中通过变量名获取mAct对象
    public Activity getmAct() {
        return  mAct;
    }

    // 从java代码中获取、设置mAct
    public Activity getCurrentActivity() {
        return mAct;
    }

    public void setCurrentActivity(Activity act) {
        this.mAct = act;
    }

}
