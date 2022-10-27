package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
//enter the user name
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MyName");
        //xPath by text
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        //xPath by contains method
        driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();
        

    }
}