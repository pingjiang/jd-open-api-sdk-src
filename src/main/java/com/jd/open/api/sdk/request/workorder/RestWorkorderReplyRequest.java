// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RestWorkorderReplyRequest.java

package com.jd.open.api.sdk.request.workorder;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RestWorkorderReplyRequest extends AbstractRequest
        implements JdRequest {

    public RestWorkorderReplyRequest() {
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public long getWorkId() {
        return workId;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setWorkType(Long workType) {
        this.workType = workType;
    }

    public Long getWorkType() {
        return workType;
    }

    public void setWork2Type(Long work2Type) {
        this.work2Type = work2Type;
    }

    public Long getWork2Type() {
        return work2Type;
    }

    public String getApiMethod() {
        return "jingdong.rest.workorder.reply";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("work_id", Long.valueOf(workId));
        pmap.put("reply_content", replyContent);
        pmap.put("work_type", workType);
        pmap.put("work2_type", work2Type);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.workorder.RestWorkorderReplyResponse.class;
    }

    private long workId;
    private String replyContent;
    private Long workType;
    private Long work2Type;
}
