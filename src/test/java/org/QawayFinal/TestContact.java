package org.QawayFinal;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Pages.HomePage;
import org.QawayFinal.Utility.ExcelReader;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.File;

public class TestContact extends CommonAPI {
    Logger LOG = LogManager.getLogger(TestContact.class.getName());
    ExcelReader excelReader = new ExcelReader(Utility.currentDir+ File.separator+"data"+File.separator+"test-data.xlsx", "data");
   @Test
    public void clickContact() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToContact();
        LOG.info("Contact link is displayed with success");
    }
    @Test
    public void sendMessageWithAllData() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToContact();
        LOG.info("contact link is displayed with success");
        homePage.typeEmail();
        LOG.info("email typed success");
        homePage.typeName();
        LOG.info("name typed success");
        homePage.typeMessage();
        LOG.info("message typed success");
        homePage.messageBtn();
        LOG.info("the message is sent successfully!");
        waitFor(3);
    }
    @Test
    public void sendMessageWithoutEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToContact();
        LOG.info("contact link is displayed with success");
        homePage.typeName();
        LOG.info("name typed success");
        homePage.typeMessage();
        LOG.info("message typed success");
        homePage.messageBtn();
        LOG.info("the message is sent successfully!");
        waitFor(3);
    }
    @Test
    public void sendMessageWithoutName() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToContact();
        LOG.info("contact link is displayed with success");
        homePage.typeEmail();
        LOG.info("email typed success");
        homePage.typeMessage();
        LOG.info("message typed success");
        homePage.messageBtn();
        LOG.info("the message is sent successfully!");
        waitFor(3);
    }
    @Test
    public void sendMessageWithoutMessageText() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToContact();
        LOG.info("contact link is displayed with success");
        homePage.typeEmail();
        LOG.info("email typed success");
        homePage.typeName();
        LOG.info("name typed success");
        homePage.messageBtn();
        LOG.info("the message is sent successfully!");
        waitFor(3);
    }

}
