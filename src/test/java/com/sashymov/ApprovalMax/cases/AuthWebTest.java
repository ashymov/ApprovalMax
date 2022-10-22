package com.sashymov.ApprovalMax.cases;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthWebTest {
    WebDriver driver = new ChromeDriver();


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver.manage().window().maximize();
        driver.get("https://portal.kundoluk.kg/");

    }

    @Test
    public void authTest() throws InterruptedException {


        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("43350681");
        password.sendKeys("43350681");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
    }
}
