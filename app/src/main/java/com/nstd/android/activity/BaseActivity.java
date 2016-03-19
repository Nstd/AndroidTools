package com.nstd.android.activity;

import android.app.Activity;

import com.nstd.android.App;
import com.nstd.android.utils.DebugUtil;

/**
 * Created by Nstd on 2016/3/14.
 */
public class BaseActivity extends Activity {

    // 可以在Console中通过context.mAct.getField()的方式获取私有变量的值
    // 把获取的逻辑封装到DebugUtils中，以解除不必要的麻烦
    public Object getField(String name) {
        return DebugUtil.getActField(this, name);
    }

    // 取消引用
    private void clearReferences() {
        App app = ((App)getApplicationContext());
        Activity currActivity = app.getCurrentActivity();
        if(this.equals(currActivity)) {
            app.setCurrentActivity(null);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((App)getApplicationContext()).setCurrentActivity(this);
    }

    @Override
    protected void onPause() {
        clearReferences();
        super.onPause();
    }


    @Override
    protected void onDestroy() {
        clearReferences();
        super.onDestroy();
    }
}
