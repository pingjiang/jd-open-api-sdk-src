// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSONDateConvertor.java

package com.jd.open.api.sdk.internal.JSON;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            DateCache, Logger, Log, JSON

public class JSONDateConvertor
        implements JSON.Convertor {

    public JSONDateConvertor() {
        this(false);
    }

    public JSONDateConvertor(boolean fromJSON) {
        this(DateCache.DEFAULT_FORMAT, TimeZone.getTimeZone("GMT"), fromJSON);
    }

    public JSONDateConvertor(String format, TimeZone zone, boolean fromJSON) {
        _dateCache = new DateCache(format);
        _dateCache.setTimeZone(zone);
        _fromJSON = fromJSON;
        _format = new SimpleDateFormat(format);
        _format.setTimeZone(zone);
    }

    public JSONDateConvertor(String format, TimeZone zone, boolean fromJSON, Locale locale) {
        _dateCache = new DateCache(format, locale);
        _dateCache.setTimeZone(zone);
        _fromJSON = fromJSON;
        _format = new SimpleDateFormat(format, new DateFormatSymbols(locale));
        _format.setTimeZone(zone);
    }

    public Object fromJSON(Map map) {
        if (!_fromJSON)
            throw new UnsupportedOperationException();
        SimpleDateFormat simpledateformat = _format;
        try {
            return _format.parseObject((String) map.get("value"));
        } catch (ParseException e) {
            LOG.warn(e);
        }

        return null;
    }

    public void toJSON(Object obj, JSON.Output out) {
        String date = _dateCache.format((Date) obj);
        if (_fromJSON) {
            out.addClass(obj.getClass());
            out.add("value", date);
        } else {
            out.add(date);
        }
    }

    private static final Logger LOG = Log.getLogger(com.jd.open.api.sdk.internal.JSON.JSONDateConvertor.class);
    private boolean _fromJSON;
    DateCache _dateCache;
    SimpleDateFormat _format;

}
