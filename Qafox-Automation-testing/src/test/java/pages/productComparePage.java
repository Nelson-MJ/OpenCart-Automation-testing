package pages;

import base.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productComparePage extends AbstractComponents {
    WebDriver driver;
    public productComparePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    By phonesTab = By.xpath("//a[text()='Phones & PDAs']");
    By addProduct1 = By.xpath("//a[text()='HTC Touch HD']/ancestor::div[contains(@class,'product-thumb')]//button[contains(@onclick,\"compare.add('28')\")]");
    By addProduct2 = By.xpath("//a[text() ='iPhone']/ancestor::div[contains(@class,'product-thumb')]//button[contains(@onclick,\"compare.add('40')\")]");
    By compareProductBtn = By.id("compare-total");
    By addHTCToCart =  By.xpath("//input[@type='button' and @value='Add to Cart' and contains(@onclick, \"cart.add('28'\")]");
    By removeIphone = By.xpath("//a[contains(@href, 'remove=40') and text()='Remove']");
    By addToCartBtn = By.xpath("//i[@class = 'fa fa-shopping-cart']");
    By checkOut = By.xpath("//a[text()='Checkout']");
    By continueBtn = By.id("button-payment-address");
    By continueDeliveryBtn = By.id("button-shipping-address");
    By comments = By.name("comment");
    By deliveryMethodContinue= By.id("button-shipping-method");
    By agreeCheckBox = By.name("agree");
    By continuePayment = By.id("button-payment-method");
    By confirmBtn = By.id("button-confirm");
    By finalContinueBtn = By.xpath("//a[text()='Continue']");





    public void phonesTab() {
        waitForElementVisible(phonesTab);
        click(phonesTab);
    }

    public void setAddProduct1(){
        waitForElementVisible(addProduct1);
        click(addProduct1);
    }

    public void setAddProduct2(){
        waitForElementVisible(addProduct2);
        click(addProduct2);
    }

    public void setCompareProductBtn(){
        waitForElementVisible(compareProductBtn);
        click(compareProductBtn);
        takeScreenshot("Comparing Products");
    }

    public void setAddHTCToCart(){
        waitForElementVisible(addHTCToCart);
        click(addHTCToCart);
    }

    public void setRemoveIphone(){
        waitForElementVisible(removeIphone);
        click(removeIphone);
    }

    public void setAddToCartBtn(){
        waitForElementVisible(addToCartBtn);
        click(addToCartBtn);
    }

    public void setCheckOut(){
        waitForElementVisible(checkOut);
        click(checkOut);
    }

    public void setContinueBtn(){
        waitForElementVisible(continueBtn);
        click(continueBtn);
    }

    public void setContinueDeliveryBtn(){
        waitForElementVisible(continueDeliveryBtn);
        click(continueDeliveryBtn);
    }

    public void setComments(String text){
        waitForElementVisible(comments);
        sendText(comments,text);
    }

    public void setDeliveryMethodContinue(){
        waitForElementVisible(deliveryMethodContinue);
        click(deliveryMethodContinue);
    }

    public void setAgreeCheckBox(){
        waitForElementVisible(agreeCheckBox);
        click(agreeCheckBox);
    }

    public void setContinuePayment(){
        waitForElementVisible(continuePayment);
        click(continuePayment);
    }

    public void setConfirmBtn(){
        waitForElementVisible(confirmBtn);
        click(confirmBtn);

    }

    public void setFinalContinueBtn(){
        waitForElementVisible(finalContinueBtn);
        click(finalContinueBtn);

    }
}
