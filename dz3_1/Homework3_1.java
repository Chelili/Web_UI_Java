import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Homework3_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

      driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-bike-light')]")).click();
        Thread.sleep(1000);
      driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-fleece-jacket')]")).click();
        Thread.sleep(1000);

      driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(1000);
      driver.findElement(By.name("checkout")).click();
        Thread.sleep(1000);

      WebElement element = driver.findElement(By.id("first-name"));
      element.sendKeys("Student");
      driver.findElement(By.id("last-name")).sendKeys("Student");
      driver.findElement(By.id("postal-code")).sendKeys("Student");
      driver.findElement(By.id("continue")).click();
      Thread.sleep(1000);

      driver.findElement(By.name("finish")).click();
      Thread.sleep(5000);

    driver.quit();

    }
}
