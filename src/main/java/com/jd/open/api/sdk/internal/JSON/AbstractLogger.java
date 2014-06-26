// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AbstractLogger.java

package com.jd.open.api.sdk.internal.JSON;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            Logger, Log

abstract class AbstractLogger
        implements Logger {

    AbstractLogger() {
    }

    public final Logger getLogger(String name) {
        if (isBlank(name))
            return this;
        String basename = getName();
        String fullname = !isBlank(basename) && Log.getRootLogger() != this ? (new StringBuilder()).append(basename).append(".").append(name).toString() : name;
        Logger logger = (Logger) Log.getLoggers().get(fullname);
        if (logger == null) {
            Logger newlog = newLogger(fullname);
            logger = (Logger) Log.getMutableLoggers().putIfAbsent(fullname, newlog);
            if (logger == null)
                logger = newlog;
        }
        return logger;
    }

    protected abstract Logger newLogger(String s);

    private static boolean isBlank(String name) {
        if (name == null)
            return true;
        int size = name.length();
        for (int i = 0; i < size; i++) {
            char c = name.charAt(i);
            if (!Character.isWhitespace(c))
                return false;
        }

        return true;
    }
}
