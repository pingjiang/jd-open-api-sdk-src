// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BookEntity.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            BookInfo

public class BookEntity
        implements Serializable {

    public BookEntity() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    private Integer skuId;
    private BookInfo bookInfo;
}
