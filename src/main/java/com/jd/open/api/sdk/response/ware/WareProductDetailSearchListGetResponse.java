// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductDetailSearchListGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ProductDetailList

public class WareProductDetailSearchListGetResponse extends AbstractResponse {

    public WareProductDetailSearchListGetResponse() {
    }

    public void setProductDetailList(ProductDetailList productDetailList) {
        this.productDetailList = productDetailList;
    }

    public ProductDetailList getProductDetailList() {
        return productDetailList;
    }

    private ProductDetailList productDetailList;
}
