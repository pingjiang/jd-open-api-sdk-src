// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Log.java

package com.jd.open.api.sdk.internal.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            Logger, StdErrLog, LoggerLog, Loader

class Log {

    Log() {
    }

    public static boolean initialized() {
        if (LOG != null)
            return true;
        if (__initialized)
            return LOG != null;
        __initialized = true;
        try {
            Class log_class = Loader.loadClass(Log.class, __logClass);
            if (LOG == null || !LOG.getClass().equals(log_class)) {
                LOG = (Logger) log_class.newInstance();
                LOG.debug("Logging to {} via {}", new Object[]{
                        LOG, log_class.getName()
                });
            }
        } catch (Throwable e) {
            initStandardLogging(e);
        }
        return LOG != null;
    }

    private static void initStandardLogging(Throwable e) {
        if (e != null && __ignored)
            e.printStackTrace();
        if (LOG == null) {
            Class log_class = com.jd.open.api.sdk.internal.JSON.StdErrLog.class;
            LOG = new StdErrLog();
            LOG.debug("Logging to {} via {}", new Object[]{
                    LOG, log_class.getName()
            });
        }
    }

    public static void setLog(Logger log) {
        LOG = log;
    }

    /**
     * @deprecated Method getLog is deprecated
     */

    public static Logger getLog() {
        initialized();
        return LOG;
    }

    public static Logger getRootLogger() {
        initialized();
        return LOG;
    }

    static boolean isIgnored() {
        return __ignored;
    }

    public static void setLogToParent(String name) {
        ClassLoader loader = com.jd.open.api.sdk.internal.JSON.Log.class.getClassLoader();
        if (loader.getParent() != null)
            try {
                Class uberlog = loader.getParent().loadClass("org.eclipse.jetty.util.log.Log");
                Method getLogger = uberlog.getMethod("getLogger", new Class[]{
                        String.class
                });
                Object logger = getLogger.invoke(null, new Object[]{
                        name
                });
                setLog(new LoggerLog(logger));
            } catch (Exception e) {
                e.printStackTrace();
            }
        else
            setLog(getLogger(name));
    }

    /**
     * @deprecated Method debug is deprecated
     */

    public static void debug(Throwable th) {
        if (!isDebugEnabled()) {
            return;
        } else {
            LOG.debug("EXCEPTION ", th);
            return;
        }
    }

    /**
     * @deprecated Method debug is deprecated
     */

    public static void debug(String msg) {
        if (!initialized()) {
            return;
        } else {
            LOG.debug(msg, new Object[0]);
            return;
        }
    }

    /**
     * @deprecated Method debug is deprecated
     */

    public static void debug(String msg, Object arg) {
        if (!initialized()) {
            return;
        } else {
            LOG.debug(msg, new Object[]{
                    arg
            });
            return;
        }
    }

    /**
     * @deprecated Method debug is deprecated
     */

    public static void debug(String msg, Object arg0, Object arg1) {
        if (!initialized()) {
            return;
        } else {
            LOG.debug(msg, new Object[]{
                    arg0, arg1
            });
            return;
        }
    }

    /**
     * @deprecated Method ignore is deprecated
     */

    public static void ignore(Throwable thrown) {
        if (!initialized()) {
            return;
        } else {
            LOG.ignore(thrown);
            return;
        }
    }

    /**
     * @deprecated Method info is deprecated
     */

    public static void info(String msg) {
        if (!initialized()) {
            return;
        } else {
            LOG.info(msg, new Object[0]);
            return;
        }
    }

    /**
     * @deprecated Method info is deprecated
     */

    public static void info(String msg, Object arg) {
        if (!initialized()) {
            return;
        } else {
            LOG.info(msg, new Object[]{
                    arg
            });
            return;
        }
    }

    /**
     * @deprecated Method info is deprecated
     */

    public static void info(String msg, Object arg0, Object arg1) {
        if (!initialized()) {
            return;
        } else {
            LOG.info(msg, new Object[]{
                    arg0, arg1
            });
            return;
        }
    }

    /**
     * @deprecated Method isDebugEnabled is deprecated
     */

    public static boolean isDebugEnabled() {
        if (!initialized())
            return false;
        else
            return LOG.isDebugEnabled();
    }

    /**
     * @deprecated Method warn is deprecated
     */

    public static void warn(String msg) {
        if (!initialized()) {
            return;
        } else {
            LOG.warn(msg, new Object[0]);
            return;
        }
    }

    /**
     * @deprecated Method warn is deprecated
     */

    public static void warn(String msg, Object arg) {
        if (!initialized()) {
            return;
        } else {
            LOG.warn(msg, new Object[]{
                    arg
            });
            return;
        }
    }

    /**
     * @deprecated Method warn is deprecated
     */

    public static void warn(String msg, Object arg0, Object arg1) {
        if (!initialized()) {
            return;
        } else {
            LOG.warn(msg, new Object[]{
                    arg0, arg1
            });
            return;
        }
    }

    /**
     * @deprecated Method warn is deprecated
     */

    public static void warn(String msg, Throwable th) {
        if (!initialized()) {
            return;
        } else {
            LOG.warn(msg, th);
            return;
        }
    }

    /**
     * @deprecated Method warn is deprecated
     */

    public static void warn(Throwable th) {
        if (!initialized()) {
            return;
        } else {
            LOG.warn("EXCEPTION ", th);
            return;
        }
    }

    public static Logger getLogger(Class clazz) {
        return getLogger(clazz.getName());
    }

    public static Logger getLogger(String name) {
        if (!initialized())
            return null;
        if (name == null)
            return LOG;
        Logger logger = (Logger) __loggers.get(name);
        if (logger == null)
            logger = LOG.getLogger(name);
        return logger;
    }

    static ConcurrentMap getMutableLoggers() {
        return __loggers;
    }

    public static Map getLoggers() {
        return Collections.unmodifiableMap(__loggers);
    }

    public static final String EXCEPTION = "EXCEPTION ";
    public static final String IGNORED = "IGNORED ";
    protected static Properties __props = new Properties();
    public static String __logClass;
    public static boolean __ignored;
    private static final ConcurrentMap __loggers = new ConcurrentHashMap();
    private static Logger LOG;
    private static boolean __initialized;

    static {
        AccessController.doPrivileged(new PrivilegedAction() {

                                          public Object run() {
                                              URL testProps;
                                              InputStream in;
                                              testProps = com.jd.open.api.sdk.internal.JSON.Log.class.getClassLoader().getResource("jetty-logging.properties");

                                              in = null;
                                              try {
                                                  in = testProps.openStream();
                                                  Log.__props.load(in);
                                              } catch (IOException e) {
                                                  e.printStackTrace();
                                              } finally {
                                                  if (in != null) {
                                                      try {
                                                          in.close();
                                                      } catch (IOException e) {
                                                          e.printStackTrace();
                                                      }
                                                  }
                                              }

                                              Enumeration systemKeyEnum = System.getProperties().propertyNames();
                                              do {
                                                  if (!systemKeyEnum.hasMoreElements())
                                                      break;
                                                  String key = (String) systemKeyEnum.nextElement();
                                                  String val = System.getProperty(key);
                                                  if (val != null)
                                                      Log.__props.setProperty(key, val);
                                              } while (true);
                                              Log.__logClass = Log.__props.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
                                              Log.__ignored = Boolean.parseBoolean(Log.__props.getProperty("org.eclipse.jetty.util.log.IGNORED", "false"));
                                              return null;
                                          }

                                      }
        );
    }

}
