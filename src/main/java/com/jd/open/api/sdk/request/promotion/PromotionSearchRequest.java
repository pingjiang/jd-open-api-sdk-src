// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionSearchRequest.java

package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromotionSearchResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromotionSearchRequest extends AbstractRequest
        implements JdRequest {
    public enum CheckStatus {
        UNLIMIT("UNLIMIT"),
        NOT_CHECK("NOT_CHECK"),
        CHECK_PASS("CHECK_PASS"),
        REJECT("REJECT");

        private String key;

        private CheckStatus(String key) {
            this.key = key;
        }
    }

    public enum EvtStatus {

        ALL("ALL"),
        NOT_START("NOT_START"),
        IN_PROGREE("IN_PROGREE"),
        SUSPENSION("SUSPENSION"),
        FORCED_TERMINATION("FORCED_TERMINATION"),
        FINISH("FINISH");

        private final String key;

        private EvtStatus(String key) {
            this.key = key;
        }
    }

    public enum EvtType {
        ALL("ALL"),
        BUY_SEND_PROMOTION("BUY_SEND_PROMOTION"),
        SUIT_PROMOTION("SUIT_PROMOTION"),
        GIFT_PROMOTION("GIFT_PROMOTION");

        private String key;

        private EvtType(String key) {
            this.key = key;
        }
    }

    public enum LevelMember {
        UNLIMIT("UNLIMIT"),
        IRON_MEDEL_MEMBER("IRON_MEDEL_MEMBER"),
        COPPER_MEDEL_MEMBER("COPPER_MEDEL_MEMBER"),
        SILVER_MEDEL_MEMBER("SILVER_MEDEL_MEMBER"),
        GOLD_MEDEL_MEMBER("GOLD_MEDEL_MEMBER"),
        DIAMONDS_MEDEL_MEMBER("DIAMONDS_MEDEL_MEMBER"),
        DOUBLE_DIAMOND_MEMBER("DOUBLE_DIAMOND_MEMBER");

        private String key;

        private LevelMember(String key) {
            this.key = key;
        }
    }


    public PromotionSearchRequest() {
        levelMember = LevelMember.UNLIMIT;
        evtType = EvtType.ALL;
        evtStatus = EvtStatus.ALL;
        checkStatus = CheckStatus.UNLIMIT;
    }

    public String getApiMethod() {
        return "360buy.promotion.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("time_begin_start", timeBegin_start);
        map.put("time_begin_end", timeBegin_end);
        map.put("time_end_start", timeEnd_start);
        map.put("time_end_end", timeEnd_end);
        map.put("ware_id", wareId);
        map.put("level_member", levelMember);
        map.put("evt_type", evtType);
        map.put("evt_status", evtStatus);
        map.put("check_status", checkStatus);
        map.put("page", page);
        map.put("page_size", pageSize);
        map.put("evt_id", evtId);
        map.put("sku_id", skuId);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return PromotionSearchResponse.class;
    }

    public String getEvtId() {
        return evtId;
    }

    public void setEvtId(String evtId) {
        this.evtId = evtId;
    }

    public String getTimeBegin_start() {
        return timeBegin_start;
    }

    public void setTimeBegin_start(String timeBegin_start) {
        this.timeBegin_start = timeBegin_start;
    }

    public String getTimeBegin_end() {
        return timeBegin_end;
    }

    public void setTimeBegin_end(String timeBegin_end) {
        this.timeBegin_end = timeBegin_end;
    }

    public String getTimeEnd_start() {
        return timeEnd_start;
    }

    public void setTimeEnd_start(String timeEnd_start) {
        this.timeEnd_start = timeEnd_start;
    }

    public String getTimeEnd_end() {
        return timeEnd_end;
    }

    public void setTimeEnd_end(String timeEnd_end) {
        this.timeEnd_end = timeEnd_end;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public LevelMember getLevelMember() {
        return levelMember;
    }

    public void setLevelMember(LevelMember levelMember) {
        this.levelMember = levelMember;
    }

    public EvtType getEvtType() {
        return evtType;
    }

    public void setEvtType(EvtType evtType) {
        this.evtType = evtType;
    }

    public EvtStatus getEvtStatus() {
        return evtStatus;
    }

    public void setEvtStatus(EvtStatus evtStatus) {
        this.evtStatus = evtStatus;
    }

    public CheckStatus getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(CheckStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    private String evtId;
    private String timeBegin_start;
    private String timeBegin_end;
    private String timeEnd_start;
    private String timeEnd_end;
    private String wareId;
    private LevelMember levelMember;
    private EvtType evtType;
    private EvtStatus evtStatus;
    private CheckStatus checkStatus;
    private String page;
    private String pageSize;
    private String skuId;
}
