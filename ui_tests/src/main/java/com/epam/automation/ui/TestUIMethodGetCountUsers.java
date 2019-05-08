package com.epam.automation.ui;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class TestUIMethodGetCountUsers {

    private static UIPageObject uiPageObject;
    private static final int COUNT_USERS = 9;

    @BeforeClass
    public static void initialize() {
        uiPageObject = new UIPageObject();
    }

    @AfterClass
    public static void cleanUp() {
        uiPageObject = null;
    }

    @Test
    public void testGetCountUsers() {
        Assert.assertEquals("Verify response", COUNT_USERS, uiPageObject.getCountUsers());
    }


}
