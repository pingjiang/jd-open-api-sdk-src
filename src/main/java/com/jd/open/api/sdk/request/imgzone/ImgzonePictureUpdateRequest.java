// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureUpdateRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureUpdateRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureUpdateRequest() {
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureCateId(Integer pictureCateId) {
        this.pictureCateId = pictureCateId;
    }

    public Integer getPictureCateId() {
        return pictureCateId;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("picture_id", pictureId);
        pmap.put("picture_name", pictureName);
        pmap.put("picture_cate_id", pictureCateId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureUpdateResponse.class;
    }

    private String pictureId;
    private String pictureName;
    private Integer pictureCateId;
}
