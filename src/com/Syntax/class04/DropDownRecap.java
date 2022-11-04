package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownRecap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
       //use select class
        Select sel=new Select(day);
//we have three methods to select it
        //select by index
        //sel.selectByIndex(4); will select 5 because index 0

        //select by vvisible text
        //sel.selectByVisibleText("5");

        //select by Value
        sel.selectByValue("5");
//second drpDown the same as first one
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
       Select selMonth=new Select(month);

               selMonth.selectByVisibleText("Jul");

             List<WebElement> Options=selMonth.getOptions();

             //travvese thru the loop and print each element

        for(int i=0;i<Options.size();i++){
            String months=Options.get(i).getText();
            System.out.println(months);
        }

}}
