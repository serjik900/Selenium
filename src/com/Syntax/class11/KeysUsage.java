package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysUsage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //goto site
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //username Text Box

        WebElement userName=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
userName.sendKeys("Tester", Keys.TAB);

WebElement pass=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
pass.sendKeys("test",Keys.ENTER);

    }
}
