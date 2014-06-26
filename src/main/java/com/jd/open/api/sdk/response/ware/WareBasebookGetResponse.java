// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBasebookGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareBasebookGetResponse extends AbstractResponse {

    public WareBasebookGetResponse() {
    }

    public void setBookEntity(List BookEntity) {
        this.BookEntity = BookEntity;
    }

    public List getBookEntity() {
        return BookEntity;
    }

    private List BookEntity;
}
