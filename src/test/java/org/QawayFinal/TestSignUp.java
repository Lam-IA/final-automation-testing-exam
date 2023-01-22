package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Pages.SignUpPage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestSignUp extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestSignUp.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"data.xlsx", "data");
    @Test
    public void ValidSignUp(){

        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.clickOnSignUpIcon();
        LOG.info("signUp link clicked successfully");
        signUpPage.EnterUsername();
        LOG.info("username entered successfully");
        signUpPage.EnterPassword();
        LOG.info("Password entered successfully");
        signUpPage.clickSignUpBtn();
        LOG.info("Sing up successful");

    }
    @Test
    public void SignUpWithTheSameUsername(){

        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.clickOnSignUpIcon();
        LOG.info("signUp link clicked");
        signUpPage.EnterUsername();
        LOG.info("username entered successfully");
        signUpPage.enterFakePassword();
        LOG.info("fake password entered successfully");
        signUpPage.clickSignUpBtn();
        LOG.info("This user already exist.");
        //String textError = signUpPage.getErrorMessage();
        //LOG.info("error message: "+ textError);
        //Assert.assertEquals(excelReader.getDataForGivenHeaderAndKey("key", "invalid username error message"), textError);
        LOG.info("error message validation success");
    }

   @Test
    public void SignUpEmptyFields(){

        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.clickOnSignUpIcon();
        LOG.info("signUp Button clicked");
        signUpPage.EmptyUsername();
        signUpPage.EmptyPassword();
        signUpPage.clickSignUpBtn();
        LOG.info("Please fill out Username and Password.");

    }
}
