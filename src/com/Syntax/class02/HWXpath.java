package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
//enter the user name
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        //
        driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("afsafaf");
    }
}
