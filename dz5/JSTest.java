package dz5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUpBrowser() {
        driver = new ChromeDriver();
        driver.get("https://ya.ru/");
    }

    @Test
    void jsExecuteTest() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.alert('Test');");
        Alert alert = driver.switchTo().alert();
        alert.accept();


        clickWithJs(driver, driver.findElement(By.xpath("//button")));

    }

    private void clickWithJs(WebDriver driver, WebElement element) {
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
