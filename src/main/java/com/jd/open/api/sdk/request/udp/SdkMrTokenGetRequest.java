// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SdkMrTokenGetRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SdkMrTokenGetRequest extends AbstractRequest
        implements JdRequest {

    public SdkMrTokenGetRequest() {
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunName() {
        return funName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileLength(long fileLength) {
        this.fileLength = fileLength;
    }

    public long getFileLength() {
        return fileLength;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

    public String getApiMethod() {
        return "jingdong.sdk.mr.token.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("timeStamp", Long.valueOf(timeStamp));
        pmap.put("funName", funName);
        pmap.put("fileName", fileName);
        pmap.put("fileLength", Long.valueOf(fileLength));
        pmap.put("flag", Boolean.valueOf(flag));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.SdkMrTokenGetResponse.class;
    }

    private long timeStamp;
    private String funName;
    private String fileName;
    private long fileLength;
    private boolean flag;
}
