// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LoggerLog.java

package com.jd.open.api.sdk.internal.JSON;

import java.lang.reflect.Method;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            AbstractLogger, Log, Logger

class LoggerLog extends AbstractLogger {

    public LoggerLog(Object logger) {
        try {
            _logger = logger;
            Class lc = logger.getClass();
            _debugMT = lc.getMethod("debug", new Class[]{
                    String.class, Throwable.class
            });
            _debugMAA = lc.getMethod("debug", new Class[]{
                    String.class, Object.class
            });
            _infoMT = lc.getMethod("info", new Class[]{
                    String.class, Throwable.class
            });
            _infoMAA = lc.getMethod("info", new Class[]{
                    String.class, Object.class
            });
            _warnMT = lc.getMethod("warn", new Class[]{
                    String.class, Throwable.class
            });
            _warnMAA = lc.getMethod("warn", new Class[]{
                    String.class, Object.class
            });
            Method _isDebugEnabled = lc.getMethod("isDebugEnabled", new Class[0]);
            _setDebugEnabledE = lc.getMethod("setDebugEnabled", new Class[]{
                    Boolean.TYPE
            });
            _getLoggerN = lc.getMethod("getLogger", new Class[]{
                    String.class
            });
            _getName = lc.getMethod("getName", new Class[0]);
            _debug = ((Boolean) _isDebugEnabled.invoke(_logger, new Object[0])).booleanValue();
        } catch (Exception x) {
            throw new IllegalStateException(x);
        }
    }

    public String getName() {
        try {
            return (String) _getName.invoke(_logger, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void warn(String msg, Object args[]) {
        try {
            _warnMAA.invoke(_logger, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void warn(Throwable thrown) {
        warn("", thrown);
    }

    public void warn(String msg, Throwable thrown) {
        try {
            _warnMT.invoke(_logger, new Object[]{
                    msg, thrown
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info(String msg, Object args[]) {
        try {
            _infoMAA.invoke(_logger, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void info(Throwable thrown) {
        info("", thrown);
    }

    public void info(String msg, Throwable thrown) {
        try {
            _infoMT.invoke(_logger, new Object[]{
                    msg, thrown
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDebugEnabled() {
        return _debug;
    }

    public void setDebugEnabled(boolean enabled) {
        try {
            _setDebugEnabledE.invoke(_logger, new Object[]{
                    Boolean.valueOf(enabled)
            });
            _debug = enabled;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void debug(String msg, Object args[]) {
        if (!_debug)
            return;
        try {
            _debugMAA.invoke(_logger, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void debug(Throwable thrown) {
        debug("", thrown);
    }

    public void debug(String msg, Throwable th) {
        if (!_debug)
            return;
        try {
            _debugMT.invoke(_logger, new Object[]{
                    msg, th
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ignore(Throwable ignored) {
        if (Log.isIgnored())
            warn("IGNORED ", ignored);
    }

    protected Logger newLogger(String fullname) {
        try {
            Object logger = _getLoggerN.invoke(_logger, new Object[]{
                    fullname
            });
            return new LoggerLog(logger);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    private final Object _logger;
    private final Method _debugMT;
    private final Method _debugMAA;
    private final Method _infoMT;
    private final Method _infoMAA;
    private final Method _warnMT;
    private final Method _warnMAA;
    private final Method _setDebugEnabledE;
    private final Method _getLoggerN;
    private final Method _getName;
    private volatile boolean _debug;
}
