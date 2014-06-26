// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePacksGetResponse.java

package com.jd.open.api.sdk.response.recommend;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.recommend:
//            PacksList

public class WarePacksGetResponse extends AbstractResponse {

    public WarePacksGetResponse() {
    }

    public void setPacksList(PacksList packsList) {
        this.packsList = packsList;
    }

    public PacksList getPacksList() {
        return packsList;
    }

    private PacksList packsList;
}
