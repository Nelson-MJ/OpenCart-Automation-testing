package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.ConfigReader;
import org.apache.logging.log4j.Logger;


public class BaseTest {
    protected WebDriver driver;

    private static final Logger logger = TestLogger.getLogger();

    public boolean needLogin() {
        return true;
    }
    public boolean needLogout() {
        return true;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        logger.info("Starting test setup...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        if (needLogin()) {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            loginPage.myAccount();
            loginPage.loginClick();
            loginPage.eMail(ConfigReader.get("email"));
            loginPage.password(ConfigReader.get("password"));
            loginPage.login();
            System.out.println("Login Successful");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (needLogout()) {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.myAccount();
            loginPage.logout();
            System.out.println("Logout Successful");
            logger.info("Closing browser...");
        }
            driver.quit();
    }
}
