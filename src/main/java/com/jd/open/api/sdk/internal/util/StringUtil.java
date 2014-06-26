// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringUtil.java

package com.jd.open.api.sdk.internal.util;


public final class StringUtil {

    private StringUtil() {
    }

    public static boolean areNotEmpty(String values[]) {
        boolean result = true;
        if (values == null || values.length == 0) {
            result = false;
        } else {
            String arr$[] = values;
            int len$ = arr$.length;
            for (int i$ = 0; i$ < len$; i$++) {
                String value = arr$[i$];
                result &= !isEmpty(value);
            }

        }
        return result;
    }

    public static boolean isEmpty(String value) {
        int strLen;
        if (value == null || (strLen = value.length()) == 0)
            return true;
        for (int i = 0; i < strLen; i++)
            if (!Character.isWhitespace(value.charAt(i)))
                return false;

        return true;
    }
}
