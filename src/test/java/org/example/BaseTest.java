package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
	//tambah komen
    WebDriver driver;
    WebDriverWait w;

    @Before
    public void openBrowser(){
        System.out.println("Before Test");
        // lokasi web driver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        // open web tujuan : midtrans
        //frame home
        driver.get("https://demo.midtrans.com/#");
        driver.manage().window().maximize();
        w = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @After
    public void closeWebBrowser(){
        driver.quit();
    }




}
