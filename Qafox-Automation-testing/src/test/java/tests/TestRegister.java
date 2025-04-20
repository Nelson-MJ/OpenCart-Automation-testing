package tests;

import base.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.PageRegister;
import base.BaseTest;

public class TestRegister extends BaseTest {
    private static final Logger logger = TestLogger.getLogger();

    @Override
    public boolean needLogin() {
        return false; // Skip login for register test
    }
    @Override
    public boolean needLogout(){
        return false;
    }

    @Test
    public void testRegister(){
        PageRegister page = new PageRegister(driver);
        page.open();
        page.myAccount();
        logger.info("Creating new Account...");
        page.register();
        logger.info("Entering account details...");
        page.firstname("Nelson");
        page.lastName("Matthew");
        page.eMail("example543@gmail.com");
        page.phone("9876543210");
        System.out.println("Your personal Details have been entered");
        page.password("example@765");
        page.confirmPass("example@765");
        System.out.println("Password has been entered");
        page.radioBtn();
        page.termsAgree();
        page.continueBtn();
        logger.info("Account Created");
        System.out.println("Account created Successfully");

    }
}
