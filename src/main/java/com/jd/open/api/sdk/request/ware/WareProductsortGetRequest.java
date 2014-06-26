// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductsortGetRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductsortGetRequest extends AbstractRequest
        implements JdRequest {

    public WareProductsortGetRequest() {
    }

    public void setProductSortIds(String productSortIds) {
        this.productSortIds = productSortIds;
    }

    public String getProductSortIds() {
        return productSortIds;
    }

    public String getApiMethod() {
        return "jingdong.ware.productsort.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("product_sort_ids", productSortIds);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareProductsortGetResponse.class;
    }

    private String productSortIds;
}
