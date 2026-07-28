package com.madhu.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();

        //FirefoxOptions options = new FirefoxOptions();

        //ptions.addArguments("--headless");

        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Google opened successfully");

        driver.quit();
    }
}