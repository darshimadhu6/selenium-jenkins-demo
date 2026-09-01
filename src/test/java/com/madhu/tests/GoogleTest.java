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
    	
    	String browser = System.getProperty("browser","firefox");
    	WebDriver driver;

    	if (browser.equalsIgnoreCase("firefox")) {
    		
    		WebDriverManager.firefoxdriver().setup();

            FirefoxOptions options = new FirefoxOptions();

            options.addArguments("--headless");
            driver = new FirefoxDriver(options);
    		
    	}
    	else {
    		
    		 throw new IllegalArgumentException(
    	                "Unsupported browser: " + browser
    	        );
    	}

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        
        Assert.assertTrue(
        		 driver.getTitle().contains("Google"),
                 "Google title validation our test failed"
            );

        System.out.println("Google opened successfully using: " + browser);

        driver.quit();
    }
}
