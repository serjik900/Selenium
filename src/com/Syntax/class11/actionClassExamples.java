package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClassExamples {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto sebsite

       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

       WebElement rightClickBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();


      WebElement editBtn=  driver.findElement(By.xpath("//span[text()='Edit']"));

      editBtn.click();
driver.switchTo().alert().accept();
Actions act=new Actions(driver);

WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(doubleClick).perform();

driver.switchTo().alert().accept();
    }
}
