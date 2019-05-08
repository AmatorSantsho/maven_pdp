package com.epam.automation.ui;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class TestUIMethodGetUserName {

    private static UIPageObject uiPageObject;
    private static final String USER_NAME = "UserName";

    @BeforeClass
    public static void initialize() {
        uiPageObject = new UIPageObject();
    }

    @AfterClass
    public static void cleanUp() {
        uiPageObject = null;
    }

    @Test
    public void testUserName() {
        Assert.assertEquals("Verify response", USER_NAME, uiPageObject.getUserName());
    }


}
