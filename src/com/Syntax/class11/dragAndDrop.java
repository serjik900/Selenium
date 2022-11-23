package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //goto site
        driver.get("https://jqueryui.com/droppable/");

        //switch focus to iframe

        driver.switchTo().frame(0);

        //find draggable element

WebElement dragElement=driver.findElement(By.xpath("//div[@id='draggable']"));

//find droppable element

        WebElement dropElement=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        action.dragAndDrop(dragElement,dropElement).perform();

      //  action.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform(); another way to drag


}}
