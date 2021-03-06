package com.hurley.library.http.intercept;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 *  * get请求默认增加cache
 * Created by hurley, Date on 2019-04-24.
 */
public class RewriteCacheHeaderInterceptor implements Interceptor {

    private int mAgeInSecond = 3;

    public RewriteCacheHeaderInterceptor(int ageInSecond) {
        mAgeInSecond = ageInSecond;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();
        if (!"get".equalsIgnoreCase(request.method())) {
            return chain.proceed(request);
        } else {
            Response netWorkResponse = chain.proceed(request);
            return netWorkResponse.newBuilder()
                    .header("Cache-Control", "max-age=" + mAgeInSecond)
                    .build();
        }
    }
}