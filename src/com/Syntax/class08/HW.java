package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {

    /*go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled*/
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

// click on checkbox and click on remove

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        String text = message.getText();

        if (text.equals("It's gone!")) {
            System.out.println("Check Box Text is verified");
        } else {
            System.out.println("Check the text");
        }

        WebElement EnableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        EnableBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement message2 = driver.findElement(By.xpath("//p[@id='message']"));
        String EnText = message2.getText();
        if (EnText.equalsIgnoreCase("It's enabled!")) {
            System.out.println("Enable button text confirm");
        }
       WebElement inputTextBox= driver.findElement(By.xpath("//input[@type='text']"));
        inputTextBox.sendKeys("Magic box check");
        WebElement disableBtn=driver.findElement(By.xpath("//button[text()='Disable']"));
disableBtn.click();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
String disMessage=message.getText();
        System.out.println(disMessage);
    }
}