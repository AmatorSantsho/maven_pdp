package com.epam.automation.api;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class TestRestAPIMethodDelete {
    private static RestApiObject restApiObject;
    private static final int DELETE_COUNT = 4;
    
    @BeforeClass
    public static void initialize() {
        restApiObject = new RestApiObject();
    }

    @AfterClass
    public static void cleanUp() {
        restApiObject = null;
    }
    @Test
    public  void testMethodDelete(){
        Assert.assertEquals("Verify response", DELETE_COUNT, restApiObject.delete());
    }
}
