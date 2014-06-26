package com.jd.open.api.sdk.apiutils;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;

/**
* Created by pingjiang on 14-6-26.
*/
public class ApiField {
    String name;
    Class<?> type;
    Type genericType;

    public ApiField(String name, Class<?> type, Type genericType) {
        this.name = name;
        this.type = type;
        this.genericType = genericType;
    }

    public void write(Writer writer, boolean last) throws IOException {
        if (type.isArray() || type.getSimpleName().equals("List")) {
            writeList(writer, last);
        } else if (type.isSynthetic() || type.getSimpleName().equals("Map")) {
            writeObject(writer, last);
        } else {
            writer.write(String.format("\t\t\t\"%s\": \"%s\"%s", name, type.getSimpleName(), last ? "" : ", "));
        }
    }

    public void writeArray(Writer writer, boolean last) throws IOException {
        writer.write(String.format("\t\t\t\"%s\": [", name));
        writer.write(" \"" + type.getSimpleName() + "\" ");
        writer.write(']');
        if (!last) writer.write(", ");
    }

    public void writeList(Writer writer, boolean last) throws IOException {
        writeArray(writer, last);
    }

    public void writeMap(Writer writer, boolean last) throws IOException {
        writer.write(String.format("\t\t\t\"%s\": {", name));
        writer.write(" \"" + type.getSimpleName() + "\" ");
        writer.write('}');
        if (!last) writer.write(", ");
    }

    public void writeObject(Writer writer, boolean last) throws IOException {
        writeMap(writer, last);
    }

    @Override
    public String toString() {
        return "ApiField{" +
                "name=" + name +
                ", type=" + type +
                ", genericType=" + genericType +
                '}';
    }
}
