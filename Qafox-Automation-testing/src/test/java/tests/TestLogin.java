package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import base.BaseTest;

public class TestLogin extends BaseTest{
    @Override
    public boolean needLogin() {
        return false; // Skip login for register test
    }

    @Override
    public boolean needLogout() {
        return false; // Skip login for register test
    }

    @Test
    public void testLogin(){

        LoginPage login = new LoginPage(driver);
        login.open();
        login.myAccount();
        login.loginClick();
        login.eMail("example543@gmail.com");
        login.password("example@765");
        login.login();
        System.out.println("Login Successful");
        login.myAccount();
        login.logout();
        System.out.println("logout Successful");


    }
















}
