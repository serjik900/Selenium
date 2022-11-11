package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

       WebElement createNewAccBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
createNewAccBtn.click();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


       WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
       firstName.sendKeys("asdasdas");

    }
}
