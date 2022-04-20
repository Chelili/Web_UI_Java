package dz6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyCatalogPage extends BaseV {
    public MyCatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@name, 'sauce-labs-bike-light')]")
    private WebElement LabsBike;
    @FindBy(xpath = "//button[contains(@name, 'sauce-labs-fleece-jacket')]")
    private WebElement LabsFleeceJacket;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement Cart;
    @FindBy(name = "checkout")
    private WebElement Checkout;


    @Step("Добавить продукт в корзину")
    public MyPersonalData AddToCartProductByName(String Bike, String Jacket ) {
        LabsBike.click();
        LabsFleeceJacket.click();
        Cart.click();
        Checkout.click();
        return new MyPersonalData(driver);
    }
}

