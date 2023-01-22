package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestLogo extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestLogo.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");
   // @Test
    public void LogoVerification() {
        HomePage homePage = new HomePage(driver);
        LOG.info("Validating Logo of DemoBlaze");
        Assert.assertTrue(homePage.isLogoDisplayed());
    }



}
