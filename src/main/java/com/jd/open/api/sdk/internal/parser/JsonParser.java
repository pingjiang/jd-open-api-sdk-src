// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JsonParser.java

package com.jd.open.api.sdk.internal.parser;

import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.internal.JSON.JSON;
import com.jd.open.api.sdk.internal.util.StringUtil;
import com.jd.open.api.sdk.response.AbstractResponse;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

// Referenced classes of package com.jd.open.api.sdk.internal.parser:
//            Parser

public class JsonParser
        implements Parser {

    public JsonParser() {
        mapper.getDeserializationConfig().set(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.getDeserializationConfig().set(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.getDeserializationConfig().set(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public AbstractResponse parse(String json, Class responseClass)
            throws JdException {
        AbstractResponse response = null;
        try {
            if (StringUtil.isEmpty(json))
                throw new JdException("response json is empty!");
            response = fromJson(json, responseClass);
            if (response != null)
                response.setMsg(json);
        } catch (Exception e) {
            throw new JdException(e);
        }
        return response;
    }

    /**
     * 首先使用jackson库来解析，如果解析失败了，就使用自己的JSON库转换一下
     *
     * @param json
     * @param responseClass
     * @return
     * @throws Exception
     */
    public AbstractResponse fromJson(String json, Class responseClass)
            throws Exception {
        ObjectNode rootNode = null;
        try {
            rootNode = (ObjectNode) mapper.readTree(json);
        } catch (Exception e) {
            rootNode = (ObjectNode) mapper.readTree(JSON.toString(JSON.parse(json)));
        }
        String innerJson = ((JsonNode) ((java.util.Map.Entry) rootNode.getFields().next()).getValue()).toString();
        return (AbstractResponse) mapper.readValue(innerJson, responseClass);
    }

    private final ObjectMapper mapper = new ObjectMapper();
}
