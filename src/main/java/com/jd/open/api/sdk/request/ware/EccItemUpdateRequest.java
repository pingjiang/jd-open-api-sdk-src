// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemUpdateRequest extends AbstractRequest
        implements JdRequest {

    public EccItemUpdateRequest() {
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setPackListing(String packListing) {
        this.packListing = packListing;
    }

    public String getPackListing() {
        return packListing;
    }

    public void setAftService(String aftService) {
        this.aftService = aftService;
    }

    public String getAftService() {
        return aftService;
    }

    public void setSpecParam(String specParam) {
        this.specParam = specParam;
    }

    public String getSpecParam() {
        return specParam;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setSkuListJson(String skuListJson) {
        this.skuListJson = skuListJson;
    }

    public String getSkuListJson() {
        return skuListJson;
    }

    public void setItemPictureListJson(String itemPictureListJson) {
        this.itemPictureListJson = itemPictureListJson;
    }

    public String getItemPictureListJson() {
        return itemPictureListJson;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public String getApiMethod() {
        return "jingdong.ecc.item.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("item_id", itemId);
        pmap.put("item_name", itemName);
        pmap.put("cid", cid);
        pmap.put("item_status", itemStatus);
        pmap.put("item_location", itemLocation);
        pmap.put("brand", brand);
        pmap.put("weight", weight);
        pmap.put("pack_listing", packListing);
        pmap.put("aft_service", aftService);
        pmap.put("spec_param", specParam);
        pmap.put("item_des", itemDes);
        pmap.put("operator", operator);
        pmap.put("sku_list_json", skuListJson);
        pmap.put("item_picture_list_json", itemPictureListJson);
        pmap.put("ip", ip);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.EccItemUpdateResponse.class;
    }

    private Long itemId;
    private String itemName;
    private Long cid;
    private Integer itemStatus;
    private String itemLocation;
    private String brand;
    private Integer weight;
    private String packListing;
    private String aftService;
    private String specParam;
    private String itemDes;
    private String operator;
    private String skuListJson;
    private String itemPictureListJson;
    private String ip;
}
