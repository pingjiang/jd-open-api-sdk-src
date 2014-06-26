package com.jd.open.api.sdk.apiutils;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDApiExporterTest {

    private ApiExporter apiExporter;

    @Before
    public void setUp() throws Exception {
        apiExporter = new JDApiExporter();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetApiGroups() throws Exception {

    }

    @Test
    public void testGetApiOfGroup() throws Exception {

    }

    @Test
    public void testGetApi() throws Exception {

    }

    @Test
    public void testExport() throws Exception {
        apiExporter.export(null);
    }
}