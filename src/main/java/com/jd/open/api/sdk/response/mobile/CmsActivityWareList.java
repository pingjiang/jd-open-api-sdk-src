// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CmsActivityWareList.java

package com.jd.open.api.sdk.response.mobile;

import java.io.Serializable;
import java.util.List;

public class CmsActivityWareList
        implements Serializable {

    public CmsActivityWareList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponURL(String couponURL) {
        this.couponURL = couponURL;
    }

    public String getCouponURL() {
        return couponURL;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setCmsActivityRebateImg(String cmsActivityRebateImg) {
        this.cmsActivityRebateImg = cmsActivityRebateImg;
    }

    public String getCmsActivityRebateImg() {
        return cmsActivityRebateImg;
    }

    public void setCmsActivityWareLists(List cmsActivityWareLists) {
        this.cmsActivityWareLists = cmsActivityWareLists;
    }

    public List getCmsActivityWareLists() {
        return cmsActivityWareLists;
    }

    private Integer resultCode;
    private Integer totalCount;
    private Integer couponStatus;
    private String couponURL;
    private String roleIds;
    private String cmsActivityRebateImg;
    private List cmsActivityWareLists;
}
