package com.madhu.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GoogleTest {

    @Test
    public void openGoogle() {

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        
        Assert.assertTrue(
                driver.getTitle().contains("Google"),
                "Google title validation failed"
            );

        System.out.println("Google opened successfully");

        driver.quit();
    }
}