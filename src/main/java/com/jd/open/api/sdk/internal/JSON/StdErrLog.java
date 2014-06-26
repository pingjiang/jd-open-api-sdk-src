// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StdErrLog.java

package com.jd.open.api.sdk.internal.JSON;

import java.io.PrintStream;
import java.security.AccessControlException;
import java.util.Iterator;
import java.util.Properties;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            AbstractLogger, Logger, Log, DateCache

class StdErrLog extends AbstractLogger {

    public StdErrLog() {
        this(null);
    }

    public StdErrLog(String name) {
        this(name, __props);
    }

    public StdErrLog(String name, Properties props) {
        _level = 2;
        _stderr = null;
        _source = __source;
        _printLongNames = __long;
        _hideStacks = false;
        if (props != null && props != __props)
            __props.putAll(props);
        _name = name != null ? name : "";
        _abbrevname = condensePackageString(_name);
        _level = getLoggingLevel(props, _name);
        _configuredLevel = _level;
        try {
            _source = Boolean.parseBoolean(props.getProperty((new StringBuilder()).append(_name).append(".SOURCE").toString(), Boolean.toString(_source)));
        } catch (AccessControlException ace) {
            _source = __source;
        }
    }

    public static int getLoggingLevel(Properties props, String name) {
        for (String nameSegment = name; nameSegment != null && nameSegment.length() > 0; ) {
            String levelStr = props.getProperty((new StringBuilder()).append(nameSegment).append(".LEVEL").toString());
            int level = getLevelId((new StringBuilder()).append(nameSegment).append(".LEVEL").toString(), levelStr);
            if (level != -1)
                return level;
            int idx = nameSegment.lastIndexOf('.');
            if (idx >= 0)
                nameSegment = nameSegment.substring(0, idx);
            else
                nameSegment = null;
        }

        return getLevelId("log.LEVEL", props.getProperty("log.LEVEL", "INFO"));
    }

    protected static int getLevelId(String levelSegment, String levelName) {
        if (levelName == null)
            return -1;
        String levelStr = levelName.trim();
        if ("ALL".equalsIgnoreCase(levelStr))
            return 0;
        if ("DEBUG".equalsIgnoreCase(levelStr))
            return 1;
        if ("INFO".equalsIgnoreCase(levelStr))
            return 2;
        if ("WARN".equalsIgnoreCase(levelStr)) {
            return 3;
        } else {
            System.err.println((new StringBuilder()).append("Unknown StdErrLog level [").append(levelSegment).append("]=[").append(levelStr).append("], expecting only [ALL, DEBUG, INFO, WARN] as values.").toString());
            return -1;
        }
    }

    protected static String condensePackageString(String classname) {
        String parts[] = classname.split("\\.");
        StringBuilder dense = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++)
            dense.append(parts[i].charAt(0));

