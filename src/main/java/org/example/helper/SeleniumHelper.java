package org.example.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {

    public WebDriver driver;
    public WebDriverWait w;

    public SeleniumHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void setText(By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

}
