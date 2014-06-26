// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SpaceInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class SpaceInfo
        implements Serializable {

    public SpaceInfo() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    public Long getPageId() {
        return pageId;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWidth() {
        return width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getStyle() {
        return style;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    private Long id;
    private String name;
    private String detail;
    private Long pageId;
    private Integer width;
    private Integer height;
    private Integer traffic;
    private Integer style;
    private Integer type;
    private Integer status;
}
