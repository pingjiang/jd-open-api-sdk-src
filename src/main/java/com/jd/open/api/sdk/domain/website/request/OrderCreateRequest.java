// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCreateRequest.java

package com.jd.open.api.sdk.domain.website.request;

import com.jd.open.api.sdk.domain.website.response.OrderCreateResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCreateRequest extends AbstractRequest
        implements JdRequest {

    public OrderCreateRequest() {
    }

    public String getSkusInfo() {
        return skusInfo;
    }

    public void setSkusInfo(String skusInfo) {
        this.skusInfo = skusInfo;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverProvinc() {
        return receiverProvinc;
    }

    public void setReceiverProvinc(String receiverProvinc) {
        this.receiverProvinc = receiverProvinc;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverArea() {
        return receiverArea;
    }

    public void setReceiverArea(String receiverArea) {
        this.receiverArea = receiverArea;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getCodTime() {
        return codTime;
    }

    public void setCodTime(String codTime) {
        this.codTime = codTime;
    }

    public String getApiMethod() {
        return "jingdong.order.create";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("skus_info", skusInfo);
        map.put("buyer_name", buyerName);
        map.put("receiver_name", receiverName);
        map.put("receiver_provinc", receiverProvinc);
        map.put("receiver_city", receiverCity);
        map.put("receiver_area", receiverArea);
        map.put("receiver_address", receiverAddress);
        map.put("receiver_zip", receiverZip);
        map.put("receiver_phone", receiverPhone);
        map.put("receiver_mobile", receiverMobile);
        map.put("receiver_email", receiverEmail);
        map.put("price", price);
        map.put("promotion_price", promotionPrice);
        map.put("payment_type", paymentType);
        map.put("payment_way", paymentWay);
        map.put("shipment_type", shipmentType);
        map.put("cod_time", codTime);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return OrderCreateResponse.class;
    }

    private String skusInfo;
    private String buyerName;
    private String receiverName;
    private String receiverProvinc;
    private String receiverCity;
    private String receiverArea;
    private String receiverAddress;
    private String receiverZip;
    private String receiverPhone;
    private String receiverMobile;
    private String receiverEmail;
    private String price;
    private String promotionPrice;
    private String paymentType;
    private String paymentWay;
    private String shipmentType;
    private String codTime;
}
