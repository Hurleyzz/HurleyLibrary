package com.hurley.library.http.model;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public interface IResponse extends BaseObject {

    /**
     * 业务逻辑上是否成功
     * @return true代表成功
     */
    boolean isSucceeded();

    /**
     * 获取业务逻辑出错代码
     * @return
     */
    int getErrorCode();

    /**
     * 获取出错信息
     * @return
     */
    String getErrorMessage();
}
