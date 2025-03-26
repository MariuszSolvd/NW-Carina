package com.solvd.desktop.components;


import com.solvd.common.components.Header;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = Header.class)
public class HeaderWeb extends Header {

    public HeaderWeb(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
