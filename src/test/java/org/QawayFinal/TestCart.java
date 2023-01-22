package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.CartPage;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.File;

public class TestCart extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestCart.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");

    @Test
    public void cartNavigatorTest() {
        CartPage cartPage = new CartPage(driver);

        cartPage.clickOnCartLink();
        LOG.info("cart link is displayed with success");
    }
    @Test
    public void placeOrder() {
        CartPage cartPage = new CartPage(driver);

        cartPage.clickOnCartLink();
        LOG.info("cart link is displayed with success");
        cartPage.clickOnPlaceOrder();
        LOG.info("place order is displayed");
        waitFor(3);
    }
    @Test
    public void customerInformation() {
        CartPage cartPage = new CartPage(driver);

        cartPage.clickOnCartLink();
        LOG.info("cart is displayed success");
        cartPage.clickOnPlaceOrder();
        LOG.info("place order is displayed");
        cartPage.typeName();
        LOG.info("name is displayed");
        cartPage.typeCountry();
        LOG.info("country is displayed");
        cartPage.typeCity();
        LOG.info("city is displayed");
        cartPage.typeCreditCard();
        LOG.info("credit card number is displayed");
        cartPage.typeMonth();
        LOG.info("month is displayed");
        cartPage.typeYear();
        LOG.info("year is displayed");
        waitFor(2);

    }

}
