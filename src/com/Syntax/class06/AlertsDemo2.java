package com.Syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("https://the-internet.herokuapp.com/basic_auth/");
        driver.manage().window().maximize();
}}
