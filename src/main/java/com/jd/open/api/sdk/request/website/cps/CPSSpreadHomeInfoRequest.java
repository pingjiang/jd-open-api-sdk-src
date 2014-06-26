// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSSpreadHomeInfoRequest.java

package com.jd.open.api.sdk.request.website.cps;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.cps.CPSSpreadHomeInfoResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CPSSpreadHomeInfoRequest extends AbstractRequest
        implements JdRequest {

    public CPSSpreadHomeInfoRequest() {
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getMobile() {
        return isMobile;
    }

    public void setMobile(String mobile) {
        isMobile = mobile;
    }

    public Boolean getNeedImg() {
        return isNeedImg;
    }

    public void setNeedImg(Boolean needImg) {
        isNeedImg = needImg;
    }

    public String getImgSizeType() {
        return imgSizeType;
    }

    public void setImgSizeType(String imgSizeType) {
        this.imgSizeType = imgSizeType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getApiMethod() {
        return "jingdong.tuiguang.homepage.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("fields", fields);
        map.put("is_mobile", isMobile);
        map.put("is_need_img", isNeedImg);
        map.put("img_size_type", imgSizeType);
        map.put("serial_number", serialNumber);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return CPSSpreadHomeInfoResponse.class;
    }

    private String fields;
    private String isMobile;
    private Boolean isNeedImg;
    private String imgSizeType;
    private String serialNumber;
}
