// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderDetailInfos.java

package com.jd.open.api.sdk.domain.order;


// Referenced classes of package com.jd.open.api.sdk.domain.order:
//            OrderUserInfo

public class OrderDetailInfos {

    public OrderDetailInfos() {
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public OrderUserInfo getConsigneeInfo() {
        return consigneeInfo;
    }

    public void setConsigneeInfo(OrderUserInfo consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    private String waybillId;
    private String venderId;
    private String orderId;
    private String orderPayment;
    private String modified;
    private OrderUserInfo consigneeInfo;
}
