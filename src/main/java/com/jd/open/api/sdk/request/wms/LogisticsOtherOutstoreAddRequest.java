// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherOutstoreAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOtherOutstoreAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOtherOutstoreAddRequest() {
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }

    public String getOutboundNo() {
        return outboundNo;
    }

    public void setJoslWareNo(String joslWareNo) {
        this.joslWareNo = joslWareNo;
    }

    public String getJoslWareNo() {
        return joslWareNo;
    }

    public void setJoslCarriersNo(String joslCarriersNo) {
        this.joslCarriersNo = joslCarriersNo;
    }

    public String getJoslCarriersNo() {
        return joslCarriersNo;
    }

    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    public Date getExpectDate() {
        return expectDate;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApprover() {
        return approver;
    }

    public void setOutboundType(String outboundType) {
        this.outboundType = outboundType;
    }

    public String getOutboundType() {
        return outboundType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setReceivable(float receivable) {
        this.receivable = receivable;
    }

    public float getReceivable() {
        return receivable;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setReturnConsigneeName(String returnConsigneeName) {
        this.returnConsigneeName = returnConsigneeName;
    }

    public String getReturnConsigneeName() {
        return returnConsigneeName;
    }

    public void setReturnConsigneeAddress(String returnConsigneeAddress) {
        this.returnConsigneeAddress = returnConsigneeAddress;
    }

    public String getReturnConsigneeAddress() {
        return returnConsigneeAddress;
    }

    public void setReturnConsigneeMobile(String returnConsigneeMobile) {
        this.returnConsigneeMobile = returnConsigneeMobile;
    }

    public String getReturnConsigneeMobile() {
        return returnConsigneeMobile;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setPicker(String picker) {
        this.picker = picker;
    }

    public String getPicker() {
        return picker;
    }

    public void setPickerCell(String pickerCell) {
        this.pickerCell = pickerCell;
    }

    public String getPickerCell() {
        return pickerCell;
    }

    public void setPikerId(String pikerId) {
        this.pikerId = pikerId;
    }

    public String getPikerId() {
        return pikerId;
    }

    public void setTransportWay(String transportWay) {
        this.transportWay = transportWay;
    }

    public String getTransportWay() {
        return transportWay;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setJoslGoodNo(String joslGoodNo) {
        this.joslGoodNo = joslGoodNo;
    }

    public String getJoslGoodNo() {
        return joslGoodNo;
    }

    public void setIsvGoodNo(String isvGoodNo) {
        this.isvGoodNo = isvGoodNo;
    }

    public String getIsvGoodNo() {
        return isvGoodNo;
    }

    public void setOutQty(String outQty) {
        this.outQty = outQty;
    }

    public String getOutQty() {
        return outQty;
    }

    public void setGoodStatus(String goodStatus) {
        this.goodStatus = goodStatus;
    }

    public String getGoodStatus() {
        return goodStatus;
    }

    public String getApiMethod() {
        return "jingdong.logistics.otherOutstore.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("outbound_no", outboundNo);
        pmap.put("josl_ware_no", joslWareNo);
        pmap.put("josl_carriers_no", joslCarriersNo);
        try {
            if (expectDate != null)
                pmap.put("expect_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(expectDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("supplier_name", supplierName);
        pmap.put("supplier_no", supplierNo);
        pmap.put("approver", approver);
        pmap.put("outbound_type", outboundType);
        pmap.put("remark", remark);
        pmap.put("consignee_name", consigneeName);
        pmap.put("address", address);
        pmap.put("station_no", stationNo);
        pmap.put("station_name", stationName);
        pmap.put("receivable", Float.valueOf(receivable));
        pmap.put("zip_code", zipCode);
        pmap.put("phone", phone);
        pmap.put("mobile", mobile);
        pmap.put("email", email);
        pmap.put("buyer_remark", buyerRemark);
        pmap.put("verify_remark", verifyRemark);
        pmap.put("return_consignee_name", returnConsigneeName);
        pmap.put("return_consignee_address", returnConsigneeAddress);
        pmap.put("return_consignee_mobile", returnConsigneeMobile);
        pmap.put("address_province", addressProvince);
        pmap.put("address_city", addressCity);
        pmap.put("address_county", addressCounty);
        pmap.put("address_town", addressTown);
        pmap.put("picker", picker);
        pmap.put("picker_cell", pickerCell);
        pmap.put("piker_id", pikerId);
        pmap.put("transport_way", transportWay);
        pmap.put("order_mark", orderMark);
        pmap.put("josl_good_no", joslGoodNo);
        pmap.put("isv_good_no", isvGoodNo);
        pmap.put("out_qty", outQty);
        pmap.put("good_status", goodStatus);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOtherOutstoreAddResponse.class;
    }

    private String outboundNo;
    private String joslWareNo;
    private String joslCarriersNo;
    private Date expectDate;
    private String supplierName;
    private String supplierNo;
    private String approver;
    private String outboundType;
    private String remark;
    private String consigneeName;
    private String address;
    private String stationNo;
    private String stationName;
    private float receivable;
    private String zipCode;
    private String phone;
    private String mobile;
    private String email;
    private String buyerRemark;
    private String verifyRemark;
    private String returnConsigneeName;
    private String returnConsigneeAddress;
    private String returnConsigneeMobile;
    private String addressProvince;
    private String addressCity;
    private String addressCounty;
    private String addressTown;
    private String picker;
    private String pickerCell;
    private String pikerId;
    private String transportWay;
    private String orderMark;
    private String joslGoodNo;
    private String isvGoodNo;
    private String outQty;
    private String goodStatus;
}
