// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureQueryRequest.java

package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureQueryRequest extends AbstractRequest
        implements JdRequest {

    public ImgzonePictureQueryRequest() {
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
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

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getApiMethod() {
        return "jingdong.imgzone.picture.query";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("picture_id", pictureId);
        pmap.put("picture_cate_id", pictureCateId);
        pmap.put("picture_name", pictureName);
        try {
            if (startDate != null)
                pmap.put("start_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(startDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (endDate != null)
                pmap.put("end_Date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(endDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("page_num", pageNum);
        pmap.put("page_size", pageSize);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.imgzone.ImgzonePictureQueryResponse.class;
    }

    private String pictureId;
    private Integer pictureCateId;
    private String pictureName;
    private Date startDate;
    private Date endDate;
    private Integer pageNum;
    private Integer pageSize;
}
