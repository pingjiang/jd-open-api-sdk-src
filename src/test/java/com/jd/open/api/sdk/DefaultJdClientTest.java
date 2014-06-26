package com.jd.open.api.sdk;

import com.jd.open.api.sdk.request.address.AreaCityGetRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultJdClientTest {

    private JdClient jdClient;

    @Before
    public void setUp() throws Exception {
        jdClient = new DefaultJdClient("http://gw.api.sandbox.360buy.com/routerjson", "accessToken", "appKey", "appSecret");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testExecute() throws Exception {
        AreaCityGetRequest request = new AreaCityGetRequest();
        request.setParentId(0L);

        jdClient.execute(request);
    }
}