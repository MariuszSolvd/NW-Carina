package com.solvd.common.components;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class Header extends AbstractUIObject {

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
