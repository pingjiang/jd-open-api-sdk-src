// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QTReportVO.java

package com.jd.open.api.sdk.domain.zhijian.QTReportService;

import java.io.Serializable;

public class QTReportVO
        implements Serializable {

    public QTReportVO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public String getQtCode() {
        return qtCode;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName;
    }

    public String getQtName() {
        return qtName;
    }

    public void setQtType(Integer qtType) {
        this.qtType = qtType;
    }

    public Integer getQtType() {
        return qtType;
    }

    public void setQtStandard(String qtStandard) {
        this.qtStandard = qtStandard;
    }

    public String getQtStandard() {
        return qtStandard;
    }

    public void setIsPassed(Integer isPassed) {
        this.isPassed = isPassed;
    }

    public Integer getIsPassed() {
        return isPassed;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpName() {
        return spName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setExtAttr(String extAttr) {
        this.extAttr = extAttr;
    }

    public String getExtAttr() {
        return extAttr;
    }

    public void setNumIid(Integer numIid) {
        this.numIid = numIid;
    }

    public Integer getNumIid() {
        return numIid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    private Long id;
    private String qtCode;
    private String qtName;
    private Integer qtType;
    private String qtStandard;
    private Integer isPassed;
    private String spName;
    private String message;
    private String submitTime;
    private String reportTime;
    private String expiryTime;
    private String itemUrl;
    private String itemDesc;
    private String reportUrl;
    private String extAttr;
    private Integer numIid;
    private Integer status;
    private String pin;
}
