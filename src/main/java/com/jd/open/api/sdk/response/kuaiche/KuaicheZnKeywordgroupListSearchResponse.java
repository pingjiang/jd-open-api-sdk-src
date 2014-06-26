// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnKeywordgroupListSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            KeywordQueryVO

public class KuaicheZnKeywordgroupListSearchResponse extends AbstractResponse {

    public KuaicheZnKeywordgroupListSearchResponse() {
    }

    public void setReturnInfo(KeywordQueryVO returnInfo) {
        this.returnInfo = returnInfo;
    }

    public KeywordQueryVO getReturnInfo() {
        return returnInfo;
    }

    private KeywordQueryVO returnInfo;
}
