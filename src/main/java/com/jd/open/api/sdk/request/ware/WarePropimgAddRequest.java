// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimgAddRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.FileItem;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdUploadRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WarePropimgAddRequest extends AbstractRequest
        implements JdUploadRequest {

    public WarePropimgAddRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.propimg.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("attribute_value_id", attributeValueId);
        pmap.put("is_main_pic", isMainPic);
        return JsonUtil.toJson(pmap);
    }

    public Map getFileParams() {
        Map params = new HashMap();
        params.put("image", image);
        return params;
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WarePropimgAddResponse.class;
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

    public FileItem getImage() {
        return image;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    private String wareId;
    private String attributeValueId;
    private Boolean isMainPic;
    private FileItem image;
}
