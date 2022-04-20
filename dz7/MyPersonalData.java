package dz6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyPersonalData extends BaseV {
    public MyPersonalData(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement First_name;

    @FindBy(id = "last-name")
    private WebElement Lastname;

    @FindBy(id = "postal-code")
    private WebElement Postalcode;

    @FindBy(id = "continue")
    private WebElement Continue;

    @FindBy(id = "finish")
    private WebElement Finish;


    @Step("Заполняем личные данные")
    public SuccessBlock lname(String fname, String lname, String pcode) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.visibilityOf(First_name));
        First_name.sendKeys(fname);
        Lastname.sendKeys(lname);
        Postalcode.sendKeys(pcode);
        Continue.click();
        return new SuccessBlock(driver);

    }
}

