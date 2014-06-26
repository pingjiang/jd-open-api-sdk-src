// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductDetailList.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ProductInfo

public class ProductDetailList
        implements Serializable {

    public ProductDetailList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setImagePathsList(List imagePathsList) {
        this.imagePathsList = imagePathsList;
    }

    public List getImagePathsList() {
        return imagePathsList;
    }

    private Integer resultCode;
    private ProductInfo productInfo;
    private List imagePathsList;
}
