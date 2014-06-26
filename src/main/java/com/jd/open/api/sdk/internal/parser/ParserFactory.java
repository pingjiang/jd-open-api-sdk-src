// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ParserFactory.java

package com.jd.open.api.sdk.internal.parser;


// Referenced classes of package com.jd.open.api.sdk.internal.parser:
//            JsonParser, XmlParser, Parser

public class ParserFactory {

    public ParserFactory() {
    }

    public static Parser getJsonParser() {
        return JSON_PARSER;
    }

    public static Parser getXmlParser() {
        return XML_PARSER;
    }

    private static final Parser JSON_PARSER = new JsonParser();
    private static final Parser XML_PARSER = new XmlParser();

}
