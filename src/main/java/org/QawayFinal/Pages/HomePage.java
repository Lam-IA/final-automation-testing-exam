package org.QawayFinal.Pages;

import org.QawayFinal.Base.CommonAPI;
import org.QawayFinal.Utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#signin2")
    WebElement signUpLink;
    @FindBy(css= "#login2")
    WebElement loginLink;

    @FindBy(xpath = "//a[text()='Home ']")
    WebElement homeLink;
    @FindBy(css = "div.carousel-item.active img")
    WebElement activeImage;

    @FindBy(css = "nava")
    WebElement logo;

    @FindBy(css = "a[data-slide='next']")
    WebElement arrowRight;

    @FindBy(css = "a[data-slide='prev']")
    WebElement arrowLeft;
    @FindBy(linkText = "CATEGORIES")
    WebElement categoriesLink;

    @FindBy(linkText = "Phones")
    WebElement phonesLink;

    @FindBy(linkText = "Laptops")
    WebElement laptopsLink;

    @FindBy(linkText = "Monitors")
    WebElement monitorsLink;
    @FindBy(css = "#next2")
    WebElement nextPageButton;
    @FindBy(css = "#prev2")
    WebElement previousPageButton;
    @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[3]/a")
    WebElement aboutUs;

    @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[2]/a")
    WebElement clickOnContact;

    @FindBy(xpath="//*[@id=\"recipient-email\"]")
    WebElement contactEmail;

    @FindBy(xpath="//*[@id=\"recipient-name\"]")
    WebElement contactName;

    @FindBy(xpath="//*[@id=\"message-text\"]")
    WebElement message;

    @FindBy(xpath="//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
    WebElement clickToSendMessage;
    public void clickOnSignUpIcon() {
        clickOn(signUpLink);
    }
    public void clickOnLoginIcon() {
        clickOn(loginLink);
    }


    public void rightSlider() {
        clickOn(arrowRight);
    }

    public void leftSlider() {
        clickOn(arrowLeft);
    }
    public String getImage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return activeImage.getAttribute("alt");
    }
    public String validateHomePageTitle()
    {
        return driver.getTitle();
    }
    public boolean isSignUpLinkDisplayed() {
        return signUpLink.isDisplayed();
    }
    public boolean isLoginLinkDisplayed() {
        return loginLink.isDisplayed();
    }
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }


    public void clickOnCategories() {
        clickOn(categoriesLink);
    }

    public void clickOnPhones() {
        clickOn(phonesLink);
    }

    public void clickOnLaptops() {
        clickOn(laptopsLink);
    }

    public void clickOnMonitors() {
        clickOn(monitorsLink);
    }
    public boolean phonesList(){
        return phonesLink.isDisplayed();
    }
    public boolean laptopsList(){
        return laptopsLink.isDisplayed();
    }
    public boolean monitorsList (){
        return monitorsLink.isDisplayed();
    }
    public void clickOnNext () {
        clickOn(nextPageButton);
    }
    public void clickOnPrevious () {
        clickOn(previousPageButton);
    }

    public void clickToContact() {
        clickOnContact.click();
    }

    public void messageBtn() {
        clickToSendMessage.click();
    }
    public void typeEmail() {
        type(contactEmail, "qaway");
    }
    public void typeName() {
        type(contactName, "lamiaqaway@gmail.com");
    }
    public void typeMessage() {
        type(message, "Hi, there are a good prices on the store!");
    }
    public void clickAboutUs() {
        aboutUs.click();
    }



}
