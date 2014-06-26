// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSONPojoConvertorFactory.java

package com.jd.open.api.sdk.internal.JSON;

import java.util.Map;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            JSON, JSONPojoConvertor, Loader, Logger

public class JSONPojoConvertorFactory
        implements JSON.Convertor {

    public JSONPojoConvertorFactory(JSON json) {
        if (json == null) {
            throw new IllegalArgumentException();
        } else {
            _json = json;
            _fromJson = true;
            return;
        }
    }

    public JSONPojoConvertorFactory(JSON json, boolean fromJSON) {
        if (json == null) {
            throw new IllegalArgumentException();
        } else {
            _json = json;
            _fromJson = fromJSON;
            return;
        }
    }

    public void toJSON(Object obj, JSON.Output out) {
        String clsName = obj.getClass().getName();
        JSON.Convertor convertor = _json.getConvertorFor(clsName);
        if (convertor == null)
            try {
                Class cls = Loader.loadClass(com.jd.open.api.sdk.internal.JSON.JSON.class, clsName);
                convertor = new JSONPojoConvertor(cls, _fromJson);
                _json.addConvertorFor(clsName, convertor);
            } catch (ClassNotFoundException e) {
                JSON.LOG.warn(e);
            }
        if (convertor != null)
            convertor.toJSON(obj, out);
    }

    public Object fromJSON(Map object) {
        Map map = object;
        String clsName = (String) map.get("class");
        if (clsName != null) {
            JSON.Convertor convertor = _json.getConvertorFor(clsName);
            if (convertor == null)
                try {
                    Class cls = Loader.loadClass(com.jd.open.api.sdk.internal.JSON.JSON.class, clsName);
                    convertor = new JSONPojoConvertor(cls, _fromJson);
                    _json.addConvertorFor(clsName, convertor);
                } catch (ClassNotFoundException e) {
                    JSON.LOG.warn(e);
                }
            if (convertor != null)
                return convertor.fromJSON(object);
        }
        return map;
    }

    private final JSON _json;
    private final boolean _fromJson;
}
