// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryAddResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.request.category.CategoryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccCategoryAddResponse extends AbstractResponse {

    public EccCategoryAddResponse() {
    }

    public CategoryResult getCategoryResult() {
        return categoryResult;
    }

    public void setCategoryResult(CategoryResult categoryResult) {
        this.categoryResult = categoryResult;
    }

    private CategoryResult categoryResult;
}
