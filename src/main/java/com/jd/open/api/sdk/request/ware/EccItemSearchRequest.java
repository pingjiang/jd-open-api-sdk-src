// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemSearchRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemSearchRequest extends AbstractRequest
        implements JdRequest {

    public EccItemSearchRequest() {
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setOrderCloumn(String orderCloumn) {
        this.orderCloumn = orderCloumn;
    }

    public String getOrderCloumn() {
        return orderCloumn;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getApiMethod() {
        return "jingdong.ecc.item.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("item_id", itemId);
        pmap.put("item_status", itemStatus);
        pmap.put("item_name", itemName);
        pmap.put("category_id", categoryId);
        pmap.put("ip", ip);
        pmap.put("page_size", pageSize);
        pmap.put("page_index", pageIndex);
        pmap.put("order_cloumn", orderCloumn);
        pmap.put("order_type", orderType);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.EccItemSearchResponse.class;
    }

    private Long itemId;
    private Integer itemStatus;
    private String itemName;
    private Long categoryId;
    private String ip;
    private Integer pageSize;
    private Integer pageIndex;
    private String orderCloumn;
    private String orderType;
}
