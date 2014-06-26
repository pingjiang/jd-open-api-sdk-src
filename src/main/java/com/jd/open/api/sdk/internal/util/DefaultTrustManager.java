// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DefaultTrustManager.java

package com.jd.open.api.sdk.internal.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class DefaultTrustManager
        implements X509TrustManager {

    public DefaultTrustManager() {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException {
    }
}
