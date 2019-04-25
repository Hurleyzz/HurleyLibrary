package com.hurley.library.http.security;

/**
 * Created by hurley, Date on 2019-04-24.
 */

import android.annotation.SuppressLint;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * 暂时允许所有HostName
 */
public class NHHostNameVerifier implements HostnameVerifier {
    @SuppressLint("BadHostnameVerifier")
    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
