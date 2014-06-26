// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductCatelogyListGetResponse.java

package com.jd.open.api.sdk.response.list;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.list:
//            ProductCatelogyList

public class WareProductCatelogyListGetResponse extends AbstractResponse {

    public WareProductCatelogyListGetResponse() {
    }

    public void setProductCatelogyList(ProductCatelogyList productCatelogyList) {
        this.productCatelogyList = productCatelogyList;
    }

    public ProductCatelogyList getProductCatelogyList() {
        return productCatelogyList;
    }

    private ProductCatelogyList productCatelogyList;
}
