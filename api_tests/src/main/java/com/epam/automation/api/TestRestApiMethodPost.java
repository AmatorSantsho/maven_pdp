package com.epam.automation.api;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;


@Category(Integration.class)
public class TestRestApiMethodPost {

        private static RestApiObject restApiObject;
        private static final String URL = "google";
        private static final String expectedResponse = "POST: google/response from method post";

        @BeforeClass
        public static void initialize(){
            restApiObject = new RestApiObject();
        }
        @AfterClass
        public static void cleanUp(){
            restApiObject=null;
        }
        @Test
        public void testMethodPost(){
            String response = restApiObject.post(URL);
            Assert.assertEquals("Verify response", expectedResponse, response);
        }
    }

