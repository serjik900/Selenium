package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        enter the username in the text box
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("admin");
//        enter the password
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

       WebElement pimBtn=driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();
driver.findElement(By.linkText("Employee List")).click();
List<WebElement> secondColumn=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
for(int i=0;i<secondColumn.size();i++){
    String columnData=secondColumn.get(i).getText();
    if(columnData.equalsIgnoreCase("42093A")){
        WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
        checkBox.click();
    }

}

}}
