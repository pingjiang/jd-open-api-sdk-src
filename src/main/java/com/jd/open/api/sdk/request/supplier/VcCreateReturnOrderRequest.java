// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcCreateReturnOrderRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcCreateReturnOrderRequest extends AbstractRequest
        implements JdRequest {

    public VcCreateReturnOrderRequest() {
    }

    public void setFromDeliverCenterId(Integer fromDeliverCenterId) {
        this.fromDeliverCenterId = fromDeliverCenterId;
    }

    public Integer getFromDeliverCenterId() {
        return fromDeliverCenterId;
    }

    public void setToDeliverCenterId(Integer toDeliverCenterId) {
        this.toDeliverCenterId = toDeliverCenterId;
    }

    public Integer getToDeliverCenterId() {
        return toDeliverCenterId;
    }

    public void setPurchaseErpCode(String purchaseErpCode) {
        this.purchaseErpCode = purchaseErpCode;
    }

    public String getPurchaseErpCode() {
        return purchaseErpCode;
    }

    public void setBalanceType(Integer balanceType) {
        this.balanceType = balanceType;
    }

    public Integer getBalanceType() {
        return balanceType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverCell(String receiverCell) {
        this.receiverCell = receiverCell;
    }

    public String getReceiverCell() {
        return receiverCell;
    }

    public void setPikerID(String pikerID) {
        this.pikerID = pikerID;
    }

    public String getPikerID() {
        return pikerID;
    }

    public void setReservedPickUpDate(Date reservedPickUpDate) {
        this.reservedPickUpDate = reservedPickUpDate;
    }

    public Date getReservedPickUpDate() {
        return reservedPickUpDate;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareId() {
        return wareId;
    }

    public void setReturnNum(String returnNum) {
        this.returnNum = returnNum;
    }

    public String getReturnNum() {
        return returnNum;
    }

    public String getApiMethod() {
        return "jingdong.vc.create.return.order";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("fromDeliverCenterId", fromDeliverCenterId);
        pmap.put("toDeliverCenterId", toDeliverCenterId);
        pmap.put("purchaseErpCode", purchaseErpCode);
        pmap.put("balanceType", balanceType);
        pmap.put("transportType", transportType);
        pmap.put("receiverName", receiverName);
        pmap.put("receiverCell", receiverCell);
        pmap.put("pikerID", pikerID);
        try {
            if (reservedPickUpDate != null)
                pmap.put("reservedPickUpDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(reservedPickUpDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("receiverAddress", receiverAddress);
        pmap.put("postCode", postCode);
        pmap.put("wareId", wareId);
        pmap.put("returnNum", returnNum);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.VcCreateReturnOrderResponse.class;
    }

    private Integer fromDeliverCenterId;
    private Integer toDeliverCenterId;
    private String purchaseErpCode;
    private Integer balanceType;
    private Integer transportType;
    private String receiverName;
    private String receiverCell;
    private String pikerID;
    private Date reservedPickUpDate;
    private String receiverAddress;
    private String postCode;
    private String wareId;
    private String returnNum;
}
