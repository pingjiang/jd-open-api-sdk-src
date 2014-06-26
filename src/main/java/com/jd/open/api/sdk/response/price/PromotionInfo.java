// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionInfo.java

package com.jd.open.api.sdk.response.price;

import java.io.Serializable;
import java.util.List;

public class PromotionInfo
        implements Serializable {

    public PromotionInfo() {
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public String getPromoId() {
        return promoId;
    }

    public void setPromoType(Integer promoType) {
        this.promoType = promoType;
    }

    public Integer getPromoType() {
        return promoType;
    }

    public void setExtType(Integer extType) {
        this.extType = extType;
    }

    public Integer getExtType() {
        return extType;
    }

    public void setFullRefundType(Integer fullRefundType) {
        this.fullRefundType = fullRefundType;
    }

    public Integer getFullRefundType() {
        return fullRefundType;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setLimitUserType(Integer limitUserType) {
        this.limitUserType = limitUserType;
    }

    public Integer getLimitUserType() {
        return limitUserType;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getReward() {
        return reward;
    }

    public void setAddMoney(String addMoney) {
        this.addMoney = addMoney;
    }

    public String getAddMoney() {
        return addMoney;
    }

    public void setNeedMondey(String needMondey) {
        this.needMondey = needMondey;
    }

    public String getNeedMondey() {
        return needMondey;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public Integer getNeedNum() {
        return needNum;
    }

    public void setDeliverNum(Integer deliverNum) {
        this.deliverNum = deliverNum;
    }

    public Integer getDeliverNum() {
        return deliverNum;
    }

    public void setTopMoney(String topMoney) {
        this.topMoney = topMoney;
    }

    public String getTopMoney() {
        return topMoney;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getPercent() {
        return percent;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    public Double getRebate() {
        return rebate;
    }

    public void setHaveFullRefundGifts(Boolean haveFullRefundGifts) {
        this.haveFullRefundGifts = haveFullRefundGifts;
    }

    public Boolean getHaveFullRefundGifts() {
        return haveFullRefundGifts;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setPromoEndTime(Long promoEndTime) {
        this.promoEndTime = promoEndTime;
    }

    public Long getPromoEndTime() {
        return promoEndTime;
    }

    public void setAdwordCouponList(List adwordCouponList) {
        this.adwordCouponList = adwordCouponList;
    }

    public List getAdwordCouponList() {
        return adwordCouponList;
    }

    public void setAdwordGiftSkuList(List adwordGiftSkuList) {
        this.adwordGiftSkuList = adwordGiftSkuList;
    }

    public List getAdwordGiftSkuList() {
        return adwordGiftSkuList;
    }

    private String promoId;
    private Integer promoType;
    private Integer extType;
    private Integer fullRefundType;
    private Integer userLevel;
    private Integer minNum;
    private Integer maxNum;
    private Integer limitUserType;
    private String price;
    private String discount;
    private String reward;
    private String addMoney;
    private String needMondey;
    private Integer needNum;
    private Integer deliverNum;
    private String topMoney;
    private Double percent;
    private Double rebate;
    private Boolean haveFullRefundGifts;
    private Integer score;
    private Long promoEndTime;
    private List adwordCouponList;
    private List adwordGiftSkuList;
}
