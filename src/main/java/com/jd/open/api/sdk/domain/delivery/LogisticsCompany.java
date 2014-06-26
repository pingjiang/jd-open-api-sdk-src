// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsCompany.java

package com.jd.open.api.sdk.domain.delivery;


public class LogisticsCompany {

    public LogisticsCompany() {
    }

    public boolean isCod() {
        return isCod;
    }

    public void setCod(boolean cod) {
        isCod = cod;
    }

    public String getLogisticsRemark() {
        return logisticsRemark;
    }

    public void setLogisticsRemark(String logisticsRemark) {
        this.logisticsRemark = logisticsRemark;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getAgreeFlag() {
        return agreeFlag;
    }

    public void setAgreeFlag(String agreeFlag) {
        this.agreeFlag = agreeFlag;
    }

    private Long logisticsId;
    private String logisticsName;
    private String logisticsRemark;
    private String sequence;
    private String agreeFlag;
    private boolean isCod;
}
