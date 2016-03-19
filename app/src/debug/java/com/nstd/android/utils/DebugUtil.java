package com.nstd.android.utils;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.facebook.stetho.Stetho;

/**
 * Created by Nstd on 2016/3/14.
 */
public class DebugUtil {

    public static void init(final Context context) {
        // 如果因为加了stetho导致DexIndexOverflowException，需要添加以下配置
        MultiDex.install(context);

        // 以下是Stetho配置
        Stetho.initialize(
                Stetho.newInitializerBuilder(context)
                        .enableDumpapp(
                                Stetho.defaultDumperPluginsProvider(context))
                        .enableWebKitInspector(
                                Stetho.defaultInspectorModulesProvider(context))
                        .build());
    }

    // 通过反射获取activity中的私有变量
    public static Object getActField(Object obj, String fieldName) {
        return ReflectUtil.getObjField(obj, fieldName);
    }
}