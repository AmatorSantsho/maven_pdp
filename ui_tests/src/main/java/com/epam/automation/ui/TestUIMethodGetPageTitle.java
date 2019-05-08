package com.epam.automation.ui;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class TestUIMethodGetPageTitle {

    private static UIPageObject uiPageObject;
    private static final String URL = "epam";

    @BeforeClass
    public static void initialize() {
        uiPageObject = new UIPageObject();
    }

    @AfterClass
    public static void cleanUp() {
        uiPageObject = null;
    }

    @Test
    public void testGetPageTitle() {
        Assert.assertEquals("Verify response", URL, uiPageObject.getPageTitle(URL));
    }

}
