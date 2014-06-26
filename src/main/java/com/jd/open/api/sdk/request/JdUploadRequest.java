// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JdUploadRequest.java

package com.jd.open.api.sdk.request;

import java.util.Map;

// Referenced classes of package com.jd.open.api.sdk.request:
//            JdRequest

public interface JdUploadRequest
        extends JdRequest {

    public abstract Map getFileParams();
}
