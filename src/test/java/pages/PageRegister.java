package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.AbstractComponents;
import utils.ConfigReader;

public class PageRegister extends AbstractComponents {
    WebDriver driver;

    public PageRegister(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    By myAccount = By.xpath("//span[text() = 'My Account']");
    By register = By.xpath("//a[text() = 'Register']");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By eMail = By.name("email");
    By phone = By.name("telephone");
    By passWord = By.name("password");
    By confirmPass = By.name("confirm");
    By radioBtn = By.xpath("//label[text()='Yes']");
    By termsAgree = By.name("agree");
    By continueBtn = By.cssSelector("input.btn.btn-primary");


    public void open(){
        driver.get(ConfigReader.get("baseUrl"));
    }

    public void myAccount(){
        waitForElementVisible(myAccount);
        click(myAccount);
    }

    public void register(){
        waitForElementVisible(register);
        click(register);
    }

    public void firstname(String name){
        waitForElementVisible(firstName);
        sendText(firstName,name);
    }

    public void lastName(String name){
        waitForElementVisible(lastName);
        sendText(lastName,name);
    }

    public void eMail(String mail){
        waitForElementVisible(eMail);
        sendText(eMail,mail);
    }

    public void phone(String number){
        waitForElementVisible(phone);
        sendText(phone,number);
    }

    public void password(String password){
        waitForElementVisible(passWord);
        sendText(passWord,password);
    }

    public void confirmPass(String password){
        waitForElementVisible(confirmPass);
        sendText(confirmPass,password);
    }

    public void radioBtn(){
        waitForElementVisible(radioBtn);
        click(radioBtn);
    }

    public void termsAgree(){
        waitForElementVisible(termsAgree);
        click(termsAgree);
    }
    public void continueBtn(){
        waitForElementVisible(continueBtn);
        click(continueBtn);
    }

}
