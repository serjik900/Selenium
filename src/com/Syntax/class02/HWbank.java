package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWbank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
        driver.findElement(By.name("customer.lastName")).sendKeys("Biden");
        driver.findElement(By.name("customer.address.street")).sendKeys("65 Retirement house ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Far Away");
        driver.findElement(By.id("customer.address.state")).sendKeys("Alaska");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("40232");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2772772233");
        driver.findElement(By.id("customer.ssn")).sendKeys("202989898");
        driver.findElement(By.id("customer.username")).sendKeys("GoBrendon");
        driver.findElement(By.id("customer.password")).sendKeys("DontRemember");
        driver.findElement(By.id("repeatedPassword")).sendKeys("DontRemember");
        Thread.sleep(1000);
driver.findElement(By.linkText("Register")).click();
driver.quit();
}}
