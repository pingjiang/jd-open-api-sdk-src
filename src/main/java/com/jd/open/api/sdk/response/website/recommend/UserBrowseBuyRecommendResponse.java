// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserBrowseBuyRecommendResponse.java

package com.jd.open.api.sdk.response.website.recommend;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class UserBrowseBuyRecommendResponse extends AbstractResponse {

    public UserBrowseBuyRecommendResponse() {
    }

    public List getFavoriteWares() {
        return favoriteWares;
    }

    public void setFavoriteWares(List favoriteWares) {
        this.favoriteWares = favoriteWares;
    }

    private List favoriteWares;
}
