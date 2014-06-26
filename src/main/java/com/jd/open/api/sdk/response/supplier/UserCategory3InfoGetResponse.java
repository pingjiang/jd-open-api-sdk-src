// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserCategory3InfoGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            UserCategory3InfoDto

public class UserCategory3InfoGetResponse extends AbstractResponse {

    public UserCategory3InfoGetResponse() {
    }

    public void setUserCategory3Info(UserCategory3InfoDto userCategory3Info) {
        this.userCategory3Info = userCategory3Info;
    }

    public UserCategory3InfoDto getUserCategory3Info() {
        return userCategory3Info;
    }

    private UserCategory3InfoDto userCategory3Info;
}
