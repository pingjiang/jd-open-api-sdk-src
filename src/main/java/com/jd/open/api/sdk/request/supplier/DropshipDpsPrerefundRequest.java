// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsPrerefundRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsPrerefundRequest extends AbstractRequest
        implements JdRequest {

    public DropshipDpsPrerefundRequest() {
    }

    public void setCustomOrderId(Long customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Long getCustomOrderId() {
        return customOrderId;
    }

    public void setApprovalSuggestion(String approvalSuggestion) {
        this.approvalSuggestion = approvalSuggestion;
    }

    public String getApprovalSuggestion() {
        return approvalSuggestion;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setOperatorState(int operatorState) {
        this.operatorState = operatorState;
    }

    public int getOperatorState() {
        return operatorState;
    }

    public String getApiMethod() {
        return "jingdong.dropship.dps.prerefund";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("customOrderId", customOrderId);
        pmap.put("approvalSuggestion", approvalSuggestion);
        pmap.put("approvalState", approvalState);
        pmap.put("id", id);
        pmap.put("operatorState", Integer.valueOf(operatorState));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.DropshipDpsPrerefundResponse.class;
    }

    private Long customOrderId;
    private String approvalSuggestion;
    private String approvalState;
    private Long id;
    private int operatorState;
}
