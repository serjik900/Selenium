package com.Syntax.Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //create an instance
        WebDriver driver=new ChromeDriver();
        //open the facebook
        driver.get("https://coinmarketcap.com/");
        // quit the bbrowser

driver.manage().window().maximize();
Thread.sleep(500);
driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
        Thread.sleep(200);
driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();

Thread.sleep(200);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("serhiidia@gmail.com");

        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("10s43");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
    }
}
