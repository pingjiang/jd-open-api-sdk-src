// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePromotionActivitywareListGetResponse.java

package com.jd.open.api.sdk.response.mobile;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mobile:
//            CmsActivityWareList

public class WarePromotionActivitywareListGetResponse extends AbstractResponse {

    public WarePromotionActivitywareListGetResponse() {
    }

    public void setCmsActivityWareList(CmsActivityWareList cmsActivityWareList) {
        this.cmsActivityWareList = cmsActivityWareList;
    }

    public CmsActivityWareList getCmsActivityWareList() {
        return cmsActivityWareList;
    }

    private CmsActivityWareList cmsActivityWareList;
}
