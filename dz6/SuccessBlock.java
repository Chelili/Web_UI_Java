package dz6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;


public class SuccessBlock extends BaseV {

    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement sumElement;

    private final static String successIconXpathLocator = "//button[@class ='btn btn_action btn_medium cart_button']";
    @FindBy(id="finish")
    private WebElement successIcon;

    @Step("Проверить корректность суммы заказа")
    public void checkSuccessWithSum(String summ) {
        webDriverWait.until(ExpectedConditions.visibilityOf(successIcon));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successIconXpathLocator)));

        Assertions.assertAll(
                () -> assertThat(driver.findElement(By.xpath("//div[@class='summary_total_label']")), hasText(summ)),
                () -> assertThat(driver.findElement(By.id("finish")), isDisplayed())
        );
    }
}

