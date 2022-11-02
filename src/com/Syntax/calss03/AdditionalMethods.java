package com.Syntax.calss03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        //find WebElement Butoon
  WebElement btn=driver.findElement(By.cssSelector("button#buttoncheck"));
  //get text from the button
        String text= btn.getText();
//print it
        System.out.println("The text in the button is "+ text);



       String idvalue=btn.getAttribute("id");
        System.out.println("The value of attribute id is: "+idvalue);
}}
