// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureUploadRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureUploadRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureUploadRequest() {
    }

    public void setImageData(byte imageData[]) {
        this.imageData = imageData;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setPictureCateId(Integer pictureCateId) {
        this.pictureCateId = pictureCateId;
    }

    public Integer getPictureCateId() {
        return pictureCateId;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.upload";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("image_data", imageData);
        pmap.put("picture_cate_id", pictureCateId);
        pmap.put("picture_name", pictureName);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureUploadResponse.class;
    }

    private byte imageData[];
    private Integer pictureCateId;
    private String pictureName;
}
