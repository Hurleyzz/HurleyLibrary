package com.hurley.library.http.exception;

/**
 * Created by hurley, Date on 2019-04-24.
 */
public class FileDownloadExecption extends RuntimeException {

    public FileDownloadExecption(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
