// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureDeleteRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureDeleteRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureDeleteRequest() {
    }

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    public String getPictureIds() {
        return pictureIds;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.delete";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("picture_ids", pictureIds);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureDeleteResponse.class;
    }

    private String pictureIds;
}
