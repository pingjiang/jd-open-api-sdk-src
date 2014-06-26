// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimgUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgUpdateRequest extends AbstractRequest
        implements JdRequest {

    public WarePropimgUpdateRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.propimg.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("attribute_value_id", attributeValueId);
        pmap.put("is_main_pic", isMainPic);
        pmap.put("image_id", imageId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WarePropimgUpdateResponse.class;
    }

    public String getAttributeValueId() {
        return attributeValueId;
    }

    public void setAttributeValueId(String attributeValueId) {
        this.attributeValueId = attributeValueId;
    }

    public Boolean getMainPic() {
        return isMainPic;
    }

    public void setMainPic(Boolean mainPic) {
        isMainPic = mainPic;
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
    private Boolean isMainPic;
    private String imageId;
}
