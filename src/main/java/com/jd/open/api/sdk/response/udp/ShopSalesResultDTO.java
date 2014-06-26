// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopSalesResultDTO.java

package com.jd.open.api.sdk.response.udp;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.udp:
//            ShopSalesResponse

public class ShopSalesResultDTO
        implements Serializable {

    public ShopSalesResultDTO() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setObj(ShopSalesResponse obj) {
        this.obj = obj;
    }

    public ShopSalesResponse getObj() {
        return obj;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    private String message;
    private ShopSalesResponse obj;
    private Long totalSize;
}
