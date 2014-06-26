// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QuerySingleOrderForJosResultDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            QueryOrderForJosResultDto

public class QuerySingleOrderForJosResultDto
        implements Serializable {

    public QuerySingleOrderForJosResultDto() {
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setResultSingleDto(QueryOrderForJosResultDto resultSingleDto) {
        this.resultSingleDto = resultSingleDto;
    }

    public QueryOrderForJosResultDto getResultSingleDto() {
        return resultSingleDto;
    }

    private Integer status;
    private String message;
    private String code;
    private Integer recordCount;
    private QueryOrderForJosResultDto resultSingleDto;
}
