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

public class TestActiveImage extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestActiveImage.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");

    @Test
    public void rightToArrowSlider () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String Image;
        Image = homePage.getImage();
        homePage.rightSlider();
        Assert.assertNotEquals(homePage.getImage(), Image);
        LOG.info("right slide is displayed");
        homePage.leftSlider();
        Assert.assertEquals(homePage.getImage(), Image);
        LOG.info("left slide is displayed");
    }
    @Test
    public void leftToRightArrowSlider () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String Image;
        Image = homePage.getImage();
        homePage.leftSlider();
        Assert.assertNotEquals(homePage.getImage(), Image);
        LOG.info("left slide is displayed");
        homePage.rightSlider();
        Assert.assertEquals(homePage.getImage(), Image);
        LOG.info("right slide is displayed");
    }
}
