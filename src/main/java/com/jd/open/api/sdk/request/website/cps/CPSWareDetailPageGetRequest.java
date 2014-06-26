// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSWareDetailPageGetRequest.java

package com.jd.open.api.sdk.request.website.cps;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.cps.CPSWareDetailPageGetResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CPSWareDetailPageGetRequest extends AbstractRequest
        implements JdRequest {

    public CPSWareDetailPageGetRequest() {
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getImgSizeType() {
        return imgSizeType;
    }

    public void setImgSizeType(String imgSizeType) {
        this.imgSizeType = imgSizeType;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getSkuIds() {
        return skuIds;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getMobile() {
        return isMobile;
    }

    public void setMobile(String mobile) {
        isMobile = mobile;
    }

    public String getApiMethod() {
        return "jingdong.tuiguang.wares.detail.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("fields", fields);
        map.put("is_mobile", isMobile);
        map.put("sku_ids", skuIds);
        map.put("link_type", linkType);
        map.put("img_size_type", imgSizeType);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return CPSWareDetailPageGetResponse.class;
    }

    private String fields;
    private String skuIds;
    private String isMobile;
    private String linkType;
    private String imgSizeType;
}
