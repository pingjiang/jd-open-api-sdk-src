// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AbstractRequest.java

package com.jd.open.api.sdk.request;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRequest {

    public AbstractRequest() {
        timestamp = sdf.format(new Date());
        version = "2.0";
    }

    public Map getSysParams() {
        Map sysParams = new HashMap();
        sysParams.put("method", method);
        sysParams.put("timestamp", timestamp);
        sysParams.put("v", version);
        return sysParams;
    }

    protected String getVenderId() {
        return venderId;
    }

    protected void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    protected String getMethod() {
        return method;
    }

    protected void setMethod(String method) {
        this.method = method;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    protected String getVersion() {
        return version;
    }

    protected void setVersion(String version) {
        this.version = version;
    }

    protected String getSign() {
        return sign;
    }

    protected void setSign(String sign) {
        this.sign = sign;
    }

    private final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String timestamp;
    protected String version;
    protected String venderId;
    protected String method;
    protected String sign;
}
