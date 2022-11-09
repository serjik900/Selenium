package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWEbay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
       WebElement category = driver.findElement(By.xpath("//select[@name='_sacat']"));
               Select sel=new Select(category);
        List<WebElement> Options=sel.getOptions();

        //travvese thru the loop and print each element

        for(int i=0;i<Options.size();i++){
            String categories=Options.get(i).getText();
            if(!(categories.equalsIgnoreCase("All Categories"))){
            System.out.println(categories);}

}
        sel.selectByValue("58058");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        System.out.println("****************************************************************************");
if(driver.getTitle().equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
    System.out.println(driver.getTitle());
}

    }}
