package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWFB {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
driver.findElement(By.linkText("Create new account")).click();

Thread.sleep(2000);
driver.findElement(By.name("firstname")).sendKeys("Sergey");


driver.findElement(By.name("lastname")).sendKeys("LastName");


        driver.findElement(By.name("reg_email__")).sendKeys("serrewr@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("serrewr@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("sdgeg435tt4tr");

driver.findElement(By.name("websubmit")).click();
driver.quit();

    }
}
