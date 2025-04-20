package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AbstractComponents {
    WebDriver driver;
    WebDriverWait wait;

    public AbstractComponents(WebDriver driver){
        this.driver = driver;

    }
    public void waitForElementVisible(By locator){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated( locator));
    }
    public void sendText(By locator,String text){
        waitForElementVisible(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public void click(By locator){
        waitForElementVisible(locator);
        driver.findElement(locator).click();
    }
    public void sleep() throws InterruptedException{
        Thread.sleep(5000);
    }








}
