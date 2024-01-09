package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class PageBase {
    public WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnElement(By elementlocator) {
        WaitForElementPresence(elementlocator);
        ScorllToElementView(elementlocator);
        driver.findElement(elementlocator).click();

    }

    public void DisplayElement(By elementlocator) {
        WaitForElementPresence(elementlocator);
        ScorllToElementView(elementlocator);
        driver.findElement(elementlocator).isDisplayed();
    }
    public void EnterText (By elementlocator, String text){
        WaitForElementPresence(elementlocator);
        ScorllToElementView(elementlocator);
        driver.findElement(elementlocator).sendKeys(text);
    }

    public void WaitForElementPresence(By elementlocator){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(elementlocator));
    }

    public void ScorllToElementView (By elementlocator){
        WebElement element = driver.findElement(elementlocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);

    }

}
