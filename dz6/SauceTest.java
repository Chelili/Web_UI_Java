package dz6_1;

import dz6.CustomLog;
import dz6.MainP;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceTest {

    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;


    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new EventFiringDecorator((WebDriverListener) new CustomLog()).decorate(new ChromeDriver());
    }

    @Test
    @Feature("Покупка")
    void addToCartTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        new MainP(driver)
                .login("standard_user","secret_sauce")
                .AddToCartProductByName("Faded","Faded")
                .lname("Student","Student","14000")
                .checkSuccessWithSum("Total: $64.78");


    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
