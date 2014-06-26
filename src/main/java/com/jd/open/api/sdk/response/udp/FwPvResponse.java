// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FwPvResponse.java

package com.jd.open.api.sdk.response.udp;

import java.io.Serializable;

public class FwPvResponse
        implements Serializable {

    public FwPvResponse() {
    }

    public void setStat_dt(String stat_dt) {
        this.stat_dt = stat_dt;
    }

    public String getStat_dt() {
        return stat_dt;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getPv() {
        return pv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getUv() {
        return uv;
    }

    private String stat_dt;
    private String url;
    private Integer pv;
    private Integer uv;
}
