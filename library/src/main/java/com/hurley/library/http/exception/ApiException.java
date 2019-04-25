package com.hurley.library.http.exception;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public class ApiException extends Throwable {

    protected int mCode;

    public ApiException(int code, String message) {
        super(message);
        mCode = code;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "Code=" + mCode +
                "} " + super.toString();
    }
}
