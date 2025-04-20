package tests;

import base.BaseTest;
import base.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.AppleCinemaPage;

public class testAppleCinema extends BaseTest {
    private static final Logger logger = TestLogger.getLogger();

    @Test
    public void testPage() throws InterruptedException{
        AppleCinemaPage order = new AppleCinemaPage(driver);
        order.desktopTab();
        order.showAllDesktop();
        order.clickProduct();
        logger.info("Viewing product image");
        order.clickImage();
        order.rightArrowImage();
        order.rightArrowImage();
        order.close();
        order.reviewBtn();
        order.name("Nelson");
        order.review("This is an amazing product. I recommend this if you are going to purchase this product");
        order.reviewRating();
        order.continueBtn();
        order.radioBtn();
        order.checkBox();
        order.textBox("Automation Test");
        order.selectDropdown();
        order.textArea("This is a Text");
        order.uploadClick("Sample.txt");
        order.date();
        order.time();
        order.dateTime();
        order.quality1("2");
        logger.info("Added to cart");
        order.addToCart();
        order.goToCart();
        order.checkOut();
        order.myAccount();
        order.orderHistory();
        logger.info("Viewing order history");
        order.viewOrder();
        order.continueView();
        order.continueView();
        logger.info("Page tested Successfully");

    }
}
