package com.hurley.library.http.intercept;

import android.util.Log;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public class HttpLogInterceptorCreator {

    public static HttpLoggingInterceptor create() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.v("OkHttp", message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

}

