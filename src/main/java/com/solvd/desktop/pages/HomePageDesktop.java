package com.solvd.desktop.pages;

import com.solvd.common.components.Header;
import com.solvd.common.pages.HomePage;
import com.solvd.desktop.components.HeaderWeb;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePage.class)
public class HomePageDesktop extends HomePage {

    @FindBy(xpath = "//header")
    private HeaderWeb header;
    @FindBy(xpath = "//div[contains(@class, \"banner\")]")
    private ExtendedWebElement banner;

    public HomePageDesktop(WebDriver driver) {
        super(driver);
        open();
        setUiLoadedMarker(banner);
    }

    @Override
    public Header getHeader() {
        return header;
    }
}
