// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBookbigfieldGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareBookbigfieldGetResponse extends AbstractResponse {

    public WareBookbigfieldGetResponse() {
    }

    public void setBookBigFieldEntity(List BookBigFieldEntity) {
        this.BookBigFieldEntity = BookBigFieldEntity;
    }

    public List getBookBigFieldEntity() {
        return BookBigFieldEntity;
    }

    private List BookBigFieldEntity;
}
