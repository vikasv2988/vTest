package com.selenium.webdriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private final static Logger logger = LogManager.getLogger(HtmlUnitDriverTest.class);

    @Test
    public void driverTest() {

        WebDriver driver = new HtmlUnitDriver();

        driver.get(url);
        assertTrue(driver.getTitle().startsWith("My Music"));

        logger.info("I am info!");
        logger.debug("I am debug");

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