        if (dense.length() > 0)
            dense.append('.');
        dense.append(parts[parts.length - 1]);
        return dense.toString();
    }

    public String getName() {
        return _name;
    }

    public void setPrintLongNames(boolean printLongNames) {
        _printLongNames = printLongNames;
    }

    public boolean isPrintLongNames() {
        return _printLongNames;
    }

    public boolean isHideStacks() {
        return _hideStacks;
    }

    public void setHideStacks(boolean hideStacks) {
        _hideStacks = hideStacks;
    }

    public boolean isSource() {
        return _source;
    }

    public void setSource(boolean source) {
        _source = source;
    }

    public void warn(String msg, Object args[]) {
        if (_level <= 3) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":WARN:", msg, args);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    public void warn(Throwable thrown) {
        warn("", thrown);
    }

    public void warn(String msg, Throwable thrown) {
        if (_level <= 3) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":WARN:", msg, thrown);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    public void info(String msg, Object args[]) {
        if (_level <= 2) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":INFO:", msg, args);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    public void info(Throwable thrown) {
        info("", thrown);
    }

    public void info(String msg, Throwable thrown) {
        if (_level <= 2) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":INFO:", msg, thrown);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    public boolean isDebugEnabled() {
        return _level <= 1;
    }

    public void setDebugEnabled(boolean enabled) {
        if (enabled) {
            _level = 1;
            Iterator i$ = Log.getLoggers().values().iterator();
            do {
                if (!i$.hasNext())
                    break;
                Logger log = (Logger) i$.next();
                if (log instanceof StdErrLog)
                    ((StdErrLog) log).setLevel(1);
            } while (true);
        } else {
            _level = _configuredLevel;
            Iterator i$ = Log.getLoggers().values().iterator();
            do {
                if (!i$.hasNext())
                    break;
                Logger log = (Logger) i$.next();
                if (log instanceof StdErrLog)
                    ((StdErrLog) log).setLevel(((StdErrLog) log)._configuredLevel);
            } while (true);
        }
    }

    public int getLevel() {
        return _level;
    }

    public void setLevel(int level) {
        _level = level;
    }

    public void setStdErrStream(PrintStream stream) {
        _stderr = stream != System.err ? stream : null;
    }

    public void debug(String msg, Object args[]) {
        if (_level <= 1) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":DBUG:", msg, args);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    public void debug(Throwable thrown) {
        debug("", thrown);
    }

    public void debug(String msg, Throwable thrown) {
        if (_level <= 1) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":DBUG:", msg, thrown);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    private void format(StringBuilder buffer, String level, String msg, Object args[]) {
        String d = _dateCache.now();
        int ms = _dateCache.lastMs();
        tag(buffer, d, ms, level);
        format(buffer, msg, args);
    }

    private void format(StringBuilder buffer, String level, String msg, Throwable thrown) {
        format(buffer, level, msg, new Object[0]);
        if (isHideStacks())
            format(buffer, String.valueOf(thrown), new Object[0]);
        else
            format(buffer, thrown);
    }

    private void tag(StringBuilder buffer, String d, int ms, String tag) {
        buffer.setLength(0);
        buffer.append(d);
        if (ms > 99)
            buffer.append('.');
        else if (ms > 9)
            buffer.append(".0");
        else
            buffer.append(".00");
        buffer.append(ms).append(tag);
        if (_printLongNames)
            buffer.append(_name);
        else
            buffer.append(_abbrevname);
        buffer.append(':');
        if (_source) {
            Throwable source = new Throwable();
            StackTraceElement frames[] = source.getStackTrace();
            int i = 0;
            do {
                if (i >= frames.length)
                    break;
                StackTraceElement frame = frames[i];
                String clazz = frame.getClassName();
                if (!clazz.equals(com.jd.open.api.sdk.internal.JSON.StdErrLog.class.getName()) && !clazz.equals(com.jd.open.api.sdk.internal.JSON.Log.class.getName())) {
                    if (!_printLongNames && clazz.startsWith("org.eclipse.jetty."))
                        buffer.append(condensePackageString(clazz));
                    else
                        buffer.append(clazz);
                    buffer.append('#').append(frame.getMethodName());
                    if (frame.getFileName() != null)
                        buffer.append('(').append(frame.getFileName()).append(':').append(frame.getLineNumber()).append(')');
                    buffer.append(':');
                    break;
                }
                i++;
            } while (true);
        }
    }

    private void format(StringBuilder builder, String msg, Object args[]) {
        if (msg == null) {
            msg = "";
            for (int i = 0; i < args.length; i++)
                msg = (new StringBuilder()).append(msg).append("{} ").toString();

        }
        String braces = "{}";
        int start = 0;
        Object arr$[] = args;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; i$++) {
            Object arg = arr$[i$];
            int bracesIndex = msg.indexOf(braces, start);
            if (bracesIndex < 0) {
                escape(builder, msg.substring(start));
                builder.append(" ");
                builder.append(arg);
                start = msg.length();
            } else {
                escape(builder, msg.substring(start, bracesIndex));
                builder.append(String.valueOf(arg));
                start = bracesIndex + braces.length();
            }
        }

        escape(builder, msg.substring(start));
    }

    private void escape(StringBuilder builder, String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isISOControl(c)) {
                if (c == '\n') {
                    builder.append('|');
                    continue;
                }
                if (c == '\r')
                    builder.append('<');
                else
                    builder.append('?');
            } else {
                builder.append(c);
            }
        }

    }

    private void format(StringBuilder buffer, Throwable thrown) {
        if (thrown == null) {
            buffer.append("null");
        } else {
            buffer.append(EOL);
            format(buffer, thrown.toString(), new Object[0]);
            StackTraceElement elements[] = thrown.getStackTrace();
            for (int i = 0; elements != null && i < elements.length; i++) {
                buffer.append(EOL).append("\tat ");
                format(buffer, elements[i].toString(), new Object[0]);
            }

            Throwable cause = thrown.getCause();
            if (cause != null && cause != thrown) {
                buffer.append(EOL).append("Caused by: ");
                format(buffer, cause);
            }
        }
    }

    protected Logger newLogger(String fullname) {
        StdErrLog logger = new StdErrLog(fullname);
        logger.setPrintLongNames(_printLongNames);
        logger.setSource(_source);
        logger._stderr = _stderr;
        return logger;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("StdErrLog:");
        s.append(_name);
        s.append(":LEVEL=");
        switch (_level) {
            case 0: // '\0'
                s.append("ALL");
                break;

            case 1: // '\001'
                s.append("DEBUG");
                break;

            case 2: // '\002'
                s.append("INFO");
                break;

            case 3: // '\003'
                s.append("WARN");
                break;

            default:
                s.append("?");
                break;
        }
        return s.toString();
    }

    public static void setProperties(Properties props) {
        __props.clear();
        __props.putAll(props);
    }

    public void ignore(Throwable ignored) {
        if (_level <= 0) {
            StringBuilder buffer = new StringBuilder(64);
            format(buffer, ":IGNORED:", "", ignored);
            (_stderr != null ? _stderr : System.err).println(buffer);
        }
    }

    private static final String EOL = System.getProperty("line.separator");
    private static DateCache _dateCache;
    private static final Properties __props;
    private static final boolean __source;
    private static final boolean __long;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_WARN = 3;
    private int _level;
    private int _configuredLevel;
    private PrintStream _stderr;
    private boolean _source;
    private boolean _printLongNames;
    private final String _name;
    private final String _abbrevname;
    private boolean _hideStacks;

    static {
        __props = new Properties();
        __source = Boolean.parseBoolean(Log.__props.getProperty("org.eclipse.jetty.util.log.SOURCE", Log.__props.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", "false")));
        __long = Boolean.parseBoolean(Log.__props.getProperty("org.eclipse.jetty.util.log.stderr.LONG", "false"));
        __props.putAll(Log.__props);
        String deprecatedProperties[] = {
                "DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"
        };
        String arr$[] = deprecatedProperties;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; i$++) {
            String deprecatedProp = arr$[i$];
            if (System.getProperty(deprecatedProp) != null)
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", new Object[]{
                        deprecatedProp
                });
        }

        try {
            _dateCache = new DateCache("yyyy-MM-dd HH:mm:ss");
        } catch (Exception x) {
            x.printStackTrace(System.err);
        }
    }
}
