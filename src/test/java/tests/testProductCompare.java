package tests;

import base.BaseTest;
import base.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.productComparePage;




public class testProductCompare extends BaseTest {
    private static final Logger logger = TestLogger.getLogger();

    @Test
    public void testPage() throws InterruptedException{
    productComparePage page = new productComparePage(driver);
    page.phonesTab();
    page.setAddProduct1();
    Thread.sleep(3000);
    page.setAddProduct2();
    page.setCompareProductBtn();
    logger.info("Comparing 2 Products");
    page.setAddHTCToCart();
    page.setAddToCartBtn();
    page.setAddToCartBtn();
    page.setCheckOut();
    logger.info("Checking out...");
    page.setContinueBtn();
    page.setContinueDeliveryBtn();
    page.setComments("This is a comment");
    page.setDeliveryMethodContinue();
    page.setAgreeCheckBox();
    page.setContinuePayment();
    page.setConfirmBtn();
    page.setFinalContinueBtn();
    logger.info("Order is placed");
    }
}
