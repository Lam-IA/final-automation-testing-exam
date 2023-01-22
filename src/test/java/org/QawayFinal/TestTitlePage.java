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

public class TestTitlePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestTitlePage.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"data.xlsx", "data");

    @Test
    public void TitlePagVerification() {

        HomePage homePage = new HomePage(driver);
        try
        {
            Assert.assertEquals(homePage.validateHomePageTitle(), "PRODUCT STORE");
            LOG.info("page title validation success");
        }
        catch(Exception e)
        {
            LOG.info("Title page fail");
        }
    }

}
