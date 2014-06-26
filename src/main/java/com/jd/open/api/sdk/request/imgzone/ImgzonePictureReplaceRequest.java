// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureReplaceRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureReplaceRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureReplaceRequest() {
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setImageData(byte imageData[]) {
        this.imageData = imageData;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.replace";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("picture_id", pictureId);
        pmap.put("image_data", imageData);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureReplaceResponse.class;
    }

    private String pictureId;
    private byte imageData[];
}
