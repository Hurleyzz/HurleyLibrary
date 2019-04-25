package com.hurley.library.utils;

/**
 * Created by hurley, Date on 2019-04-25.
 */

import com.hurley.library.utils.codec.digest.DigestUtils;
import com.hurley.library.utils.codec.digest.HmacUtils;

/**
 * 授权相关工具类
 */
public class AuthUtils {

    public static String md5Sign(long timestamp, String app_secret, String access_secret) {
        String text = timestamp + app_secret + access_secret;
        return DigestUtils.md5Hex(text);
    }

    public static String HmacSHA1Sign(String key, String token, String secret) {
        String content = token + secret;
        return HmacUtils.hmacMd5Hex(key, content);
    }

}
