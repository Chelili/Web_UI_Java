package dz6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainP extends BaseV {

        public MainP(WebDriver driver) {
            super(driver);
        }

        @FindBy(id = "user-name")
        private WebElement emailField;

        @FindBy(id = "password")
        private WebElement passwordField;

         @FindBy(id = "login-button")
         private WebElement submitButton;

    @Step("Логин")
        public MyCatalogPage login(String email, String pass) {
            webDriverWait.until(ExpectedConditions.visibilityOf(emailField));
            emailField.sendKeys(email);
            passwordField.sendKeys(pass);
            submitButton.click();
            return new MyCatalogPage(driver);
        }
    }
