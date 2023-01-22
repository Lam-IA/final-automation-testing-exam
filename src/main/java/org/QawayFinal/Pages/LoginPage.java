package org.QawayFinal.Pages;

import org.QawayFinal.Base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#loginusername")
    WebElement loginUserName;

    @FindBy(css="#loginpassword")
    WebElement loginPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//button[text()='Log in']//preceding-sibling::button")
    WebElement closeButton;
    @FindBy(css = "#logout2")
    WebElement logoutLink;

    public void clickOnLogoutIcon() {
        clickOn(logoutLink);
    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }
    public void typeUsername() {
        type(loginUserName, "Qaway2023");
    }

    public void typePassword() {
        type(loginPassword, "Bejaia*06");
    }

    public void clickLoginBtn() {
        clickOn(loginButton);
    }
    public void clickCloseBtn() {
        clickOn(closeButton);
    }

    public void typeFakeUsername() {
        type(loginUserName, "qaw20");
    }

    public void typeFakePassword() {
        type(loginPassword, "bej*06");
    }

    public void typeWithoutUsername() {
        type(loginUserName, "");
    }

    public void typeWithoutPassword() {
        type(loginPassword, "");
    }

}
