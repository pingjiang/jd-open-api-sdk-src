// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSONEnumConvertor.java

package com.jd.open.api.sdk.internal.JSON;

import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            Loader, Logger, Log, JSON

public class JSONEnumConvertor
        implements JSON.Convertor {

    public JSONEnumConvertor() {
        this(false);
    }

    public JSONEnumConvertor(boolean fromJSON) {
        try {
            Class e = Loader.loadClass(getClass(), "java.lang.Enum");
            _valueOf = e.getMethod("valueOf", new Class[]{
                    Class.class, String.class
            });
        } catch (Exception e) {
            throw new RuntimeException("!Enums", e);
        }
        _fromJSON = fromJSON;
    }

    public Object fromJSON(Map map) {
        if (!_fromJSON)
            throw new UnsupportedOperationException();
        try {
            Class c = Loader.loadClass(getClass(), (String) map.get("class"));
            return _valueOf.invoke(null, new Object[]{
                    c, map.get("value")
            });
        } catch (Exception e) {
            LOG.warn(e);
        }
        return null;
    }

    public void toJSON(Object obj, JSON.Output out) {
        if (_fromJSON) {
            out.addClass(obj.getClass());
            out.add("value", obj.toString());
        } else {
            out.add(obj.toString());
        }
    }

    private static final Logger LOG = Log.getLogger(com.jd.open.api.sdk.internal.JSON.JSONEnumConvertor.class);
    private boolean _fromJSON;
    private Method _valueOf;

}
