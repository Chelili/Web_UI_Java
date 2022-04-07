import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Homework3_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://5897525.ru/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//strong[contains(., 'Вход / Регистрация')]")).click();

        driver.findElement(By.id("login")).sendKeys("ch3test@yandex.ru");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[.='Войти']")).click();

        driver.findElement(By.xpath("//span[contains(., 'Для кошек')]")).click();
        driver.findElement(By.xpath("//a[.='Консервы для кошек']")).click();
        driver.findElement(By.xpath("//a[.='GLAD CAT']")).click();
        driver.findElement(By.xpath("//a[.='Ягненок, 100г']")).click();
        driver.findElement(By.xpath("//span[contains(.,'Купить')]")).click();
        driver.findElement(By.xpath("//a[.='Оформить заказ']")).click();

        Thread.sleep(3000);

        driver.quit();

    }
}
