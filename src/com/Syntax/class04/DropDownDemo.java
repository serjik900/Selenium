package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
WebElement dropDown = driver.findElement(By.

        xpath("//select[@id='select-demo']"));
Select select=new Select(dropDown);
//select an option by index
              select.selectByIndex(5);
              //select by visible text
        select.selectByVisibleText("Saturday");


        Thread.sleep(3000);
        //select by value
        select.selectByValue("Monday");

        //get all options avaliable in the dropdown
        List<WebElement> options=select.getOptions();
for(int i=0; i<options.size();i++){
    WebElement option=options.get(i);
    System.out.println(option.getText());
    String text=option.getText();
    if(text.equalsIgnoreCase("Friday")){

        select.selectByIndex(i);
    }
}

    }}
