// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPrintResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.PrintResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderPrintResponse extends AbstractResponse {

    public OrderPrintResponse() {
    }

    public PrintResult getPrintResult() {
        return printResult;
    }

    public void setPrintResult(PrintResult printResult) {
        this.printResult = printResult;
    }

    private static final long serialVersionUID = 0xc6066fccL;
    private PrintResult printResult;
}
