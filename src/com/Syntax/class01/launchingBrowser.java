package com.Syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //get the URL  of WEB site
        String URL=driver.getCurrentUrl();
        //print url
        System.out.println(URL);

        //get the title
        String title = driver.getTitle();
        //printout title
        System.out.println(title);
        //close the chrome
        driver.quit();


      //  driver.navigate().to("http://facebook.com");


    }

}
