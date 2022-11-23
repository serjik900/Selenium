package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto amazon.com
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        WebElement enHover=driver.findElement(By.xpath("//div[text()='EN']"));

        //action class

        Actions action=new Actions(driver);
        action.moveToElement(enHover).perform();

    }
}
