package com.solvd;

import com.solvd.common.pages.HomePage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.Test;

public class TestApp extends AbstractTest {

    @Test
    public void shouldOpenHomePage() {
        HomePage homePage = initPage(getDriver(), HomePage.class);
        homePage.isPageOpened();
    }
}
