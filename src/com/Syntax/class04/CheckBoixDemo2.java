package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoixDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
  // select option 2 checkbox
//find all check boxes
  List< WebElement> checkBoxes =driver.findElements(By.xpath("//input[@class='cb1-element']"));
//traverse through list of checkBoxews to find the desire one

        for(WebElement checkBox:checkBoxes){

            //get atribute value to check if its right option to select
            String optionName= checkBox.getAttribute("value");

            if(!(optionName.equalsIgnoreCase("Option-2"))){
                checkBox.click();
            }

        }
}}
