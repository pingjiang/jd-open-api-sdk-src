// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Decoder.java

package com.jd.open.api.sdk.internal.util.codec;


// Referenced classes of package com.jd.open.api.sdk.internal.util.codec:
//            DecoderException

public interface Decoder {

    public abstract Object decode(Object obj)
            throws DecoderException;
}
