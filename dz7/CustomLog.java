package dz6;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import java.io.ByteArrayInputStream;

import static org.openqa.selenium.OutputType.BYTES;

public class CustomLog implements WebDriverListener {
         public void beforeFindElement(WebDriver driver, By locator) {
             Allure.step("Ищем элемент по локатору" + locator.toString());
        }

    public void beforeQuit(WebDriver driver) {
        Allure.addAttachment("Cкриншот страницы перед поиском элемента",
                new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(BYTES)));
    }

    }


