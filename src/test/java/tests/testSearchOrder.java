package tests;

import base.BaseTest;
import base.TestLogger;
import org.apache.logging.log4j.Logger;


import org.testng.annotations.Test;
import pages.SearchOrderPage;

public class testSearchOrder extends BaseTest {
    private static final Logger logger = TestLogger.getLogger();
    @Test
    public void testOrder()throws InterruptedException{
        SearchOrderPage order = new SearchOrderPage(driver);
        logger.info("Searching..");
        order.search("iphone");
        order.searchBtn();
        order.scroll();
        order.wishListClick();
        order.addToCart();
        logger.info("Added to Cart");
        order.purchaseBtn();
        order.viewCart();
        order.qualityInput("2");
        order.refreshQuality();
        logger.info("Entering personal details");
        order.shippingTax();
        order.selectCountryId("India");
        order.region("Tamil Nadu");
        order.postalCode("603001");
        order.checkOutBtn();
        logger.info("testing completed");
    }











}
