package com.hurley.library;

import android.annotation.SuppressLint;
import android.app.Application;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public class AppConstant {

    @SuppressLint("StaticFieldLeak")
    private static Application sApp;

    public static Application getApp() {
        return sApp;
    }

    public static void init(Application application) {
        sApp = application;
    }
}

