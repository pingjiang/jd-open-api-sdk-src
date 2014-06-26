// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JdRequest.java

package com.jd.open.api.sdk.request;

import java.io.IOException;
import java.util.Map;

public interface JdRequest {

    String getApiMethod();

    Map getSysParams();

    String getAppJsonParams()
            throws IOException;

    Class getResponseClass();
}
