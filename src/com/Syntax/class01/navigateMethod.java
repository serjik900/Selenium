package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //go to google.com
        //go to facebook.com
        //go back to google.com
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //create the Webdriver instance
        WebDriver driver = new ChromeDriver();
        //go to google
        driver.get("http://google.com");
//navigating to facebook.com
        driver.navigate().to("http://www.facebook.com");
        //introduce some sleep which is wait
        Thread.sleep(2000);
//go back to google.com
        driver.navigate().back();
        //wait for 2 seconds
        Thread.sleep(2000);
        //go back to fb
        driver.navigate().forward();
        //wait
        Thread.sleep(1000);
        //refresh
        driver.navigate().refresh();
        //quit
        driver.quit();
    }
}
