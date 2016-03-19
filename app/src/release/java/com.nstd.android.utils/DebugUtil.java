package com.nstd.android.utils;

import android.app.Activity;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.facebook.stetho.Stetho;

import java.lang.reflect.Field;

/**
 * Created by Nstd on 2016/3/14.
 */
public class DebugUtil {

    public static void init(Context context) {
        // release version: empty code
    }

    public static Object getActField(Activity activity, String fieldName) {
        //release version: return null
        return null;
    }
}