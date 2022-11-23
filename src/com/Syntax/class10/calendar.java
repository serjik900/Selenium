package com.Syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendar {
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://delta.com");
//click on the calendar
        driver.findElement(By.xpath("//span[text()='Depart']")).click();

        //get month
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound=false;
while(!isFound){
       String monthName=month.getText();
       if(monthName.equalsIgnoreCase("March")){

           //xpath for table dates column
           List<WebElement> dates=driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
           for(WebElement date:dates){
               String currentDate= date.getText();
               if(currentDate.equalsIgnoreCase("15")){
                   date.click();
                   break;
               }
           }
//found the month
            isFound=true;
        }
        else{
          WebElement nextBtn= driver.findElement(By.xpath("//span[text()='Next']"));
          nextBtn.click();

        }

    }
}}
