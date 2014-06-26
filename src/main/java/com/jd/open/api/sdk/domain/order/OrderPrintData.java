// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPrintData.java

package com.jd.open.api.sdk.domain.order;

import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.domain.order:
//            OrderPrintDataConsignee

public class OrderPrintData {

    public OrderPrintData() {
    }

    public int getPickUpSignType() {
        return pickUpSignType;
    }

    public void setPickUpSignType(int pickUpSignType) {
        this.pickUpSignType = pickUpSignType;
    }

    public int getOrderLevelType() {
        return orderLevelType;
    }

    public void setOrderLevelType(int orderLevelType) {
        this.orderLevelType = orderLevelType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getPickUpSign() {
        return pickUpSign;
    }

    public void setPickUpSign(String pickUpSign) {
        this.pickUpSign = pickUpSign;
    }

    public String getOrderLevelSign() {
        return orderLevelSign;
    }

    public void setOrderLevelSign(String orderLevelSign) {
        this.orderLevelSign = orderLevelSign;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOutBoundDate() {
        return outBoundDate;
    }

    public void setOutBoundDate(String outBoundDate) {
        this.outBoundDate = outBoundDate;
    }

    public String getBfDeliGoodGlag() {
        return bfDeliGoodGlag;
    }

    public void setBfDeliGoodGlag(String bfDeliGoodGlag) {
        this.bfDeliGoodGlag = bfDeliGoodGlag;
    }

    public String getCodTimeName() {
        return codTimeName;
    }

    public void setCodTimeName(String codTimeName) {
        this.codTimeName = codTimeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCky2Name() {
        return cky2Name;
    }

    public void setCky2Name(String cky2Name) {
        this.cky2Name = cky2Name;
    }

    public String getSortingCode() {
        return sortingCode;
    }

    public void setSortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(String shouldPay) {
        this.shouldPay = shouldPay;
    }

    public String getPaymentTypeStr() {
        return paymentTypeStr;
    }

    public void setPaymentTypeStr(String paymentTypeStr) {
        this.paymentTypeStr = paymentTypeStr;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getGenerade() {
        return generade;
    }

    public void setGenerade(String generade) {
        this.generade = generade;
    }

    public String getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(String itemsCount) {
        this.itemsCount = itemsCount;
    }

    public List getwList() {
        return wList;
    }

    public void setwList(List wList) {
        this.wList = wList;
    }

    public OrderPrintDataConsignee getCsnee() {
        return csnee;
    }

    public void setCsnee(OrderPrintDataConsignee csnee) {
        this.csnee = csnee;
    }

    private String id;
    private String outBoundDate;
    private String bfDeliGoodGlag;
    private String codTimeName;
    private String remark;
    private String cky2Name;
    private String sortingCode;
    private String createDate;
    private String shouldPay;
    private String paymentTypeStr;
    private String partner;
    private String generade;
    private String itemsCount;
    private String freight;
    private List wList;
    private OrderPrintDataConsignee csnee;
    private String invoiceType;
    private String invoiceContent;
    private String invoiceTitle;
    private String pickUpSign;
    private int pickUpSignType;
    private String orderLevelSign;
    private int orderLevelType;
}
