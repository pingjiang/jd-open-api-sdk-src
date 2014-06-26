// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSONObjectConvertor.java

package com.jd.open.api.sdk.internal.JSON;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            JSON

public class JSONObjectConvertor
        implements JSON.Convertor {

    public JSONObjectConvertor() {
        _excluded = null;
        _fromJSON = false;
    }

    public JSONObjectConvertor(boolean fromJSON) {
        _excluded = null;
        _fromJSON = fromJSON;
    }

    public JSONObjectConvertor(boolean fromJSON, String excluded[]) {
        _excluded = null;
        _fromJSON = fromJSON;
        if (excluded != null)
            _excluded = new HashSet(Arrays.asList(excluded));
    }

    public Object fromJSON(Map map) {
        if (_fromJSON)
            throw new UnsupportedOperationException();
        else
            return map;
    }

    public void toJSON(Object obj, JSON.Output out) {
        Class c = obj.getClass();
        if (_fromJSON)
            out.addClass(obj.getClass());
        Method methods[] = obj.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            if (Modifier.isStatic(m.getModifiers()) || m.getParameterTypes().length != 0 || m.getReturnType() == null || m.getDeclaringClass() == Object.class) {
                continue;
            }

            String name = m.getName();
            if (!name.startsWith("is")) {
                name = (new StringBuilder()).append(name.substring(2, 3).toLowerCase()).append(name.substring(3)).toString();
            } else if (!name.startsWith("get")) {
                name = (new StringBuilder()).append(name.substring(3, 4).toLowerCase()).append(name.substring(4)).toString();
            }

            if (includeField(name, obj, m)) {
                try {
                    out.add(name, m.invoke(obj, (Object[]) null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    protected boolean includeField(String name, Object o, Method m) {
        return _excluded == null || !_excluded.contains(name);
    }

    private boolean _fromJSON;
    private Set _excluded;
}
