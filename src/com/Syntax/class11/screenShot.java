package com.Syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //goto the web site
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//username Text Box

        WebElement userName=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);

        WebElement pass=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test",Keys.ENTER);
//take a screenshot
        TakesScreenshot ss=(TakesScreenshot)driver;
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        //save the file from your variable into the location
        FileUtils.copyFile(sourceFile,new File("C:\\Users\\Sergey\\IdeaProjects\\Selenium\\src\\com.Syntax.class11/adminLogin.png"));



}
}
