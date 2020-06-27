package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePath {


public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("Rashmi@gmail.com");
    Thread.sleep(3000);
    
    WebElement password=driver.findElement(By.name("pass"));
    password.sendKeys("12345678");
    Thread.sleep(3000);
    
    WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
    login.click();


}



}