package tests;
import org.testng.annotations.Test;
import pages.PageRegister;
import base.BaseTest;

public class TestRegister extends BaseTest{
    @Test
    public void testRegister() throws InterruptedException{
        PageRegister page = new PageRegister(driver);
        page.open();
        page.myAccount();
        page.register();
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
        System.out.println("Account created Successfully");

    }
}
