package com.hurley.library.http.exception;


import com.hurley.library.http.callback.ResponseCallback;

import okhttp3.Request;
import okhttp3.Response;

/**
 *  * Http访问请求异常，发送到bugtags使用
 * Created by hurley, Date on 2019-04-24.
 */
public class HttpRequestException extends Exception {

    public HttpRequestException(String detailMessage, Throwable cause) {
        super(detailMessage, cause);
    }

//    public static String format(String url, Request request, Response response) {
//            String requestHeaderStr = "";
//            String requestStr = "";
//            String responseStr = "";
//            String responseHeaderStr = "";
//        try {
//            if (request != null) {
//                if (request.headers() != null) {
//                    requestHeaderStr = request.headers().toString();
//                }
//                requestStr = request.toString();
//            }
//            if (response != null) {
//                responseStr = response.toString();
//                if (response.headers() != null) {
//                    responseHeaderStr = response.headers().toString();
//                }
//            }
//            return String.format("url: %s\n" +
//                            "request: %s\n" +
//                            "request headers: %s" +
//                            "response: %s\n" +
//                            "response headers: %s",
//                    url, requestStr, requestHeaderStr, responseStr, responseHeaderStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return url;
//    }

    public static String format(Request request, Response response) {
        String string = request.url().toString();
        String method = request.method();
        int code = response != null ? response.code() : ResponseCallback.NO_NETWORK_STATUS_CODE;
        String message = response != null ? response.message() : "";
        return String.format("url: %s\n" +
                "request method: %s\n" +
                "statusCode: %d\n" +
                "responseMessage: %s\n", string, method, code, message);
    }
}
