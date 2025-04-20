package pages;

import base.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchOrderPage extends AbstractComponents {
    WebDriver driver;

    public SearchOrderPage(WebDriver driver) {
        super(driver);
        this.driver =driver;
    }


    By search = By.name("search");
    By searchBtn = By.xpath("//button[@class = 'btn btn-default btn-lg']");
    By wishListClick = By.xpath("//button[i[@class='fa fa-heart']]");
    By addToCart = By.xpath("//button[@onclick=\"cart.add('40', '1');\"]");
    By purchaseBtn = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
    By viewCart = By.xpath("//strong[text() = ' View Cart']");
    By quantityInput = By.xpath("//input[@class='form-control']");
    By refreshQuality = By.xpath("//button[@data-original-title='Update']");
    By shippingTax = By.xpath("//a[text()='Estimate Shipping & Taxes ']");
    By country = By.id("input-country");
    By regionState = By.id("input-zone");
    By postalCode = By.id("input-postcode");
    By checkOutBtn = By.xpath("//a[@href='https://awesomeqa.com/ui/index.php?route=checkout/checkout']");





    public void search(String text){
        waitForElementVisible(search);
        sendText(search,text);
        takeScreenshot("SearchBar");
    }

    public void searchBtn(){
        waitForElementVisible(searchBtn);
        click(searchBtn);
    }

    public void wishListClick(){
        waitForElementVisible(wishListClick);
        click(wishListClick);
    }

    public void addToCart(){
        waitForElementVisible(addToCart);
        click(addToCart);
    }

    public void purchaseBtn(){
        waitForElementVisible(purchaseBtn);
        click(purchaseBtn);
    }

    public void viewCart(){
        waitForElementVisible(viewCart);
        click(viewCart);
    }

    public void qualityInput(String text){
        waitForElementVisible(quantityInput);
        sendText(quantityInput,text);
    }

    public void refreshQuality(){
        waitForElementVisible(refreshQuality);
        click(refreshQuality);
    }

    public void shippingTax(){
        waitForElementVisible(shippingTax);
        click(shippingTax);
    }

    public void selectCountryId(String text){
        waitForElementVisible(country);
        WebElement SelectCountry = driver.findElement(country);
        selectByVisibleText(SelectCountry,text);

    }

    public void region(String text) throws InterruptedException{
        waitForElementVisible(regionState);
        WebElement selectRegion = driver.findElement(regionState);
        Thread.sleep(2000);
        selectByVisibleText(selectRegion,text);
    }

    public void postalCode(String text){
        waitForElementVisible(postalCode);
        sendText(postalCode,text);
    }
    public void checkOutBtn(){
        waitForElementVisible(checkOutBtn);
        click(checkOutBtn);
        takeScreenshot("Order Placed");
    }









}
