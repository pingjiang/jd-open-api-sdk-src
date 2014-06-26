// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcReturnOrderListPageGetRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcReturnOrderListPageGetRequest extends AbstractRequest
        implements JdRequest {

    public VcReturnOrderListPageGetRequest() {
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Long getReturnId() {
        return returnId;
    }

    public void setFromDeliverCenterId(Integer fromDeliverCenterId) {
        this.fromDeliverCenterId = fromDeliverCenterId;
    }

    public Integer getFromDeliverCenterId() {
        return fromDeliverCenterId;
    }

    public void setReturnStates(String returnStates) {
        this.returnStates = returnStates;
    }

    public String getReturnStates() {
        return returnStates;
    }

    public void setCreateDateBegin(Date createDateBegin) {
        this.createDateBegin = createDateBegin;
    }

    public Date getCreateDateBegin() {
        return createDateBegin;
    }

    public void setCreateDateEnd(Date createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public Date getCreateDateEnd() {
        return createDateEnd;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public String getApiMethod() {
        return "jingdong.vc.return.order.list.page.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("returnId", returnId);
        pmap.put("fromDeliverCenterId", fromDeliverCenterId);
        pmap.put("returnStates", returnStates);
        try {
            if (createDateBegin != null)
                pmap.put("createDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(createDateBegin));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (createDateEnd != null)
                pmap.put("createDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(createDateEnd));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("pageSize", pageSize);
        pmap.put("pageIndex", pageIndex);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.VcReturnOrderListPageGetResponse.class;
    }

    private Long returnId;
    private Integer fromDeliverCenterId;
    private String returnStates;
    private Date createDateBegin;
    private Date createDateEnd;
    private Integer pageSize;
    private Integer pageIndex;
}
