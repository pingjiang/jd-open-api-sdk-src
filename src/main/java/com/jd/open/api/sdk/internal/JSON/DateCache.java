// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DateCache.java

package com.jd.open.api.sdk.internal.JSON;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class DateCache {

    public DateCache() {
        this(DEFAULT_FORMAT);
        getFormat().setTimeZone(TimeZone.getDefault());
    }

    public DateCache(String format) {
        _lastMinutes = -1L;
        _lastSeconds = -1L;
        _lastMs = -1;
        _lastResult = null;
        _locale = null;
        _dfs = null;
        _formatString = format;
        setTimeZone(TimeZone.getDefault());
    }

    public DateCache(String format, Locale l) {
        _lastMinutes = -1L;
        _lastSeconds = -1L;
        _lastMs = -1;
        _lastResult = null;
        _locale = null;
        _dfs = null;
        _formatString = format;
        _locale = l;
        setTimeZone(TimeZone.getDefault());
    }

    public DateCache(String format, DateFormatSymbols s) {
        _lastMinutes = -1L;
        _lastSeconds = -1L;
        _lastMs = -1;
        _lastResult = null;
        _locale = null;
        _dfs = null;
        _formatString = format;
        _dfs = s;
        setTimeZone(TimeZone.getDefault());
    }

    public synchronized void setTimeZone(TimeZone tz) {
        setTzFormatString(tz);
        if (_locale != null) {
            _tzFormat = new SimpleDateFormat(_tzFormatString, _locale);
            _minFormat = new SimpleDateFormat(_minFormatString, _locale);
        } else if (_dfs != null) {
            _tzFormat = new SimpleDateFormat(_tzFormatString, _dfs);
            _minFormat = new SimpleDateFormat(_minFormatString, _dfs);
        } else {
            _tzFormat = new SimpleDateFormat(_tzFormatString);
            _minFormat = new SimpleDateFormat(_minFormatString);
        }
        _tzFormat.setTimeZone(tz);
        _minFormat.setTimeZone(tz);
        _lastSeconds = -1L;
        _lastMinutes = -1L;
    }

    public TimeZone getTimeZone() {
        return _tzFormat.getTimeZone();
    }

    public void setTimeZoneID(String timeZoneId) {
        setTimeZone(TimeZone.getTimeZone(timeZoneId));
    }

    private synchronized void setTzFormatString(TimeZone tz) {
        int zIndex = _formatString.indexOf("ZZZ");
        if (zIndex >= 0) {
            String ss1 = _formatString.substring(0, zIndex);
            String ss2 = _formatString.substring(zIndex + 3);
            int tzOffset = tz.getRawOffset();
            StringBuilder sb = new StringBuilder(_formatString.length() + 10);
            sb.append(ss1);
            sb.append("'");
            if (tzOffset >= 0) {
                sb.append('+');
            } else {
                tzOffset = -tzOffset;
                sb.append('-');
            }
            int raw = tzOffset / 60000;
            int hr = raw / 60;
            int min = raw % 60;
            if (hr < 10)
                sb.append('0');
            sb.append(hr);
            if (min < 10)
                sb.append('0');
            sb.append(min);
            sb.append('\'');
            sb.append(ss2);
            _tzFormatString = sb.toString();
        } else {
            _tzFormatString = _formatString;
        }
        setMinFormatString();
    }

    private void setMinFormatString() {
        int i = _tzFormatString.indexOf("ss.SSS");
        int l = 6;
        if (i >= 0) {
            throw new IllegalStateException("ms not supported");
        } else {
            i = _tzFormatString.indexOf("ss");
            l = 2;
            String ss1 = _tzFormatString.substring(0, i);
            String ss2 = _tzFormatString.substring(i + l);
            _minFormatString = (new StringBuilder()).append(ss1).append("'ss'").append(ss2).toString();
            return;
        }
    }

    public synchronized String format(Date inDate) {
        return format(inDate.getTime());
    }

    public synchronized String format(long inDate) {
        long seconds = inDate / 1000L;
        Date d;
        if (seconds < _lastSeconds || _lastSeconds > 0L && seconds > _lastSeconds + __hitWindow) {
            d = new Date(inDate);
            return _tzFormat.format(d);
        }
        if (_lastSeconds == seconds)
            return _lastResult;
        d = new Date(inDate);
        long minutes = seconds / 60L;
        if (_lastMinutes != minutes) {
            _lastMinutes = minutes;
            _secFormatString = _minFormat.format(d);
            int i = _secFormatString.indexOf("ss");
            int l = 2;
            _secFormatString0 = _secFormatString.substring(0, i);
            _secFormatString1 = _secFormatString.substring(i + l);
        }
        _lastSeconds = seconds;
        StringBuilder sb = new StringBuilder(_secFormatString.length());
        sb.append(_secFormatString0);
        int s = (int) (seconds % 60L);
        if (s < 10)
            sb.append('0');
        sb.append(s);
        sb.append(_secFormatString1);
        _lastResult = sb.toString();
        return _lastResult;
    }

    public void format(long inDate, StringBuilder buffer) {
        buffer.append(format(inDate));
    }

    public SimpleDateFormat getFormat() {
        return _minFormat;
    }

    public String getFormatString() {
        return _formatString;
    }

    public String now() {
        long now = System.currentTimeMillis();
        _lastMs = (int) (now % 1000L);
        return format(now);
    }

    public int lastMs() {
        return _lastMs;
    }

    public static String DEFAULT_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
    private static long __hitWindow = 3600L;
    private String _formatString;
    private String _tzFormatString;
    private SimpleDateFormat _tzFormat;
    private String _minFormatString;
    private SimpleDateFormat _minFormat;
    private String _secFormatString;
    private String _secFormatString0;
    private String _secFormatString1;
    private long _lastMinutes;
    private long _lastSeconds;
    private int _lastMs;
    private String _lastResult;
    private Locale _locale;
    private DateFormatSymbols _dfs;

}
