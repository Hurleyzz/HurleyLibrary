package com.hurley.library.http.callback;

import android.support.annotation.Nullable;

import java.io.File;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public abstract class DownloadCallback extends ResponseCallbackImpl<File> {
    @Override
    public abstract void onSuccess(File baseData);

    @Override
    public abstract boolean onFail(int statusCode, @Nullable File failDate, @Nullable Throwable error);
}
