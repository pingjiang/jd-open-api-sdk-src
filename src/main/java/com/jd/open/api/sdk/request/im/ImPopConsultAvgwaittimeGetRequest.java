// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopConsultAvgwaittimeGetRequest.java

package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImPopConsultAvgwaittimeGetRequest extends AbstractRequest
        implements JdRequest {

    public ImPopConsultAvgwaittimeGetRequest() {
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getApiMethod() {
        return "jingdong.im.pop.consult.avgwaittime.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("waiter", waiter);
        try {
            if (date != null)
                pmap.put("date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.im.ImPopConsultAvgwaittimeGetResponse.class;
    }

    private String waiter;
    private Date date;
}
