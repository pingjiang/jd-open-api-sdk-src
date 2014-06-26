// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VatInvoiceInfo.java

package com.jd.open.api.sdk.domain.order;


public class VatInvoiceInfo {

    public VatInvoiceInfo() {
    }

    public String getTaxpayerIdent() {
        return taxpayerIdent;
    }

    public void setTaxpayerIdent(String taxpayerIdent) {
        this.taxpayerIdent = taxpayerIdent;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredPhone() {
        return registeredPhone;
    }

    public void setRegisteredPhone(String registeredPhone) {
        this.registeredPhone = registeredPhone;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    private String taxpayerIdent;
    private String registeredAddress;
    private String registeredPhone;
    private String depositBank;
    private String bankAccount;
}
