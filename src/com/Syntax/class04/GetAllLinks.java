package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://ebay.com/");
        driver.manage().window().maximize();
      List< WebElement> eBayList =  driver.findElements(By.tagName("a"));
        System.out.println("the size of the list is: "+eBayList.size());

        //implementing a forr loop to traverse through the list of Wbelements

        for(WebElement eBaylink:eBayList){
            //extracting the value of attribute href because it contains the link embedded in the webelemint
            String link=eBaylink.getAttribute("href");
            //print hte link
            System.out.println(link);
        }

    }}