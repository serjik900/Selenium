package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();


        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@name='color']"));
        //contains 6 elements

        for(WebElement checkBx:checkBoxes){
            String color=checkBx.getAttribute("value");
if(color.equalsIgnoreCase("blue")){
        checkBx.click();
        }

    }
}}
