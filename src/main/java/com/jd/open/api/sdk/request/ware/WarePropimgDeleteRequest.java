// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimgDeleteRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgDeleteRequest extends AbstractRequest
        implements JdRequest {

    public WarePropimgDeleteRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.propimg.delete";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("attribute_value_id", attributeValueId);
        pmap.put("image_id", imageId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WarePropimgDeleteResponse.class;
    }

    public String getAttributeValueId() {
        return attributeValueId;
    }

    public void setAttributeValueId(String attributeValueId) {
        this.attributeValueId = attributeValueId;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    private String wareId;
    private String attributeValueId;
    private String imageId;
}
