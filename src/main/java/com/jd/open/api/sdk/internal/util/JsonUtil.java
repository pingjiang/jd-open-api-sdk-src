// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JsonUtil.java

package com.jd.open.api.sdk.internal.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public final class JsonUtil {

    private JsonUtil() {
        throw new UnsupportedOperationException();
    }

    public static String toJson(Object obj)
            throws IOException {
        return mapper.writeValueAsString(obj);
    }

    private static final ObjectMapper mapper = new ObjectMapper();

}
