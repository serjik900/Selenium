package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
//enter the user name in the Textbox
        driver.findElement(By.id("email")).sendKeys("serjik900@gmail.com");
//enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("ssdadasdasdg");
//click login
      //  driver.findElement(By.name("login")).click();
//click forgotten password
       // driver.findElement(By.linkText("Forgot password?")).click();
//click on forgotten with partial link
        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
