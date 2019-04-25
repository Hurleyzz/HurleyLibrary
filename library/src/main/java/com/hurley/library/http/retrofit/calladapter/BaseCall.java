package com.hurley.library.http.retrofit.calladapter;

import android.arch.lifecycle.Lifecycle;
import android.support.annotation.Nullable;

import com.hurley.library.http.callback.ICallback;

import java.io.IOException;

import retrofit2.Response;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public interface BaseCall<T> {
    void cancel();

    @Deprecated
    void enqueue(@Nullable ICallback<T> callback);

    void enqueue(@Nullable ICallback<T> callback, Lifecycle lifecycle);

    Response<T> execute() throws IOException;

    BaseCall<T> clone();
}
