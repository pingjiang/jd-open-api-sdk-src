// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionActivitymodeGetResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.marketing:
//            ActivityModeVO

public class SellerPromotionActivitymodeGetResponse extends AbstractResponse {

    public SellerPromotionActivitymodeGetResponse() {
    }

    public void setActivityMode(ActivityModeVO activityMode) {
        this.activityMode = activityMode;
    }

    public ActivityModeVO getActivityMode() {
        return activityMode;
    }

    private ActivityModeVO activityMode;
}
