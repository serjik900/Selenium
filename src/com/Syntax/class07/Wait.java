package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();



            driver.get("https://www.syntaxprojects.com/dynamic-elements-loading.php");

            driver.manage().window().maximize();

            WebElement createNewAccBtn=driver.findElement(By.id("startButton"));
            createNewAccBtn.click();

            //find the text
          String text =  driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']")).getText();
            System.out.println("The text is"+text);
    }
}
