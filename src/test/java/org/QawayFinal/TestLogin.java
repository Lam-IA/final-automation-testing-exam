package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Pages.LoginPage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestLogin extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogin.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");


   @Test
    public void loginWithValidCredential(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeUsername();
        LOG.info("username entered successfully");
        loginPage.typePassword();
        LOG.info("Password entered successfully");
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");
        Assert.assertTrue(homePage.isLoginLinkDisplayed());
    }
   // @Test
    public void logout(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLogoutIcon();
        Assert.assertTrue(loginPage.isLogoutLinkDisplayed());
    }
    @Test
    public void LoginWithFakeUsername(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeFakeUsername();
        LOG.info("Fake username entered successfully");
        loginPage.typePassword();
        LOG.info("Password entered successfully");
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");

    }
    @Test
    public void LoginWithFakePassword(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeUsername();
        LOG.info("username entered successfully");
        loginPage.typeFakePassword();
        LOG.info("fake password entered successfully");
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");
        Assert.assertTrue(homePage.isLoginLinkDisplayed());

    }
  @Test
    public void LoginWithFakeUserNameAndPassword(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeFakeUsername();
        LOG.info("fake username entered successfully");
        loginPage.typeFakePassword();
        LOG.info("fake password entered successfully");
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");
    }
   @Test
    public void LoginWithEmptyUsename(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeWithoutUsername();
        loginPage.typePassword();
        LOG.info("Password entered successfully");
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");
    }
    @Test
    public void LoginWithEmptyPassword(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeUsername();
        LOG.info("username entered successfully");
        loginPage.typeWithoutPassword();
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");
    }
   @Test
    public void LoginWithEmptyField(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeWithoutUsername();
        loginPage.typeWithoutPassword();
        loginPage.clickLoginBtn();
        LOG.info("login button clicked successfully");

    }
   @Test
    public void CloseLogin(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickOnLoginIcon();
        LOG.info("Login link clicked");
        loginPage.typeUsername();
        LOG.info("username entered successfully");
        loginPage.typePassword();
        LOG.info("Password entered successfully");
        loginPage.clickCloseBtn();
        LOG.info("login Icon closed successfully");

    }

}
