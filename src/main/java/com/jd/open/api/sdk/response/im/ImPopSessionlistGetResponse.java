// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopSessionlistGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopSessionlistGetResponse extends AbstractResponse {

    public ImPopSessionlistGetResponse() {
    }

    public void setChatSession(List ChatSession) {
        this.ChatSession = ChatSession;
    }

    public List getChatSession() {
        return ChatSession;
    }

    private List ChatSession;
}
