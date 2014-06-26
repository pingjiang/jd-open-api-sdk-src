// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductbigfieldGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class WareProductbigfieldGetResponse extends AbstractResponse {

    public WareProductbigfieldGetResponse() {
    }

    public void setShouHou(String shouHou) {
        this.shouHou = shouHou;
    }

    public String getShouHou() {
        return shouHou;
    }

    public void setWdis(String wdis) {
        this.wdis = wdis;
    }

    public String getWdis() {
        return wdis;
    }

    public void setPropCode(String propCode) {
        this.propCode = propCode;
    }

    public String getPropCode() {
        return propCode;
    }

    public void setWareQd(String wareQd) {
        this.wareQd = wareQd;
    }

    public String getWareQd() {
        return wareQd;
    }

    private String shouHou;
    private String wdis;
    private String propCode;
    private String wareQd;
}
