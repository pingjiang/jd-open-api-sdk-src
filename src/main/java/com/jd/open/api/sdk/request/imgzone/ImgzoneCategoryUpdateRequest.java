// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneCategoryUpdateRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneCategoryUpdateRequest extends AbstractRequest
        implements JdRequest {

    public ImgzoneCategoryUpdateRequest() {
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateName() {
        return cateName;
    }

    public void setParentCateId(Integer parentCateId) {
        this.parentCateId = parentCateId;
    }

    public Integer getParentCateId() {
        return parentCateId;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.category.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cate_id", cateId);
        pmap.put("cate_name", cateName);
        pmap.put("parent_cate_id", parentCateId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzoneCategoryUpdateResponse.class;
    }

    private Integer cateId;
    private String cateName;
    private Integer parentCateId;
}
