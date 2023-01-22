package org.QawayFinal.Pages;

import org.QawayFinal.Base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CartPage.class.getName());

    public CartPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[4]/a")
    WebElement cartLink;
    @FindBy(linkText = "Delete")
    List<WebElement> deleteLink;

    @FindBy(xpath = "//tr[@class='success']/td[3]")
    List<WebElement> price;

    @FindBy(css = "#totalp")
    WebElement totalPrice;

    @FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
    WebElement placeOrderBtn;

    @FindBy(xpath="//*[@id=\"name\"]")
    WebElement name;

    @FindBy(xpath="//*[@id=\"country\"]")
    WebElement country;

    @FindBy(xpath="//*[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath="//*[@id=\"card\"]")
    WebElement card;

    @FindBy(xpath="//*[@id=\"month\"]")
    WebElement month;

    @FindBy(xpath="//*[@id=\"year\"]")
    WebElement year;

    @FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
    WebElement purchaseBtn;


    public void clickOnCartLink() {
        cartLink.click();
    }
    public void clickOnPlaceOrder() {
        placeOrderBtn.click();
    }
    public void clickOnPurchaseBtn() {
        purchaseBtn.click();
    }

    public void typeName() {
        type(name, "Lamia");
    }
    public void typeCountry() {
        type(country, "France");
    }
    public void typeCity() {
        type(city, "Paris");
    }
    public void typeCreditCard() {
        type(card, "3421567812390416");
    }
    public void typeMonth() {
        type(month, "march");
    }
    public void typeYear() {
        type(year, "2027");
    }

    public int getActualPrice() {
        return Integer.parseInt(totalPrice.getText());
    }
}
