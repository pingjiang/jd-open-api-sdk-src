// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChatLogPage.java

package com.jd.open.api.sdk.domain.im.ApiService;

import java.io.Serializable;
import java.util.List;

public class ChatLogPage
        implements Serializable {

    public ChatLogPage() {
    }

    public void setChatList(List chatList) {
        this.chatList = chatList;
    }

    public List getChatList() {
        return chatList;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    private List chatList;
    private int totalRecord;
}
