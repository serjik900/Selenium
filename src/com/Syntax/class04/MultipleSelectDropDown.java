package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //goto fb.com
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //find element that cxontains class
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multi-select']"));

        //using select class
        Select sel=new Select(dropDown);

        //By index
        sel.selectByIndex(3);
//by sisible text

        sel.selectByVisibleText("Texas");

        Thread.sleep(1000);

        //deselect by i ndex

        sel.deselectByIndex(3);





        //select all options



        List<WebElement> options=sel.getOptions();

        for(int i=0; i<options.size();i++){
            sel.selectByIndex(i);

        }

        Thread.sleep(1000);

        sel.deselectAll();



        //How to check ifdrop down is multiple

        boolean multiSelect=sel.isMultiple();
        System.out.println(multiSelect);
            }
        }




