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

    String url = "http://localhost:8081/eMusicStore/";

    @Test
    public void driverTest() {

        WebDriver driver = new HtmlUnitDriver();

        driver.get(url);
        assertTrue(driver.getTitle().startsWith("My Music"));

        System.out.println("HtmlUnitDriver Completed!");
    }

    @Test
    public void browserTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/vbilenko/development/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        assertTrue(driver.getTitle().startsWith("My"));

        System.out.println("vTest Test Completed!");
    }

}
