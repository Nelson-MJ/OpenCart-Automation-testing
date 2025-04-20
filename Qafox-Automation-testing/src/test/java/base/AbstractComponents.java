package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;


public class AbstractComponents {
    WebDriver driver;
    WebDriverWait wait;

    public AbstractComponents(WebDriver driver){
        this.driver = driver;

    }
    public void waitForElementVisible(By locator){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void selectByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element,String text){
        Select select = new Select(element);
        select.selectByValue(text);

    }

    protected void handleUploadAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert says: " + alert.getText());
            alert.accept(); // or alert.dismiss();
        } catch (Exception e) {
            System.out.println("No alert appeared after upload.");
        }
    }

    public String takeScreenshot(String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + System.currentTimeMillis() + ".png";
        File dest = new File(destPath);
        try {
            org.openqa.selenium.io.FileHandler.copy(src, dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destPath;
    }








}
