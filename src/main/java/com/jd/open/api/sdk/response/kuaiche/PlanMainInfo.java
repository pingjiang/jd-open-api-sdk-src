// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PlanMainInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.math.BigDecimal;

public class PlanMainInfo
        implements Serializable {

    public PlanMainInfo() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setTotalBudget(BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }

    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getMode() {
        return mode;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setAllowSplit(Integer allowSplit) {
        this.allowSplit = allowSplit;
    }

    public Integer getAllowSplit() {
        return allowSplit;
    }

    public void setScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public String getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleEnd(String scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public String getScheduleEnd() {
        return scheduleEnd;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setBidStatus(Integer bidStatus) {
        this.bidStatus = bidStatus;
    }

    public Integer getBidStatus() {
        return bidStatus;
    }

    public void setAdSpaceName(String adSpaceName) {
        this.adSpaceName = adSpaceName;
    }

    public String getAdSpaceName() {
        return adSpaceName;
    }

    private Long id;
    private String name;
    private Long spaceId;
    private Integer type;
    private BigDecimal budget;
    private BigDecimal totalBudget;
    private Integer mode;
    private Integer status;
    private String statusName;
    private Integer allowSplit;
    private String scheduleStart;
    private String scheduleEnd;
    private String insertTime;
    private String updateTime;
    private String submitTime;
    private Integer showType;
    private Integer bidStatus;
    private String adSpaceName;
}
