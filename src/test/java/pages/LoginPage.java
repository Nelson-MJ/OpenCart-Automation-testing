package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.AbstractComponents;
import utils.ConfigReader;

public class LoginPage extends AbstractComponents {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text() = 'My Account']");
    By loginClick = By.xpath("//a[text()='Login']");
    By email = By.name("email");
    By password = By.name("password");


    public void open(){
        driver.get(ConfigReader.get("baseUrl"));
    }
    public void myAccount(){
        waitForElementVisible(myAccount);
        click(myAccount);
    }

    public void loginClick(){
        waitForElementVisible(loginClick);
        click(loginClick);
    }

    public void eMail(String mail){
        waitForElementVisible(email);
        sendText(email,mail);
    }

    public void password(String pass){
        waitForElementVisible(password);
        sendText(password,pass);
    }















}
