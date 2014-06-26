// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GetResultInfoDTO.java

package com.jd.open.api.sdk.domain.delivery.OrderInfoJosService;

import java.io.Serializable;
import java.util.List;

public class GetResultInfoDTO
        implements Serializable {

    public GetResultInfoDTO() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setDeliveryIdList(List deliveryIdList) {
        this.deliveryIdList = deliveryIdList;
    }

    public List getDeliveryIdList() {
        return deliveryIdList;
    }

    private String code;
    private String message;
    private List deliveryIdList;
}
