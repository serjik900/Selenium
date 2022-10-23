package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindows {
    public static void main(String[] args) throws InterruptedException {
        // go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        // maximnize

        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();
    }
}
