// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Logger.java

package com.jd.open.api.sdk.internal.JSON;


interface Logger {

    public abstract String getName();

    public abstract void warn(String s, Object aobj[]);

    public abstract void warn(Throwable throwable);

    public abstract void warn(String s, Throwable throwable);

    public abstract void info(String s, Object aobj[]);

    public abstract void info(Throwable throwable);

    public abstract void info(String s, Throwable throwable);

    public abstract boolean isDebugEnabled();

    public abstract void setDebugEnabled(boolean flag);

    public abstract void debug(String s, Object aobj[]);

    public abstract void debug(Throwable throwable);

    public abstract void debug(String s, Throwable throwable);

    public abstract Logger getLogger(String s);

    public abstract void ignore(Throwable throwable);
}
