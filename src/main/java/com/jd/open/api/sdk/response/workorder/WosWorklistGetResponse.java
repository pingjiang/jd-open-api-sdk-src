// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WosWorklistGetResponse.java

package com.jd.open.api.sdk.response.workorder;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.workorder:
//            SafWorkPage

public class WosWorklistGetResponse extends AbstractResponse {

    public WosWorklistGetResponse() {
    }

    public void setPage(SafWorkPage page) {
        this.page = page;
    }

    public SafWorkPage getPage() {
        return page;
    }

    private SafWorkPage page;
}
