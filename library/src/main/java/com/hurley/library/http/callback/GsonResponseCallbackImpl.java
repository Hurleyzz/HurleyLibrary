package com.hurley.library.http.callback;

import android.support.annotation.Nullable;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.hurley.library.Constants;

import java.io.IOException;

import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by hurley, Date on 2019-04-24.
 */
@SuppressWarnings("unchecked")
public class GsonResponseCallbackImpl<T> extends ResponseCallbackImpl<T> {

    protected ResponseCallback<T> mResponseCallback;

    public GsonResponseCallbackImpl(ResponseCallback responseCallback) {
        super(responseCallback.isSync());
        mResponseCallback = responseCallback;
    }

    /**
     * 解析返回数据
     *
     * @param response 返回数据
     * @return
     */
    @Override
    public T parseResponse(Response response) throws IOException {
        ResponseBody responseBody = response.body();
        T t = null;
        try {
            t = mResponseCallback.parseResponse(response);
            if (t == null) {
                t = mResponseCallback.getGson().fromJson(responseBody.charStream(), mResponseCallback.getClazz());
            }
            responseBody.close();
        } catch (JsonIOException | JsonSyntaxException e) {
            if (Constants.DEBUG) {//debug模式下提示json格式错误
                throw e;
            }
            e.printStackTrace();
            responseBody.close();
        }
        return t;
    }

    @Override
    public void onProgress(long bytesWritten, long totalSize, boolean download) {
        if (mResponseCallback != null) {
            mResponseCallback.onProgress(bytesWritten, totalSize, download);
        }
    }

    @Override
    public void onSuccess(T baseData) {
        if (mResponseCallback != null) {
            mResponseCallback.onSuccess(baseData);
        }
    }

    /**
     * 请求失败
     *
     * @param statusCode 0为基类已提示，具体逻辑中不用再提示。
     * @param failDate
     * @param error      具体的错误
     */
    @Override
    public boolean onFail(int statusCode, @Nullable T failDate, @Nullable Throwable error) {
        return mResponseCallback != null && mResponseCallback.onFail(statusCode, failDate, error);
    }

    @Override
    public void onFinish() {
        if (mResponseCallback != null) {
            mResponseCallback.onFinish();
        }
    }

}
