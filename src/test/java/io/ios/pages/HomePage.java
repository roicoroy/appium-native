package io.ios.pages;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static io.drivers.IOSDriverManager.getDriver;

public class HomePage {

    private final WebDriverWait wait;

    private static By pickers = AppiumBy.className("XCUIElementTypePickerWheel");

    public HomePage() {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public WebElement openPickerButton() {
        // wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Open
        // Picker\"]"))).click();;
        return getDriver().findElement(
                AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Open Picker\"`]"));
    }

    public WebElement clickOnButton() {
        return getDriver().findElement(
                AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"banner\"`]/XCUIElementTypeButton"));
    }

    public String getActiveLoginTitle() {
        return getDriver().findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Login\"`]"))
                .getText();
    }

    public List<WebElement> getPickersEls() {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
    }

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"WEBDRIVER\"`]"))).getText();
    }

    void openMenu(String menuName) {
        getDriver().findElement(AppiumBy.accessibilityId(menuName)).click();

    }

    public String tagLine() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.accessibilityId("Demo app for the appium-boilerplate"))).getText();
    }

}
