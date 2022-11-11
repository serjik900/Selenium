package com.Syntax.reviewClass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//open demoqa Alerts
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

       WebElement alertBtn=driver.findElement(By.id("alertButton"));
       alertBtn.click();

       //alert interface
       Alert alert1=driver.switchTo().alert();
       alert1.accept();

       WebElement alertBtn2=driver.findElement(By.xpath("//button[@id='promtButton']"));
       alertBtn2.click();

       alert1.sendKeys("hello");
       Thread.sleep(1000);
alert1.accept();
    }
}
