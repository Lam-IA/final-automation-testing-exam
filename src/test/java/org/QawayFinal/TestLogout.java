package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogout extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogout.class.getName());
    @Test
    public void validLogout() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(homePage.isSignUpLinkDisplayed());
        Assert.assertTrue(homePage.isLoginLinkDisplayed());
        loginPage.clickOnLogoutIcon();
        Assert.assertTrue(loginPage.isLogoutLinkDisplayed());
    }
}
