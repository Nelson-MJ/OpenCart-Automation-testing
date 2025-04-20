package tests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import base.BaseTest;

public class TestLogin extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(TestLogin.class);

    @Test
    public void testLogin() throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        login.open();
        login.myAccount();
        login.loginClick();
        login.eMail("example543@gmail.com");
        login.password("example@765");




    }
















}
