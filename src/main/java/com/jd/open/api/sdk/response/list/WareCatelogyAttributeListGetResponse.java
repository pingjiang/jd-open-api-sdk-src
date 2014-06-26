// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCatelogyAttributeListGetResponse.java

package com.jd.open.api.sdk.response.list;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.list:
//            CatelogyAttributeList

public class WareCatelogyAttributeListGetResponse extends AbstractResponse {

    public WareCatelogyAttributeListGetResponse() {
    }

    public void setCatelogyAttributeList(CatelogyAttributeList catelogyAttributeList) {
        this.catelogyAttributeList = catelogyAttributeList;
    }

    public CatelogyAttributeList getCatelogyAttributeList() {
        return catelogyAttributeList;
    }

    private CatelogyAttributeList catelogyAttributeList;
}
