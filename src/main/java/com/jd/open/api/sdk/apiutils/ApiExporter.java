package com.jd.open.api.sdk.apiutils;

import java.util.List;

/**
 * Created by pingjiang on 14-6-26.
 */
public interface ApiExporter {
    String getSuitName();
    String getVersion();
    String getProvider();

    List<Class<?>> getApiClasses(String group);

    ApiDescriptor getApi(Class<?> clzName);

    void export(String jsonFilePath);
}
