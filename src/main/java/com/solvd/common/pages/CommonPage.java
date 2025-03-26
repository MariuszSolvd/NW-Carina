package com.solvd.common.pages;

import com.solvd.common.components.Header;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommonPage extends AbstractPage {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public abstract Header getHeader();
}
