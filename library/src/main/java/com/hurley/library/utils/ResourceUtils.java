package com.hurley.library.utils;

import android.content.Context;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public class ResourceUtils {
    public static final String RES_TYPE_DRAWABLE = "drawable";

    public static String getResourceName(Context context, int resId) {
        return context.getResources().getResourceName(resId);
    }

    public static int getDrawableResId(Context context, String name) {
        return getResourceId(context, name, RES_TYPE_DRAWABLE);
    }

    public static int getResourceId(Context context, String name, String type) {
        return context.getResources().getIdentifier(name, type, context.getPackageName());
    }
}