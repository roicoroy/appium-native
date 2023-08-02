package io.ios.tests;

import io.appium.java_client.ios.IOSDriver;
import io.ios.pages.*;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IOSTests extends BaseTest {

    private static final ThreadLocal<IOSDriver> DRIVER = new ThreadLocal<>();

    private String APP_IOS = "https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.app.zip";

    private IOSDriver driver;
    private WebDriverWait wait;


    public static IOSDriver getDriver() {
        return IOSTests.DRIVER.get();
    }

    @Test
    public void testHomePageTitle() {
        HomePage homePage = new HomePage();
        // System.out.println(homePage.getActiveLoginTitle());
        // assertEquals(homePage.getActiveLoginTitle(), "Login");
        homePage.clickOnButton().click();

        try {
            Thread.sleep((1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        homePage.openPickerButton().click();
        
        try {
            Thread.sleep((1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        homePage.getPickersEls().get(0).sendKeys("March");
        homePage.getPickersEls().get(1).sendKeys("6");
    }


}
