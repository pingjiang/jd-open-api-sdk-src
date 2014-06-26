// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsWaybillSendRequest.java

package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EtmsWaybillSendRequest extends AbstractRequest
        implements JdRequest {

    public EtmsWaybillSendRequest() {
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setSalePlat(String salePlat) {
        this.salePlat = salePlat;
    }

    public String getSalePlat() {
        return salePlat;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setThrOrderId(String thrOrderId) {
        this.thrOrderId = thrOrderId;
    }

    public String getThrOrderId() {
        return thrOrderId;
    }

    public void setSelfPrintWayBill(Integer selfPrintWayBill) {
        this.selfPrintWayBill = selfPrintWayBill;
    }

    public Integer getSelfPrintWayBill() {
        return selfPrintWayBill;
    }

    public void setPickMethod(String pickMethod) {
        this.pickMethod = pickMethod;
    }

    public String getPickMethod() {
        return pickMethod;
    }

    public void setPackageRequired(String packageRequired) {
        this.packageRequired = packageRequired;
    }

    public String getPackageRequired() {
        return packageRequired;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return county;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }

    public Integer getTownId() {
        return townId;
    }

    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }

    public Integer getSiteType() {
        return siteType;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel;
    }

    public String getReceiveTel() {
        return receiveTel;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setVloumLong(Double vloumLong) {
        this.vloumLong = vloumLong;
    }

    public Double getVloumLong() {
        return vloumLong;
    }

    public void setVloumWidth(Double vloumWidth) {
        this.vloumWidth = vloumWidth;
    }

    public Double getVloumWidth() {
        return vloumWidth;
    }

    public void setVloumHeight(Double vloumHeight) {
        this.vloumHeight = vloumHeight;
    }

    public Double getVloumHeight() {
        return vloumHeight;
    }

    public void setVloumn(Double vloumn) {
        this.vloumn = vloumn;
    }

    public Double getVloumn() {
        return vloumn;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCollectionValue(Integer collectionValue) {
        this.collectionValue = collectionValue;
    }

    public Integer getCollectionValue() {
        return collectionValue;
    }

    public void setCollectionMoney(Double collectionMoney) {
        this.collectionMoney = collectionMoney;
    }

    public Double getCollectionMoney() {
        return collectionMoney;
    }

    public void setGuaranteeValue(Integer guaranteeValue) {
        this.guaranteeValue = guaranteeValue;
    }

    public Integer getGuaranteeValue() {
        return guaranteeValue;
    }

    public void setGuaranteeValueAmount(Double guaranteeValueAmount) {
        this.guaranteeValueAmount = guaranteeValueAmount;
    }

    public Double getGuaranteeValueAmount() {
        return guaranteeValueAmount;
    }

    public void setSignReturn(Integer signReturn) {
        this.signReturn = signReturn;
    }

    public Integer getSignReturn() {
        return signReturn;
    }

    public void setAging(Integer aging) {
        this.aging = aging;
    }

    public Integer getAging() {
        return aging;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setExtendField1(String extendField1) {
        this.extendField1 = extendField1;
    }

    public String getExtendField1() {
        return extendField1;
    }

    public void setExtendField2(String extendField2) {
        this.extendField2 = extendField2;
    }

    public String getExtendField2() {
        return extendField2;
    }

    public void setExtendField3(String extendField3) {
        this.extendField3 = extendField3;
    }

    public String getExtendField3() {
        return extendField3;
    }

    public void setExtendField4(Integer extendField4) {
        this.extendField4 = extendField4;
    }

    public Integer getExtendField4() {
        return extendField4;
    }

    public void setExtendField5(Integer extendField5) {
        this.extendField5 = extendField5;
    }

    public Integer getExtendField5() {
        return extendField5;
    }

    public String getApiMethod() {
        return "jingdong.etms.waybill.send";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("deliveryId", deliveryId);
        pmap.put("salePlat", salePlat);
        pmap.put("customerCode", customerCode);
        pmap.put("orderId", orderId);
        pmap.put("thrOrderId", thrOrderId);
        pmap.put("selfPrintWayBill", selfPrintWayBill);
        pmap.put("pickMethod", pickMethod);
        pmap.put("packageRequired", packageRequired);
        pmap.put("senderName", senderName);
        pmap.put("senderAddress", senderAddress);
        pmap.put("senderTel", senderTel);
        pmap.put("senderMobile", senderMobile);
        pmap.put("senderPostcode", senderPostcode);
        pmap.put("receiveName", receiveName);
        pmap.put("receiveAddress", receiveAddress);
        pmap.put("province", province);
        pmap.put("city", city);
        pmap.put("county", county);
        pmap.put("town", town);
        pmap.put("provinceId", provinceId);
        pmap.put("cityId", cityId);
        pmap.put("countyId", countyId);
        pmap.put("townId", townId);
        pmap.put("siteType", siteType);
        pmap.put("siteId", siteId);
        pmap.put("siteName", siteName);
        pmap.put("receiveTel", receiveTel);
        pmap.put("receiveMobile", receiveMobile);
        pmap.put("postcode", postcode);
        pmap.put("packageCount", packageCount);
        pmap.put("weight", weight);
        pmap.put("vloumLong", vloumLong);
        pmap.put("vloumWidth", vloumWidth);
        pmap.put("vloumHeight", vloumHeight);
        pmap.put("vloumn", vloumn);
        pmap.put("description", description);
        pmap.put("collectionValue", collectionValue);
        pmap.put("collectionMoney", collectionMoney);
        pmap.put("guaranteeValue", guaranteeValue);
        pmap.put("guaranteeValueAmount", guaranteeValueAmount);
        pmap.put("signReturn", signReturn);
        pmap.put("aging", aging);
        pmap.put("transType", transType);
        pmap.put("extendField1", extendField1);
        pmap.put("extendField2", extendField2);
        pmap.put("extendField3", extendField3);
        pmap.put("extendField4", extendField4);
        pmap.put("extendField5", extendField5);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.delivery.EtmsWaybillSendResponse.class;
    }

    private String deliveryId;
    private String salePlat;
    private String customerCode;
    private String orderId;
    private String thrOrderId;
    private Integer selfPrintWayBill;
    private String pickMethod;
    private String packageRequired;
    private String senderName;
    private String senderAddress;
    private String senderTel;
    private String senderMobile;
    private String senderPostcode;
    private String receiveName;
    private String receiveAddress;
    private String province;
    private String city;
    private String county;
    private String town;
    private Integer provinceId;
    private Integer cityId;
    private Integer countyId;
    private Integer townId;
    private Integer siteType;
    private Integer siteId;
    private String siteName;
    private String receiveTel;
    private String receiveMobile;
    private String postcode;
    private Integer packageCount;
    private Double weight;
    private Double vloumLong;
    private Double vloumWidth;
    private Double vloumHeight;
    private Double vloumn;
    private String description;
    private Integer collectionValue;
    private Double collectionMoney;
    private Integer guaranteeValue;
    private Double guaranteeValueAmount;
    private Integer signReturn;
    private Integer aging;
    private Integer transType;
    private String extendField1;
    private String extendField2;
    private String extendField3;
    private Integer extendField4;
    private Integer extendField5;
}
