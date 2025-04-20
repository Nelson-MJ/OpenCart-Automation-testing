package pages;

import base.AbstractComponents;
import org.openqa.selenium.*;


public class AppleCinemaPage extends AbstractComponents {
    WebDriver driver;
    public AppleCinemaPage (WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By desktopTab = By.xpath("//a[text()='Desktops']");
    By showAllDesktop = By.xpath("//a[text()='Show All Desktops']");
    By clickProduct = By.xpath("//a[img[@alt='Apple Cinema 30\"']]");
    By rightArrow = By.xpath("//button[@title = 'Next (Right arrow key)']");
    By close = By.xpath("//button[@title = 'Close (Esc)']");
    By reviewSection  = By.xpath("//a[text()='Reviews (0)']");
    By name = By.id("input-name");
    By review = By.id("input-review");
    By reviewRating = By.xpath("//input[@value = '5']");
    By continueBtn  = By.id("button-review");
    By radioBtn = By.xpath("//input[@name = 'option[218]']");
    By checkBox = By.xpath("//input[@name = 'option[223][]']");
    By textBox = By.xpath("//input[@name = 'option[208]']");
    By Select = By.id("input-option217");
    By textArea= By.id("input-option209");
    By uploadBtn = By.id("button-upload222"); // This is the upload trigger button
    By quantity1 = By.xpath("//input[@name = 'quantity']");
    By addToCart = By.xpath("//button[text()='Add to Cart']");
    By goToCart = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
    By checkOut = By.xpath("//strong[text()=' Checkout']");
    By myAccount = By.xpath("//span[text()='My Account']");
    By orderHistory = By.xpath("//a[text()='Order History']");
    By viewOrder = By.xpath("//i[@class='fa fa-eye']");
    By continueView = By.xpath("//a[text()='Continue']");






    public void desktopTab(){
        waitForElementVisible(desktopTab);
        click(desktopTab);
    }
    public void showAllDesktop(){
        waitForElementVisible(showAllDesktop);
        click(showAllDesktop);
    }
    public void clickProduct() throws InterruptedException {
        waitForElementVisible(clickProduct); // Make sure it’s present first
        WebElement product = driver.findElement(clickProduct);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", product);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", product);
    }
    public void clickImage(){
        waitForElementVisible(clickProduct);
        click(clickProduct);
        takeScreenshot("Product Images");
    }

    public void rightArrowImage(){
        waitForElementVisible(rightArrow);
        click(rightArrow);
    }

    public void close(){
        waitForElementVisible(close);
        click(close);
    }

    public void reviewBtn(){
        waitForElementVisible(reviewSection);
        click(reviewSection);
    }

    public void name(String text){
        waitForElementVisible(name);
        sendText(name,text);
    }

    public void review(String text){
        waitForElementVisible(review);
        sendText(review,text);
    }

    public void reviewRating(){
        waitForElementVisible(reviewRating);
        click(reviewRating);
    }

    public void continueBtn(){
        waitForElementVisible(continueBtn);
        click(continueBtn);
    }

    public void radioBtn(){
        waitForElementVisible(radioBtn);
        click(radioBtn);
    }

    public void checkBox(){
        waitForElementVisible(checkBox);
        click(checkBox);
    }

    public void textBox(String text){
        waitForElementVisible(textBox);
        sendText(textBox,text);
    }

    public void selectDropdown(){
        waitForElementVisible(Select);
        WebElement select = driver.findElement(Select);
        selectByValue(select,"3");
    }

    public void textArea(String text){
        waitForElementVisible(textArea);
        sendText(textArea,text);
    }

    public void uploadClick(String filename) throws InterruptedException {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/" + filename;
        WebElement uploadBtnElement = driver.findElement(uploadBtn);
        uploadBtnElement.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement fileInput = (WebElement) js.executeScript(
                "var input = document.querySelector('input[type=file]');" +
                        "if (input) { input.style.display = 'block'; input.style.visibility = 'visible'; } return input;");
        if (fileInput != null) {
            fileInput.sendKeys(filePath);
            handleUploadAlert();
        } else {
            throw new RuntimeException("File input not found after clicking upload.");
        }
    }

    public void date(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('input-option219').value='2023-02-20'");

    }

    public void time(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('input-option221').value = '22:30'");
    }

    public void dateTime(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('input-option220').value = '2030-02-20 22:30'");
    }

    public void quality1(String text){
        waitForElementVisible(quantity1);
        sendText(quantity1,text);
    }

    public void addToCart(){
        waitForElementVisible(addToCart);
        click(addToCart);
    }

    public void goToCart(){
        waitForElementVisible(goToCart);
        click(goToCart);
    }

    public void checkOut(){
        waitForElementVisible(checkOut);
        click(checkOut);
    }

    public void myAccount(){
        waitForElementVisible(myAccount);
        click(myAccount);
    }

    public void orderHistory(){
        waitForElementVisible(orderHistory);
        click(orderHistory);
    }

    public void viewOrder(){
        waitForElementVisible(viewOrder);
        click(viewOrder);
    }

    public void continueView(){
        waitForElementVisible(continueView);
        click(continueView);
    }

}
