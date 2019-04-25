package com.hurley.library.http.exception;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public enum RetryReason {
    NOREASON,
    QINIUTOKEN,
    TIMEOUT,
    SERVERERROR,
    LOGOUT
}
