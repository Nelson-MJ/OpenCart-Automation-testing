package pages;

import base.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class giftCertificatesPage extends AbstractComponents {
    WebDriver driver;

    public giftCertificatesPage(WebDriver driver){
        super(driver);
        this.driver= driver;
    }

    By homeClick = By.xpath("//img[@alt='TheTestingAcademy eCommerce']");
    By macbookClick = By.xpath("//a[text()='MacBook']");
    By addToCart = By.xpath("//button[text()='Add to Cart']");
    By giftClick = By.xpath("//a[text()='Gift Certificates']");
    By recipientName = By.id("input-to-name");
    By recipientsEmail = By.id("input-to-email");
    By giftTheme = By.xpath("//label[text()='\n" +
            "                Christmas']");
    By message = By.id("input-message");
    By amount = By.id("input-amount");
    By agree = By.name("agree");
    By continueBtn = By.xpath("//input[@class='btn btn-primary']");
    By goToCart = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
    By viewCart = By.xpath("//strong[text()=' View Cart']");
    By checkout = By.xpath("//a[text()='Checkout']");
    By BillingContinue = By.xpath("//div[@class='pull-right']");
    By deliveryDetailsContinue = By.id("button-shipping-address");
    By deliveryMethodContinue = By.id("button-shipping-method");
    By agree1 = By.name("agree");
    By paymentMethodContinue = By.id("button-payment-method");
    By confirmOrder = By.id("button-confirm");
//    By contactUs =By.xpath("//a[text()='contact us']");
    By enquiry = By.id("input-enquiry");
    By submit = By.xpath("//input[@value='Submit']");
    By continueShopping = By.xpath("//a[text()='Continue']");
    By finalContinue = By.xpath("//a[text()='Continue']");









    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }

    public void setHomeClick(){
        waitForElementVisible(homeClick);
        click(homeClick);
    }

    public void setMacbookClick(){
        waitForElementVisible(macbookClick);
        click(macbookClick);
    }

    public void setAddToCart(){
        waitForElementVisible(addToCart);
        click(addToCart);
    }

    public void setGiftClick(){
        waitForElementVisible(giftClick);
        click(giftClick);
    }

    public void setRecipientName(String name){
        waitForElementVisible(recipientName);
        sendText(recipientName,name);
    }

    public void setRecipientsEmail(String email){
        waitForElementVisible(recipientsEmail);
        sendText(recipientsEmail,email);
    }

    public void setGiftTheme(){
        waitForElementVisible(giftTheme);
        click(giftTheme);
    }

    public void setMessage(String text){
        waitForElementVisible(message);
        sendText(message,text);
    }

    public void setAmount(String text){
        waitForElementVisible(amount);
        sendText(amount,text);
    }

    public void setAgree(){
        waitForElementVisible(agree);
        click(agree);
    }

    public void setContinueBtn(){
        waitForElementVisible(continueBtn);
        click(continueBtn);
    }

    public void setGoToCart(){
        waitForElementVisible(goToCart);
        click(goToCart);
    }

    public void setViewCart(){
        waitForElementVisible(viewCart);
        click(viewCart);
    }

    public void setCheckout(){
        waitForElementVisible(checkout);
        click(checkout);
    }

    public void setBillingContinue(){
        waitForElementVisible(BillingContinue);
        click(BillingContinue);
    }

    public void setDeliveryDetailsContinue(){
        waitForElementVisible(deliveryDetailsContinue);
        click(deliveryDetailsContinue);
    }

    public void setDeliveryMethodContinue(){
        waitForElementVisible(deliveryMethodContinue);
        click(deliveryMethodContinue);
    }

    public void setAgree1(){
        waitForElementVisible(agree1);
        click(agree1);
    }

    public void setPaymentMethodContinue(){
        waitForElementVisible(paymentMethodContinue);
        click(paymentMethodContinue);
    }

    public void setConfirmOrder(){
        waitForElementVisible(confirmOrder);
        click(confirmOrder);
    }

    public void setFinalContinue(){
        waitForElementVisible(finalContinue);
        click(finalContinue);
    }

//    public void setContactUs(){
//        waitForElementVisible(contactUs);
//        takeScreenshot("Reporting Missing Payment Feature");
//        click(contactUs);
//    }

    public void setEnquiry(String text){
        waitForElementVisible(enquiry);
        sendText(enquiry,text);
    }

    public void setSubmit(){
        waitForElementVisible(submit);
        click(submit);
        takeScreenshot("Reported Missing feature");
    }

    public void setContinueShopping(){
        waitForElementVisible(continueShopping);
        click(continueShopping);
    }















}
