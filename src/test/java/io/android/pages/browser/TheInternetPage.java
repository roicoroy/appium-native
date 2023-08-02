package io.android.pages.browser;

import org.openqa.selenium.By;

import static io.drivers.AndroidDriverManager.getDriver;

public class TheInternetPage {

    public void navigateToInternetWebsite() {
        getDriver().navigate().to("https://the-internet.herokuapp.com/");
    }

    public String getPageHeader() {
        return getDriver().findElement(By.tagName("h1")).getText();
    }

}
