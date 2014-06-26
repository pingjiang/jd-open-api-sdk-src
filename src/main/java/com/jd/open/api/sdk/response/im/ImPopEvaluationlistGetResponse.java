// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopEvaluationlistGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopEvaluationlistGetResponse extends AbstractResponse {

    public ImPopEvaluationlistGetResponse() {
    }

    public void setEvaluation(List Evaluation) {
        this.Evaluation = Evaluation;
    }

    public List getEvaluation() {
        return Evaluation;
    }

    private List Evaluation;
}
