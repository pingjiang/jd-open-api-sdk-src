// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsCompanies.java

package com.jd.open.api.sdk.domain.delivery;

import java.io.Serializable;
import java.util.List;

public class LogisticsCompanies
        implements Serializable {

    public LogisticsCompanies() {
    }

    public long getVenderId() {
        return venderId;
    }

    public void setVenderId(long venderId) {
        this.venderId = venderId;
    }

    public List getLogisticsList() {
        return logisticsList;
    }

    public void setLogisticsList(List logisticsList) {
        this.logisticsList = logisticsList;
    }

    private static final long serialVersionUID = 0xca147527L;
    private List logisticsList;
    private long venderId;
}
