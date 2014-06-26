// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JdHashMap;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;

public class WareUpdateRequest extends AbstractRequest
        implements JdRequest {

    public WareUpdateRequest() {
        isCanVAT = null;
        isImported = null;
        isHealthProduct = null;
        isSerialNo = null;
        isAppliancesCard = null;
        isSpecialWet = null;
    }

    public String getApiMethod() {
        return "360buy.ware.update";
    }

    public String getAppJsonParams()
            throws IOException {
        JdHashMap pmap = new JdHashMap();
        pmap.put("ware_id", wareId);
        pmap.put("trade_no", tradeNo);
        pmap.put("shop_category", shopCategory);
        pmap.put("title", title);
        pmap.put("upc_code", upcCode);
        pmap.put("item_num", itemNum);
        pmap.put("stock_num", stockNum);
        pmap.put("producter", producter);
        pmap.put("ware_location", wareLocation);
        pmap.put("option_type", optionType);
        pmap.put("length", length);
        pmap.put("wrap", wrap);
        pmap.put("wide", wide);
        pmap.put("high", high);
        pmap.put("weight", weight);
        pmap.put("cost_price", costPrice);
        pmap.put("market_price", marketPrice);
        pmap.put("jd_price", jdPrice);
        pmap.put("notes", notes);
        pmap.put("rate", rate);
        pmap.put("pack_listing", packListing);
        pmap.put("service", service);
        pmap.put("sku_properties", skuProperties);
        pmap.put("attributes", attributes);
        pmap.put("sku_prices", skuPrices);
        pmap.put("sku_stocks", skuStocks);
        pmap.put("outer_id", outerId);
        pmap.put("property_alias", propertyAlias);
        pmap.put("trade_no", tradeNo);
        pmap.put("input_pids", inputPids);
        pmap.put("input_strs", inputStrs);
        pmap.put("is_pay_first", isPayFirst);
        pmap.put("is_can_vat", isCanVAT);
        pmap.put("is_imported", isImported);
        pmap.put("is_health_product", isHealthProduct);
        pmap.put("shelf_life_days", shelfLifeDays);
        pmap.put("is_serial_no", isSerialNo);
        pmap.put("is_appliances_card", isAppliancesCard);
        pmap.put("is_special_wet", isSpecialWet);
        pmap.put("ware_big_small_model", wareBigSmallModel);
        pmap.put("ware_pack_type", warePackType);
        pmap.put("is_shelf_life", isShelfLife);
        pmap.put("has_check_code", hasCheckCode);
        pmap.put("ad_content", adContent);
        pmap.put("list_time", listTime);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareUpdateResponse.class;
    }

    public String getWareLocation() {
        return wareLocation;
    }

    public void setWareLocation(String wareLocation) {
        this.wareLocation = wareLocation;
    }

    public String getHasCheckCode() {
        return hasCheckCode;
    }

    public void setHasCheckCode(String hasCheckCode) {
        this.hasCheckCode = hasCheckCode;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }

    public String getListTime() {
        return listTime;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public String getInputPids() {
        return inputPids;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public String getInputStrs() {
        return inputStrs;
    }

    public void setInputStrs(String inputStrs) {
        this.inputStrs = inputStrs;
    }

    public String getShelfLife() {
        return isShelfLife;
    }

    public void setShelfLife(String shelfLife) {
        isShelfLife = shelfLife;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public String getWrap() {
        return wrap;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPackListing() {
        return packListing;
    }

    public void setPackListing(String packListing) {
        this.packListing = packListing;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public String getSkuPrices() {
        return skuPrices;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public String getSkuStocks() {
        return skuStocks;
    }

    public void setSkuStocks(String skuStocks) {
        this.skuStocks = skuStocks;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getPayFirst() {
        return isPayFirst;
    }

    public void setPayFirst(String payFirst) {
        isPayFirst = payFirst;
    }

    public String getCanVAT() {
        return isCanVAT;
    }

    public void setCanVAT(String canVAT) {
        isCanVAT = canVAT;
    }

    public String getImported() {
        return isImported;
    }

    public void setImported(String imported) {
        isImported = imported;
    }

    public String getHealthProduct() {
        return isHealthProduct;
    }

    public void setHealthProduct(String healthProduct) {
        isHealthProduct = healthProduct;
    }

    public String getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setShelfLifeDays(String shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }

    public String getSerialNo() {
        return isSerialNo;
    }

    public void setSerialNo(String serialNo) {
        isSerialNo = serialNo;
    }

    public String getAppliancesCard() {
        return isAppliancesCard;
    }

    public void setAppliancesCard(String appliancesCard) {
        isAppliancesCard = appliancesCard;
    }

    public String getSpecialWet() {
        return isSpecialWet;
    }

    public void setSpecialWet(String specialWet) {
        isSpecialWet = specialWet;
    }

    public String getWareBigSmallModel() {
        return wareBigSmallModel;
    }

    public void setWareBigSmallModel(String wareBigSmallModel) {
        this.wareBigSmallModel = wareBigSmallModel;
    }

    public String getWarePackType() {
        return warePackType;
    }

    public void setWarePackType(String warePackType) {
        this.warePackType = warePackType;
    }

    private String isPayFirst;
    private String isCanVAT;
    private String isImported;
    private String isHealthProduct;
    private String shelfLifeDays;
    private String isSerialNo;
    private String isAppliancesCard;
    private String isSpecialWet;
    private String wareBigSmallModel;
    private String warePackType;
    private String isShelfLife;
    private String wareId;
    private String shopCategory;
    private String title;
    private String upcCode;
    private String optionType;
    private String itemNum;
    private String stockNum;
    private String wareLocation;
    private String producter;
    private String wrap;
    private String length;
    private String wide;
    private String high;
    private String weight;
    private String costPrice;
    private String marketPrice;
    private String jdPrice;
    private String notes;
    private String rate;
    private String packListing;
    private String service;
    private String skuProperties;
    private String attributes;
    private String skuPrices;
    private String skuStocks;
    private String tradeNo;
    private String propertyAlias;
    private String outerId;
    private String inputPids;
    private String inputStrs;
    private String hasCheckCode;
    private String adContent;
    private String listTime;
}
