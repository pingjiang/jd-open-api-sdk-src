// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryDeleteResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

public class EccCategoryDeleteResponse extends AbstractResponse {

    public EccCategoryDeleteResponse() {
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    private boolean isSuccess;
}
