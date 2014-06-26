// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceReturnAddRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceReturnAddRequest extends AbstractRequest
        implements JdRequest {

    public AfsserviceReturnAddRequest() {
    }

    public void setShipWay(Integer shipWay) {
        this.shipWay = shipWay;
    }

    public Integer getShipWay() {
        return shipWay;
    }

    public void setShipWayName(String shipWayName) {
        this.shipWayName = shipWayName;
    }

    public String getShipWayName() {
        return shipWayName;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setPartCodes(String partCodes) {
        this.partCodes = partCodes;
    }

    public String getPartCodes() {
        return partCodes;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getProvince() {
        return province;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCity() {
        return city;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public Integer getCounty() {
        return county;
    }

    public void setVillage(Integer village) {
        this.village = village;
    }

    public Integer getVillage() {
        return village;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setApplayRemark(String applayRemark) {
        this.applayRemark = applayRemark;
    }

    public String getApplayRemark() {
        return applayRemark;
    }

    public String getApiMethod() {
        return "jingdong.afsservice.return.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("shipWay", shipWay);
        pmap.put("shipWayName", shipWayName);
        pmap.put("waybill", waybill);
        pmap.put("partCodes", partCodes);
        pmap.put("afsServiceId", afsServiceId);
        pmap.put("province", province);
        pmap.put("city", city);
        pmap.put("county", county);
        pmap.put("village", village);
        pmap.put("address", address);
        pmap.put("zipCode", zipCode);
        pmap.put("consigneeName", consigneeName);
        pmap.put("consigneeTel", consigneeTel);
        pmap.put("applayRemark", applayRemark);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.AfsserviceReturnAddResponse.class;
    }

    private Integer shipWay;
    private String shipWayName;
    private String waybill;
    private String partCodes;
    private Integer afsServiceId;
    private Integer province;
    private Integer city;
    private Integer county;
    private Integer village;
    private String address;
    private String zipCode;
    private String consigneeName;
    private String consigneeTel;
    private String applayRemark;
}
