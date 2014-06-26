// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrintResult.java

package com.jd.open.api.sdk.domain.order;

import com.jd.open.api.sdk.internal.util.codec.Base64;
import com.jd.open.api.sdk.response.AbstractResponse;

public final class PrintResult extends AbstractResponse {

    public PrintResult() {
    }

    private String getHtmlContent_base64() {
        return htmlContent_base64;
    }

    private void setHtmlContent_base64(String htmlContent_base64) {
        this.htmlContent_base64 = htmlContent_base64;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public String getHtmlContent() {
        String hc = new String(Base64.decodeBase64(htmlContent_base64.getBytes()));
        return hc;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    private static final long serialVersionUID = 0x385dd40L;
    private String htmlContent;
    private String htmlContent_base64;
    private String imageData;
}
