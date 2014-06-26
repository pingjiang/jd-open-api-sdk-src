// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccUserSearchResponse.java

package com.jd.open.api.sdk.response.user;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.user:
//            UserPagingResult

public class EccUserSearchResponse extends AbstractResponse {

    public EccUserSearchResponse() {
    }

    public void setUserPagingResult(UserPagingResult userPagingResult) {
        this.userPagingResult = userPagingResult;
    }

    public UserPagingResult getUserPagingResult() {
        return userPagingResult;
    }

    private UserPagingResult userPagingResult;
}
