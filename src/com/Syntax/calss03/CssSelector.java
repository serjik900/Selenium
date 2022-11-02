package com.Syntax.calss03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='enter your']"));
        textBox.sendKeys("dfsfsdf");
//press the button show message
WebElement button=driver.findElement(By.cssSelector("button[onclick^='showIn']"));
button.click();

    }
}
