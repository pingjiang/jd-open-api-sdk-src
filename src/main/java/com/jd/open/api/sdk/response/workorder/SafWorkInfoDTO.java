// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafWorkInfoDTO.java

package com.jd.open.api.sdk.response.workorder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SafWorkInfoDTO
        implements Serializable {

    public SafWorkInfoDTO() {
    }

    public void setSendBiztypeId(Long sendBiztypeId) {
        this.sendBiztypeId = sendBiztypeId;
    }

    public Long getSendBiztypeId() {
        return sendBiztypeId;
    }

    public void setSendBiztypeName(String sendBiztypeName) {
        this.sendBiztypeName = sendBiztypeName;
    }

    public String getSendBiztypeName() {
        return sendBiztypeName;
    }

    public void setReplyBiztypeName(String replyBiztypeName) {
        this.replyBiztypeName = replyBiztypeName;
    }

    public String getReplyBiztypeName() {
        return replyBiztypeName;
    }

    public void setReplySubBiztypeName(String replySubBiztypeName) {
        this.replySubBiztypeName = replySubBiztypeName;
    }

    public String getReplySubBiztypeName() {
        return replySubBiztypeName;
    }

    public void setSantisfaction(String santisfaction) {
        this.santisfaction = santisfaction;
    }

    public String getSantisfaction() {
        return santisfaction;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setOperLogs(List operLogs) {
        this.operLogs = operLogs;
    }

    public List getOperLogs() {
        return operLogs;
    }

    private Long sendBiztypeId;
    private String sendBiztypeName;
    private String replyBiztypeName;
    private String replySubBiztypeName;
    private String santisfaction;
    private Date createDate;
    private List operLogs;
}
