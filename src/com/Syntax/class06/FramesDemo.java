package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com

        driver.get("https://chercher.tech/practice/frames");

//        Task 1: Print the animals on screen and then  Select Baby Cat From The drop Down

//Step1: switch to the frame using by index
                driver.switchTo().frame(1);
//        find the  text animals and print on screen
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);



        //checkbox

        //switch to default
        driver.switchTo().defaultContent();
        //switch to the frame containin sub
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("sdasdsad");

        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
checkBox.click();
    }
}
