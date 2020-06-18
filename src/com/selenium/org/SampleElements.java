package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleElements {
	
public static void main(String[] args) throws InterruptedException, IOException{
	
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	WebElement email=driver.findElement(By.id("email"));
	boolean displayed=email.isDisplayed();
	System.out.println(displayed);
	
	email.sendKeys("Rashmi.gmail.com");
	String attribute=email.getAttribute("value");
	System.out.println(attribute);
	Thread.sleep(3000);
	
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("123456");
	String attribute2=password.getAttribute("type");
	System.out.println(attribute2);
	Thread.sleep(3000);
	
	WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
	boolean enabled=login.isEnabled();
	System.out.println(enabled);
	login.click();

	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	File desfile=new File("C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\test1.png") ;
    FileUtils.copyFile(srcfile, desfile);
}
}
}
