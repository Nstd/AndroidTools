package com.nstd.android.utils;

import java.lang.reflect.Field;

/**
 * Created by Nstd on 2016/3/19 0019.
 */
public class ReflectUtil {

    public static Object getObjField(Object obj, String fieldName) {
        try {
            Field f = obj.getClass().getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(obj);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
