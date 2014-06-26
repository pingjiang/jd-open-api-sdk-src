// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BookBigFieldEntity.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            BookBigFieldInfo

public class BookBigFieldEntity
        implements Serializable {

    public BookBigFieldEntity() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setFirstClassId(Integer firstClassId) {
        this.firstClassId = firstClassId;
    }

    public Integer getFirstClassId() {
        return firstClassId;
    }

    public void setBookBigFieldInfo(BookBigFieldInfo bookBigFieldInfo) {
        this.bookBigFieldInfo = bookBigFieldInfo;
    }

    public BookBigFieldInfo getBookBigFieldInfo() {
        return bookBigFieldInfo;
    }

    private Integer skuId;
    private Integer firstClassId;
    private BookBigFieldInfo bookBigFieldInfo;
}
