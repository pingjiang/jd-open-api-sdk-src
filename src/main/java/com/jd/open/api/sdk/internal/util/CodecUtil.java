// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CodecUtil.java

package com.jd.open.api.sdk.internal.util;

import java.security.MessageDigest;

public final class CodecUtil {

    private CodecUtil() {
        throw new UnsupportedOperationException();
    }

    public static String md5(String source)
            throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte bytes[] = md.digest(source.getBytes("utf-8"));
        return byte2hex(bytes);
    }

    private static String byte2hex(byte bytes[]) {
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xff);
            if (hex.length() == 1)
                sign.append("0");
            sign.append(hex.toUpperCase());
        }

        return sign.toString();
    }
}
