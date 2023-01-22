package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.CartPage;
import org.QawayFinal.Pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestPurchase extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestPurchase.class.getName());
    @Test
    public void addToCard(){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.addMacBookProToCard();
    }
}
