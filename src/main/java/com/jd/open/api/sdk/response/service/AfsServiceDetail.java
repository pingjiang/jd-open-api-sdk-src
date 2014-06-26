// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceDetail.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.Date;

public class AfsServiceDetail
        implements Serializable {

    public AfsServiceDetail() {
    }

    public void setAfsServiceDetailId(Integer afsServiceDetailId) {
        this.afsServiceDetailId = afsServiceDetailId;
    }

    public Integer getAfsServiceDetailId() {
        return afsServiceDetailId;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareDescribe(String wareDescribe) {
        this.wareDescribe = wareDescribe;
    }

    public String getWareDescribe() {
        return wareDescribe;
    }

    public void setWareBrand(String wareBrand) {
        this.wareBrand = wareBrand;
    }

    public String getWareBrand() {
        return wareBrand;
    }

    public void setWareCid1(Integer wareCid1) {
        this.wareCid1 = wareCid1;
    }

    public Integer getWareCid1() {
        return wareCid1;
    }

    public void setWareCid2(Integer wareCid2) {
        this.wareCid2 = wareCid2;
    }

    public Integer getWareCid2() {
        return wareCid2;
    }

    public void setWareCid3(Integer wareCid3) {
        this.wareCid3 = wareCid3;
    }

    public Integer getWareCid3() {
        return wareCid3;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    private Integer afsServiceDetailId;
    private Integer afsServiceId;
    private Integer wareId;
    private String wareName;
    private String wareDescribe;
    private String wareBrand;
    private Integer wareCid1;
    private Integer wareCid2;
    private Integer wareCid3;
    private String createName;
    private String updateName;
    private Date createDate;
    private Date updateDate;
}
