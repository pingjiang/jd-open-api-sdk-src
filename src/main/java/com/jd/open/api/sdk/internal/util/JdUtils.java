// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JdUtils.java

package com.jd.open.api.sdk.internal.util;


public class JdUtils {

    public JdUtils() {
    }

    public static String getMimeType(byte bytes[]) {
        String suffix = getFileSuffix(bytes);
        String mimeType;
        if ("JPG".equals(suffix))
            mimeType = "image/jpeg";
        else if ("GIF".equals(suffix))
            mimeType = "image/gif";
        else if ("PNG".equals(suffix))
            mimeType = "image/png";
        else if ("BMP".equals(suffix))
            mimeType = "image/bmp";
        else
            mimeType = "application/octet-stream";
        return mimeType;
    }

    public static String getFileSuffix(byte bytes[]) {
        if (bytes == null || bytes.length < 10)
            return null;
        if (bytes[0] == 71 && bytes[1] == 73 && bytes[2] == 70)
            return "GIF";
        if (bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71)
            return "PNG";
        if (bytes[6] == 74 && bytes[7] == 70 && bytes[8] == 73 && bytes[9] == 70)
            return "JPG";
        if (bytes[0] == 66 && bytes[1] == 77)
            return "BMP";
        else
            return null;
    }
}
