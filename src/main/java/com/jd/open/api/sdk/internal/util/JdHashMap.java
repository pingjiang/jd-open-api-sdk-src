// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JdHashMap.java

package com.jd.open.api.sdk.internal.util;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.jd.open.api.sdk.internal.util:
//            StringUtil

public class JdHashMap extends HashMap {

    public JdHashMap() {
    }

    public JdHashMap(Map m) {
        super(m);
    }

    public String put(String key, String value) {
        if (StringUtil.areNotEmpty(new String[]{
                key, value
        }))
            return (String) super.put(key, value);
        else
            return null;
    }

    public Object put(Object x0, Object x1) {
        return put((String) x0, (String) x1);
    }

    private static final long serialVersionUID = 0x43b3c752L;
}
