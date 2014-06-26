package com.jd.open.api.sdk.apiutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pingjiang on 14-6-26.
 */
public class ApiBody {
    List<ApiField> fields = new ArrayList<ApiField>();

    public void addField(String name, Class<?> type, Type genericType) {
        fields.add(new ApiField(name, type, genericType));
    }

    public void write(BufferedWriter writer) throws IOException {
        final int len = getFields().size();
        for (int i = 0; i < len; i++) {
            ApiField apiField = getFields().get(i);
            apiField.write(writer, i == (len - 1));
            writer.newLine();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiBody{");
        for (ApiField apiField : fields) {
            sb.append(apiField).append(", \n");
        }
        sb.append("}");
        return sb.toString();
    }

    public List<ApiField> getFields() {
        return fields;
    }
}
