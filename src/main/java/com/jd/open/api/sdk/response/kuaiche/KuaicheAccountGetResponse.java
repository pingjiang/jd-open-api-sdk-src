// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheAccountGetResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.domain.kuaiche.AccountJosService.AccountVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class KuaicheAccountGetResponse extends AbstractResponse {

    public KuaicheAccountGetResponse() {
    }

    public void setAccount(AccountVO account) {
        this.account = account;
    }

    public AccountVO getAccount() {
        return account;
    }

    private AccountVO account;
}
