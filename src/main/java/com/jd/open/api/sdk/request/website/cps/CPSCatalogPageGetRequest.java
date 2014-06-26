// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSCatalogPageGetRequest.java

package com.jd.open.api.sdk.request.website.cps;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.cps.CPSCatalogPageGetResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CPSCatalogPageGetRequest extends AbstractRequest
        implements JdRequest {

    public CPSCatalogPageGetRequest() {
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getaCid() {
        return aCid;
    }

    public void setaCid(String aCid) {
        this.aCid = aCid;
    }

    public String getbCid() {
        return bCid;
    }

    public void setbCid(String bCid) {
        this.bCid = bCid;
    }

    public String getcCid() {
        return cCid;
    }

    public void setcCid(String cCid) {
        this.cCid = cCid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMobile() {
        return isMobile;
    }

    public void setMobile(String mobile) {
        isMobile = mobile;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
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
        return "jingdong.tuiguang.cat.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("fields", fields);
        map.put("a_cid", aCid);
        map.put("b_cid", bCid);
        map.put("c_cid", cCid);
        map.put("level", level);
        map.put("is_mobile", isMobile);
        map.put("page", pageIndex);
        map.put("page_size", pageSize);
        map.put("is_need_img", isNeedImg);
        map.put("img_size_type", imgSizeType);
        map.put("serial_number", serialNumber);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return CPSCatalogPageGetResponse.class;
    }

    private String fields;
    private String aCid;
    private String bCid;
    private String cCid;
    private String level;
    private String isMobile;
    private String pageIndex;
    private String pageSize;
    private Boolean isNeedImg;
    private String imgSizeType;
    private String serialNumber;
}
