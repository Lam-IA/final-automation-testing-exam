package org.QawayFinal.Pages;

import org.QawayFinal.Base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SignUpPage.class.getName());

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#sign-username")
    WebElement signUpUsername;

    @FindBy(css = "#sign-password")
    WebElement signUpPassword;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signUpButton;
    @FindBy(css = "#create_account_error > ol > li")
    WebElement errorMessage;


    public void EnterUsername() {
        type(signUpUsername, "Qaway2023");
        LOG.info("signUp username entered successfully");
    }
    public void EnterPassword() {
        type(signUpPassword, "Bejaia*06");
        LOG.info("signUp password entered successfully");
    }
    public void enterFakePassword() {
        type(signUpPassword, "abcd");
        LOG.info("signUp fake password entered successfully");
    }
    public void EmptyUsername() {
        type(signUpUsername, "");
    }
    public void EmptyPassword() {
        type(signUpPassword, "");
    }
    public void clickSignUpBtn() {
        clickOn(signUpButton);
        LOG.info("signUp button clicked successfully");
    }
    public String getErrorMessage(WebDriver driver){
        waitForElementToBeAvailable(driver,errorMessage);
        return getWebElementText(errorMessage);
    }
}
