// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureIsreferencedRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureIsreferencedRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureIsreferencedRequest() {
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.isreferenced";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("picture_id", pictureId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureIsreferencedResponse.class;
    }

    private String pictureId;
}
