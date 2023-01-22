package org.QawayFinal;


import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.File;

public class TestAbout extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestAbout.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");
    @Test
    public void aboutUs(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAboutUs();
        LOG.info("about us link is displayed");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js .executeScript("document.getElementById(\"example-video_html5_api\").play()");
        LOG.info("video played with success");
        waitFor(10);

    }

}

