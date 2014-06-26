// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QtArticleResult.java

package com.jd.open.api.sdk.domain.zhijian.QTArticleService;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.domain.zhijian.QTArticleService:
//            QTArticle

public class QtArticleResult
        implements Serializable {

    public QtArticleResult() {
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setRCode(String rCode) {
        this.rCode = rCode;
    }

    public String getRCode() {
        return rCode;
    }

    public void setRMsg(String rMsg) {
        this.rMsg = rMsg;
    }

    public String getRMsg() {
        return rMsg;
    }

    public void setQtArticle(QTArticle qtArticle) {
        this.qtArticle = qtArticle;
    }

    public QTArticle getQtArticle() {
        return qtArticle;
    }

    private Boolean success;
    private String rCode;
    private String rMsg;
    private QTArticle qtArticle;
}
