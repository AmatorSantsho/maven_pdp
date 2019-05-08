package com.epam.automation.api;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;


@Category(Integration.class)
public class TestRestApiMethodGet {
    private static RestApiObject restApiObject;
    private static final String URL = "google";
    private static final String expectedResponse = "GET: google/response from method get";

    @BeforeClass
    public static void initialize() {
        restApiObject = new RestApiObject();
    }

    @AfterClass
    public static void cleanUp() {
        restApiObject = null;
    }

    @Test
    public void testMethodGet() {
        String response = restApiObject.get(URL);
        Assert.assertEquals("Verify response", expectedResponse, response);
    }
}
