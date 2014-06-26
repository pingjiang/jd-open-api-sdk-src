// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopDetailJos.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class PopDetailJos
        implements Serializable {

    public PopDetailJos() {
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderContact(String venderContact) {
        this.venderContact = venderContact;
    }

    public String getVenderContact() {
        return venderContact;
    }

    public void setVenderTel(String venderTel) {
        this.venderTel = venderTel;
    }

    public String getVenderTel() {
        return venderTel;
    }

    public void setVenderFax(String venderFax) {
        this.venderFax = venderFax;
    }

    public String getVenderFax() {
        return venderFax;
    }

    public void setVenderQq(String venderQq) {
        this.venderQq = venderQq;
    }

    public String getVenderQq() {
        return venderQq;
    }

    public void setVenderMsn(String venderMsn) {
        this.venderMsn = venderMsn;
    }

    public String getVenderMsn() {
        return venderMsn;
    }

    public void setVenderEmail(String venderEmail) {
        this.venderEmail = venderEmail;
    }

    public String getVenderEmail() {
        return venderEmail;
    }

    public void setVenderAreacode(String venderAreacode) {
        this.venderAreacode = venderAreacode;
    }

    public String getVenderAreacode() {
        return venderAreacode;
    }

    public void setVenderStreet(String venderStreet) {
        this.venderStreet = venderStreet;
    }

    public String getVenderStreet() {
        return venderStreet;
    }

    public void setVenderCellphone(String venderCellphone) {
        this.venderCellphone = venderCellphone;
    }

    public String getVenderCellphone() {
        return venderCellphone;
    }

    private int resultCode;
    private String resultDescription;
    private String venderName;
    private String venderContact;
    private String venderTel;
    private String venderFax;
    private String venderQq;
    private String venderMsn;
    private String venderEmail;
    private String venderAreacode;
    private String venderStreet;
    private String venderCellphone;
}
