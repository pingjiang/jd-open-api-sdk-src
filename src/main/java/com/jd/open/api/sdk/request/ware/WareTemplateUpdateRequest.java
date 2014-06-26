// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareTemplateUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateUpdateRequest extends AbstractRequest
        implements JdRequest {

    public WareTemplateUpdateRequest() {
        name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String contents[]) {
        this.contents = contents;
    }

    public String getApiMethod() {
        return "360buy.ware.template.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("id", id);
        pmap.put("name", name);
        pmap.put("contents", contents);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareTemplateUpdateResponse.class;
    }

    private String id;
    private String name;
    private String contents[];
}
