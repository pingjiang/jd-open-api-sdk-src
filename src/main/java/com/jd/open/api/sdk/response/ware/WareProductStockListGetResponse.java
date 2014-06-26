// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductStockListGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ProductStock

public class WareProductStockListGetResponse extends AbstractResponse {

    public WareProductStockListGetResponse() {
    }

    public void setProductStock(ProductStock productStock) {
        this.productStock = productStock;
    }

    public ProductStock getProductStock() {
        return productStock;
    }

    private ProductStock productStock;
}
