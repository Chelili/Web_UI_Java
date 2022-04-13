package dz5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SaucedemoTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String SAUCEDEMO_BASE_URL = "https://www.saucedemo.com";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(SAUCEDEMO_BASE_URL);
    }

    @Test
    void BuyJacketAndBikeTest() {
        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-bike-light')]")).click();
        driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-fleece-jacket')]")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.name("checkout")).click();
        WebElement element = driver.findElement(By.id("first-name"));
        element.sendKeys("Student");
        driver.findElement(By.id("last-name")).sendKeys("Student");
        driver.findElement(By.id("postal-code")).sendKeys("Student");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.name("finish")).click();

      }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
