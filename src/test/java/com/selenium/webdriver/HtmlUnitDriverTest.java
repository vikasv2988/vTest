package com.selenium.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;


/**
 * Created by vbilenko on 6/4/17.
 */

public class HtmlUnitDriverTest {

    @Test
    public void driverTest() {

        WebDriver driver = new HtmlUnitDriver();

        driver.get("https://vladimirbilenko.herokuapp.com/index.html");
        assertTrue(driver.getTitle().startsWith("Vladimir"));

        System.out.println("Test Completed!");
    }

    @Test
    public void browserTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/vbilenko/development/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://vladimirbilenko.herokuapp.com/index.html");
        assertTrue(driver.getTitle().startsWith("Vladimir"));

        System.out.println("Firefox Test Completed!");
    }

}
