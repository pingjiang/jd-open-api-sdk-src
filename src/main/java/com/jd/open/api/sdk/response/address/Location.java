// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Location.java

package com.jd.open.api.sdk.response.address;

import java.io.Serializable;

public class Location
        implements Serializable {

    public Location() {
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCommunity() {
        return community;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getRoad() {
        return road;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    private String country;
    private String province;
    private String city;
    private String district;
    private String subdistrict;
    private String community;
    private String road;
    private String desc;
}
