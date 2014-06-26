// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PartReceiveOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.Date;

public class PartReceiveOut
        implements Serializable {

    public PartReceiveOut() {
    }

    public void setReceivePin(String receivePin) {
        this.receivePin = receivePin;
    }

    public String getReceivePin() {
        return receivePin;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setPartReceiveId(Integer partReceiveId) {
        this.partReceiveId = partReceiveId;
    }

    public Integer getPartReceiveId() {
        return partReceiveId;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setReceiveJudgment(Integer receiveJudgment) {
        this.receiveJudgment = receiveJudgment;
    }

    public Integer getReceiveJudgment() {
        return receiveJudgment;
    }

    public void setPartQuality(Integer partQuality) {
        this.partQuality = partQuality;
    }

    public Integer getPartQuality() {
        return partQuality;
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

    public void setWareSn(String wareSn) {
        this.wareSn = wareSn;
    }

    public String getWareSn() {
        return wareSn;
    }

    public void setWareAttachment(String wareAttachment) {
        this.wareAttachment = wareAttachment;
    }

    public String getWareAttachment() {
        return wareAttachment;
    }

    public void setPartAppearance(Integer partAppearance) {
        this.partAppearance = partAppearance;
    }

    public Integer getPartAppearance() {
        return partAppearance;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    private String receivePin;
    private String receiveName;
    private Integer partReceiveId;
    private Integer afsServiceId;
    private String waybill;
    private Integer receiveJudgment;
    private Integer partQuality;
    private Integer wareId;
    private String wareName;
    private String wareSn;
    private String wareAttachment;
    private Integer partAppearance;
    private String remark;
    private String createName;
    private Date createDate;
}
