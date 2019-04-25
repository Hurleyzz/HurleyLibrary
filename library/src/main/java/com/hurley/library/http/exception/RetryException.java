package com.hurley.library.http.exception;

/**
 * Created by hurley, Date on 2019-04-24.
 */
/**
 * 需要重试的异常
 */
public class RetryException extends Exception {

    private RetryReason mRetryReason = RetryReason.NOREASON;

    public RetryException(RetryReason retryReason) {
        mRetryReason = retryReason;
    }

    public RetryException(String detailMessage, RetryReason retryReason) {
        super(detailMessage);
        mRetryReason = retryReason;
    }
}
