package com.Syntax.calss03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement maleRadioButton=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //check if radio button is displayed
        boolean displayedStatus=maleRadioButton.isDisplayed();
        System.out.println("The radio button is displayed: "+displayedStatus);

        // check if radio button is enabled;
        boolean enableStatus=maleRadioButton.isEnabled();
        System.out.println("The radio button is enabled "+enableStatus);

        //check if the radio button male is selected

        boolean selectStatus=maleRadioButton.isSelected();
        System.out.println("The radio button is selected: "+ selectStatus);


        //if not selected click on it
        if(!selectStatus){
            //perform a click operation
            maleRadioButton.click();
        }
        selectStatus=maleRadioButton.isSelected();
        System.out.println("The radio button is selected :"+ selectStatus);

    }
}
