// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectWaitFetch.java

package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade:
//            PageWaitFetch

public class PublicResultObjectWaitFetch
        implements Serializable {

    public PublicResultObjectWaitFetch() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultErrorMsg(String resultErrorMsg) {
        this.resultErrorMsg = resultErrorMsg;
    }

    public String getResultErrorMsg() {
        return resultErrorMsg;
    }

    public void setWaitFetch(PageWaitFetch waitFetch) {
        this.waitFetch = waitFetch;
    }

    public PageWaitFetch getWaitFetch() {
        return waitFetch;
    }

    private Integer resultCode;
    private String resultErrorMsg;
    private PageWaitFetch waitFetch;
}
