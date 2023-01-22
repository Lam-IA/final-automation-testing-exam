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

public class TestCategories extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");
    @Test
    public void Categories() {
        HomePage homePage=new HomePage(driver);

        homePage.clickOnCategories();
        LOG.info("categories of products are displayed");
        homePage.clickOnNext();
        LOG.info("next page is displayed");
        waitFor(3);

        homePage.clickOnPrevious();
        LOG.info("previous page is displayed");
        waitFor(3);

    }
    @Test
    public void phoneProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnPhones();
        LOG.info("phone categories is displayed");
        Assert.assertTrue(homePage.phonesList());
        waitFor(2);
    }
    @Test
    public void laptopsProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLaptops();
        LOG.info("laptops categories is displayed");
        Assert.assertTrue(homePage.laptopsList());
        waitFor(3);
    }
    @Test
    public void monitorsProducts(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnMonitors();
        LOG.info("monitors categories is displayed");
        Assert.assertTrue(homePage.monitorsList());
        waitFor(3);
    }

}
