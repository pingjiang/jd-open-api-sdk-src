// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSopPrintData.java

package com.jd.open.api.sdk.domain.order;


// Referenced classes of package com.jd.open.api.sdk.domain.order:
//            OrderPrintData

public class OrderSopPrintData extends OrderPrintData {

    public OrderSopPrintData() {
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
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

    private String invoiceTitle;
    private String invoiceType;
    private String invoiceContent;
}
