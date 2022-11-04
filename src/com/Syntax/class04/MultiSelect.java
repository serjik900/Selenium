package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;

public class MultiSelect {
    public static void main(String[] args) throws InterruptedException {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver = new ChromeDriver();
//        open the Syntax HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");

//       When user sends in the username Admin
                WebElement userName = driver.findElement(By.id("txtUsername"));
//        send the user name
        userName.sendKeys("Admin");

//        Then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");

//        Then user clicks on login Button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        //then verify that the error "invalid credential"
//get the error message
        WebElement errorMSG=driver.findElement(By.xpath("//span[@id='spanMessage']"));
       String error=errorMSG.getText();
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("the correct Error message is there");
        }
}}
