// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommodityInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            MaterialLabelVO

public class CommodityInfo
        implements Serializable {

    public CommodityInfo() {
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setMaterialUrl(String materialUrl[]) {
        this.materialUrl = materialUrl;
    }

    public String[] getMaterialUrl() {
        return materialUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setMaterialLabel(MaterialLabelVO materialLabel) {
        this.materialLabel = materialLabel;
    }

    public MaterialLabelVO getMaterialLabel() {
        return materialLabel;
    }

    public void setMaterialSpu(List materialSpu) {
        this.materialSpu = materialSpu;
    }

    public List getMaterialSpu() {
        return materialSpu;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewMark(String reviewMark) {
        this.reviewMark = reviewMark;
    }

    public String getReviewMark() {
        return reviewMark;
    }

    public void setShowDays(List showDays) {
        this.showDays = showDays;
    }

    public List getShowDays() {
        return showDays;
    }

    private Long skuId;
    private String title;
    private String originalTitle;
    private String materialUrl[];
    private String targetUrl;
    private BigDecimal price;
    private MaterialLabelVO materialLabel;
    private List materialSpu;
    private Long id;
    private Long planId;
    private Long spaceId;
    private Integer reviewStatus;
    private String reviewMark;
    private List showDays;
}
