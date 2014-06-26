// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOrderAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOrderAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOrderAddRequest() {
    }

    public void setChannelsSellerNo(String channelsSellerNo) {
        this.channelsSellerNo = channelsSellerNo;
    }

    public String getChannelsSellerNo() {
        return channelsSellerNo;
    }

    public void setChannelsOutboundNo(String channelsOutboundNo) {
        this.channelsOutboundNo = channelsOutboundNo;
    }

    public String getChannelsOutboundNo() {
        return channelsOutboundNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setCarriersId(String carriersId) {
        this.carriersId = carriersId;
    }

    public String getCarriersId() {
        return carriersId;
    }

    public void setExpectDate(String expectDate) {
        this.expectDate = expectDate;
    }

    public String getExpectDate() {
        return expectDate;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeName() {
        return consigneeName;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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

    public void setReceivable(float receivable) {
        this.receivable = receivable;
    }

    public float getReceivable() {
        return receivable;
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

    public void setReturnConsigneeAddress(String returnConsigneeAddress) {
        this.returnConsigneeAddress = returnConsigneeAddress;
    }

    public String getReturnConsigneeAddress() {
        return returnConsigneeAddress;
    }

    public void setReturnConsigneeName(String returnConsigneeName) {
        this.returnConsigneeName = returnConsigneeName;
    }

    public String getReturnConsigneeName() {
        return returnConsigneeName;
    }

    public void setReturnConsigneePhone(String returnConsigneePhone) {
        this.returnConsigneePhone = returnConsigneePhone;
    }

    public String getReturnConsigneePhone() {
        return returnConsigneePhone;
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

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setShopOrderSource(String shopOrderSource) {
        this.shopOrderSource = shopOrderSource;
    }

    public String getShopOrderSource() {
        return shopOrderSource;
    }

    public void setShopOrderCreateTime(Date shopOrderCreateTime) {
        this.shopOrderCreateTime = shopOrderCreateTime;
    }

    public Date getShopOrderCreateTime() {
        return shopOrderCreateTime;
    }

    public void setPicker(String picker) {
        this.picker = picker;
    }

    public String getPicker() {
        return picker;
    }

    public void setPickerCall(String pickerCall) {
        this.pickerCall = pickerCall;
    }

    public String getPickerCall() {
        return pickerCall;
    }

    public void setPikerId(String pikerId) {
        this.pikerId = pikerId;
    }

    public String getPikerId() {
        return pikerId;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public String getPackType() {
        return packType;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setShopGoodsNo(String shopGoodsNo) {
        this.shopGoodsNo = shopGoodsNo;
    }

    public String getShopGoodsNo() {
        return shopGoodsNo;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getQty() {
        return qty;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public String getApiMethod() {
        return "jingdong.logistics.order.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("channels_seller_no", channelsSellerNo);
        pmap.put("channels_outbound_no", channelsOutboundNo);
        pmap.put("warehouse_no", warehouseNo);
        pmap.put("carriers_id", carriersId);
        pmap.put("expect_date", expectDate);
        pmap.put("order_no", orderNo);
        pmap.put("shop_no", shopNo);
        pmap.put("consignee_name", consigneeName);
        pmap.put("address_province", addressProvince);
        pmap.put("address_city", addressCity);
        pmap.put("address_county", addressCounty);
        pmap.put("address_town", addressTown);
        pmap.put("address", address);
        pmap.put("zip_code", zipCode);
        pmap.put("phone", phone);
        pmap.put("mobile", mobile);
        pmap.put("receivable", Float.valueOf(receivable));
        pmap.put("email", email);
        pmap.put("buyer_remark", buyerRemark);
        pmap.put("verify_remark", verifyRemark);
        pmap.put("return_consignee_address", returnConsigneeAddress);
        pmap.put("return_consignee_name", returnConsigneeName);
        pmap.put("return_consignee_phone", returnConsigneePhone);
        pmap.put("station_no", stationNo);
        pmap.put("station_name", stationName);
        pmap.put("order_mark", orderMark);
        pmap.put("shop_order_source", shopOrderSource);
        try {
            if (shopOrderCreateTime != null)
                pmap.put("shop_order_create_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(shopOrderCreateTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("picker", picker);
        pmap.put("picker_call", pickerCall);
        pmap.put("piker_id", pikerId);
        pmap.put("pack_type", packType);
        pmap.put("goods_no", goodsNo);
        pmap.put("sku_id", skuId);
        pmap.put("shopGoodsNo", shopGoodsNo);
        pmap.put("qty", qty);
        pmap.put("goods_status", goodsStatus);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOrderAddResponse.class;
    }

    private String channelsSellerNo;
    private String channelsOutboundNo;
    private String warehouseNo;
    private String carriersId;
    private String expectDate;
    private String orderNo;
    private String shopNo;
    private String consigneeName;
    private String addressProvince;
    private String addressCity;
    private String addressCounty;
    private String addressTown;
    private String address;
    private String zipCode;
    private String phone;
    private String mobile;
    private float receivable;
    private String email;
    private String buyerRemark;
    private String verifyRemark;
    private String returnConsigneeAddress;
    private String returnConsigneeName;
    private String returnConsigneePhone;
    private String stationNo;
    private String stationName;
    private String orderMark;
    private String shopOrderSource;
    private Date shopOrderCreateTime;
    private String picker;
    private String pickerCall;
    private String pikerId;
    private String packType;
    private String goodsNo;
    private String skuId;
    private String shopGoodsNo;
    private String qty;
    private String goodsStatus;
}
