package tests;

import base.BaseTest;
import base.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.giftCertificatesPage;


public class testGiftCertificate extends BaseTest {

    @Override
    public boolean needLogout(){
        return false;
    }
    private static final Logger logger = TestLogger.getLogger();
    @Test
    public void testPage ()throws InterruptedException{
        giftCertificatesPage gc = new giftCertificatesPage(driver);

        gc.setHomeClick();
        logger.info("Clicking Home Button");
//        gc.setMacbookClick();
//        gc.setAddToCart();
//        logger.info("Added to cart");
        gc.scroll();
        gc.setGiftClick();
        gc.setRecipientName("JohnDoe");
        gc.setRecipientsEmail("johndoe23@gmail.com");
        gc.setGiftTheme();
        gc.setMessage("Merry Christmas my Friend");
        gc.setAmount("3");
        gc.setAgree();
        gc.setContinueBtn();
        gc.setGoToCart();
        gc.setViewCart();
        gc.setCheckout();
        logger.info("Checking Out");
        gc.setBillingContinue();
        gc.setDeliveryDetailsContinue();
        gc.setDeliveryMethodContinue();
        gc.setAgree1();
        gc.setPaymentMethodContinue();
        gc.setConfirmOrder();
        gc.setFinalContinue();
////        gc.setContactUs();
//        gc.setEnquiry("There is no payment options. Please fix this");
//        logger.info("Reporting Missing feature");
//        gc.setSubmit();
//        gc.setContinueShopping();
        logger.info("Testing successful");

    }
}
