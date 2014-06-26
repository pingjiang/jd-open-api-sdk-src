// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeliveryLogisticsGetResponse.java

package com.jd.open.api.sdk.response.delivery;

import com.jd.open.api.sdk.domain.delivery.LogisticsCompanies;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeliveryLogisticsGetResponse extends AbstractResponse {

    public DeliveryLogisticsGetResponse() {
    }

    public DeliveryLogisticsGetResponse(LogisticsCompanies logisticsCompanies) {
        this.logisticsCompanies = logisticsCompanies;
    }

    public LogisticsCompanies getLogisticsCompanies() {
        return logisticsCompanies;
    }

    public void setLogisticsCompanies(LogisticsCompanies logisticsCompanies) {
        this.logisticsCompanies = logisticsCompanies;
    }

    private static final long serialVersionUID = 0xefcbcb01L;
    private LogisticsCompanies logisticsCompanies;
}
