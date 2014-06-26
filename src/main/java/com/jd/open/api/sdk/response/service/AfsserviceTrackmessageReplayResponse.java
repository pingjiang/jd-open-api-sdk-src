// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceTrackmessageReplayResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.TrackMessageReplyResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceTrackmessageReplayResponse extends AbstractResponse {

    public AfsserviceTrackmessageReplayResponse() {
    }

    public void setTrackMessageReplyResult(TrackMessageReplyResult trackMessageReplyResult) {
        this.trackMessageReplyResult = trackMessageReplyResult;
    }

    public TrackMessageReplyResult getTrackMessageReplyResult() {
        return trackMessageReplyResult;
    }

    private TrackMessageReplyResult trackMessageReplyResult;
}
