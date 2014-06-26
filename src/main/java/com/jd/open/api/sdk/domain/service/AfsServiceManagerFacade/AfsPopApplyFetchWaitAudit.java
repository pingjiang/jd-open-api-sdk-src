// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsPopApplyFetchWaitAudit.java

package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade:
//            AfsApplyWaitAudit

public class AfsPopApplyFetchWaitAudit
        implements Serializable {

    public AfsPopApplyFetchWaitAudit() {
    }

    public void setAfsApplyId(Integer afsApplyId) {
        this.afsApplyId = afsApplyId;
    }

    public Integer getAfsApplyId() {
        return afsApplyId;
    }

    public void setAfsCategoryId(Integer afsCategoryId) {
        this.afsCategoryId = afsCategoryId;
    }

    public Integer getAfsCategoryId() {
        return afsCategoryId;
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

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPopWaitAppStateStr(String popWaitAppStateStr) {
        this.popWaitAppStateStr = popWaitAppStateStr;
    }

    public String getPopWaitAppStateStr() {
        return popWaitAppStateStr;
    }

    public void setAfsServiceList(List afsServiceList) {
        this.afsServiceList = afsServiceList;
    }

    public List getAfsServiceList() {
        return afsServiceList;
    }

    public void setAfsApply(AfsApplyWaitAudit afsApply) {
        this.afsApply = afsApply;
    }

    public AfsApplyWaitAudit getAfsApply() {
        return afsApply;
    }

    private Integer afsApplyId;
    private Integer afsCategoryId;
    private Integer wareId;
    private String wareName;
    private BigDecimal payPrice;
    private String popWaitAppStateStr;
    private List afsServiceList;
    private AfsApplyWaitAudit afsApply;
}
